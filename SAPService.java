/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.projectsap.service;

import com.sap.projectsap.dao.SAPDAO;
import com.sap.projectsap.model.SAPModel;
import com.sap.projectsap.model.enums.ResponseMessages;
import com.sap.projectsap.utilities.Utils;
import java.util.ArrayList;

/**
 *
 * @author Mohammad Tauheed
 */
public class SAPService {

    private final SAPDAO sapDAO = new SAPDAO();
    private final Utils utils = new Utils();

    public ArrayList<SAPModel> findall() {
        return sapDAO.findall();
    }

    public String save(SAPModel sapmodel) {
        SAPModel sapModel = sapDAO.findByEmail(sapmodel.getEmail());
        if (sapModel != null) {
            throw new RuntimeException(ResponseMessages.ALREADY_REGISTERED.getMessage());
        }
        String sapId = utils.generateSAPId(30);
        Integer isDeleted = 0;

        sapmodel.setSapId(sapId);
        sapmodel.setIsDeleted(isDeleted);
        return sapDAO.save(sapmodel);
    }

    public String delete(String sapid) {
        SAPModel sapmodel = sapDAO.findBySAPId(sapid);
        if (sapmodel == null) {
            return ResponseMessages.USER_NOT_FOUND_WITH_ID.getMessage();
        }
        Integer isDeleted = 1;
        sapmodel.setIsDeleted(isDeleted);
        return sapDAO.update(sapmodel);
    }

    public SAPModel findById(Integer id) {
        return sapDAO.findById(id);
    }

    public SAPModel findBySAPId(String sapId) {
        return sapDAO.findBySAPId(sapId);
    }

    public String update(SAPModel sapmodel) {
        SAPModel existingsapModel = sapDAO.findBySAPId(sapmodel.getSapId());
        if (existingsapModel == null) {
            throw new RuntimeException(ResponseMessages.USER_NOT_FOUND_WITH_ID.getMessage());
        }

        existingsapModel.setName(sapmodel.getName());
        existingsapModel.setEmail(sapmodel.getEmail());
        existingsapModel.setTextarea(sapmodel.getTextarea());


        existingsapModel.setIsDeleted(1);

        return sapDAO.update(existingsapModel);
    }

    public Integer getSapCount() {
        return sapDAO.getSAPCount();
    }
}
