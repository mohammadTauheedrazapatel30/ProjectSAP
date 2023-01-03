/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.projectsap.controller;

import com.sap.projectsap.model.SAPModel;
import com.sap.projectsap.model.enums.ResponseMessages;
import com.sap.projectsap.service.SAPService;
import com.sap.projectsap.utilities.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohammad Tauheed
 */
@WebServlet(name = "SAPController", urlPatterns = {"/SAPController"})
public class SAPController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    SAPService sapservice = new SAPService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String message = null;
        SAPModel sapmodel = new SAPModel();

        String action = request.getParameter("action");
        switch (action) {
            case "insert":
                try {
                sapmodel.setName(Utils.requireNonNull(request.getParameter("name"), ResponseMessages.ENTER_YOUR_NAME.getMessage()));
                sapmodel.setEmail(Utils.requireNonNull(request.getParameter("email"), ResponseMessages.ENTER_YOUR_EMAIL.getMessage()));
                sapmodel.setTextarea(Utils.requireNonNull(request.getParameter("textarea"), ResponseMessages.ENTER_YOUR_CONTEXT.getMessage()));

                message = sapservice.save(sapmodel);
            } catch (Exception e) {
                message = e.getMessage();
            } finally {
                response.sendRedirect("contact.jsp?message=" + message);
            }
            break;
            case "delete":
                String sapId = Utils.requireNonNull(request.getParameter("sap_id"), ResponseMessages.ID_CAN_BE_EMPTY.getMessage());
                message = sapservice.delete(sapId);
                response.sendRedirect("contact.jsp?message=" + message);
                break;
            case "update":
                try {
                sapmodel.setName(request.getParameter("name"));
                sapmodel.setEmail(request.getParameter("email"));
                sapmodel.setTextarea(request.getParameter("textarea"));
                sapmodel.setSapId(request.getParameter("sap_id"));
                message = sapservice.update(sapmodel);
            } catch (Exception e) {
                message = e.getMessage();
            } finally {
                response.sendRedirect("contact.jsp?message=" + message);
            }
            break;
            default:
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("We are here at GET");
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("We are here at POST");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public ArrayList<SAPModel> findall() {
        return sapservice.findall();
    }

    public SAPModel findById(Integer id) {
        return sapservice.findById(id);
    }

    public SAPModel findBySAPId(String sapId) {
        return sapservice.findBySAPId(sapId);
    }
}
