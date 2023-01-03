/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.projectsap.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mohammad Tauheed
 */
public class Sapdb {

    private static final String DATABASE = "sap_db";
    private static final String DBURL = "jdbc:mysql://localhost/" + DATABASE;
    private static final String USER = "root";
    private static final String PASS = "12345";

    public static Connection connectdb() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DBURL, USER, PASS);
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("com.sap.project.database.Sapdb.connectdb() : " + e.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) {
        connectdb();
    }
}
