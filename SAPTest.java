/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.projectsap.SAPTest;

import com.sap.projectsap.model.SAPModel;
import com.sap.projectsap.service.SAPService;
import java.util.ArrayList;

/**
 *
 * @author Mohammad Tauheed
 */
public class SAPTest {
    public static void main(String[] args) {
        SAPTest sapTest = new SAPTest();
        SAPModel sapmodel = new SAPModel();
        
        sapmodel.setName("Zahida Patel");
        sapmodel.setEmail("zahedapatel@gmail.com");
        sapmodel.setTextarea("Hello everyone");
        
        System.out.println(sapTest.save(sapmodel));
        
        sapTest.findall();
    }
   
    public void findall(){
        SAPService sapservice = new SAPService();
        
        ArrayList<SAPModel> sapm = sapservice.findall();
        if(sapm.isEmpty()){
            System.out.println("No Data Found");
        }else{
            for(SAPModel saps : sapm){
                System.out.println(saps);
            }
        }
    }
    
    public String save(SAPModel sapmodel){
        SAPService sapservice = new SAPService();
        return sapservice.save(sapmodel);
    }
}
