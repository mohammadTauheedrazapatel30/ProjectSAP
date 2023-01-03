/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.projectsap.dao;

import com.sap.projectsap.database.Sapdb;
import com.sap.projectsap.model.SAPModel;
import com.sap.projectsap.model.enums.ResponseMessages;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mohammad Tauheed
 */
public class SAPDAO {

    String sql = null;
    public static final String TABLENAME = "Tbl_SAP";

    public ArrayList<SAPModel> findall() {
        ArrayList<SAPModel> sap = new ArrayList<>();

        Connection con = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        sql = "select * from Tbl_SAP where is_deleted=0";
        try {
            con = Sapdb.connectdb();
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                sap.add(new SAPModel(
                        rs.getLong("id"),
                        rs.getString("sap_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("textarea"),
                        rs.getInt("is_deleted"),
                        rs.getString("create_at")
                )
                );
            }
        } catch (Exception e) {
            System.out.println("com.sap.projectsap.dao.SAPDAO.findall()" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;

                if (rs != null) {
                    rs.close();
                }
                rs = null;

            } catch (SQLException e) {
            }
        }
        return sap;
    }

    public String save(SAPModel sapmodel) {
        String message = null;
        Connection con = Sapdb.connectdb();
        CallableStatement cs = null;
        try {
            sql = "insert into Tbl_SAP (name,email,textarea,sap_id,is_deleted) values(?,?,?,?,?)";
            cs = con.prepareCall(sql);
            cs.setString(1, sapmodel.getName());
            cs.setString(2, sapmodel.getEmail());
            cs.setString(3, sapmodel.getTextarea());
            cs.setString(4, sapmodel.getSapId());
            cs.setInt(5, sapmodel.getIsDeleted());

            int rows = cs.executeUpdate();
            if (rows >= 1) {
                // message = "Data Added Successfully";
                message = ResponseMessages.DATA_ADDED.getMessage();
            }
        } catch (SQLException e) {
            //message = "Unable to add data"; 
            message = ResponseMessages.UNABLE_TO_ADD.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;
            } catch (SQLException e) {
                message = e.getMessage();
            }
        }
        return message;
    }

    public String delete(SAPModel sapmodel) {
        String message = null;
        Connection con = null;
        CallableStatement cs = null;
        sql = "delete from Tbl_SAP where id = ?";
        try {
            con = Sapdb.connectdb();
            cs = con.prepareCall(sql);
            cs.setLong(1, sapmodel.getId());
            int rows = cs.executeUpdate();
            if (rows >= 1) {
                // message = "Data Deleted Successfully";
                message = ResponseMessages.DATA_DELETED.getMessage();
            }
        } catch (Exception e) {
//            message = "Unable to Delete the Data";
            message = ResponseMessages.UNABLE_TO_DELETE.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;
            } catch (SQLException e) {
            }
        }
        return message;
    }

    public SAPModel findById(Integer id) {
        SAPModel sapmodel = null;
        Connection con = Sapdb.connectdb();

        CallableStatement cs = null;
        ResultSet rs = null;
        sql = "select * from Tbl_SAP where id = ?";
        try {
            cs = con.prepareCall(sql);
            cs.setInt(1, id);
            rs = cs.executeQuery();
            while (rs.next()) {
                sapmodel = new SAPModel(
                        rs.getLong("id"),
                        rs.getString("sap_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("textarea"),
                        rs.getInt("is_deleted"),
                        rs.getString("create_at")
                );
            }
        } catch (Exception e) {
            System.out.println("com.sap.projectsap.dao.SAPDAO.findById()");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return sapmodel;
    }

    public SAPModel findBySAPId(String sapId) {
        SAPModel sapmodel = null;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        sql = "select * from Tbl_SAP where sap_id = ?";
        try {
            con = Sapdb.connectdb();
            cs = con.prepareCall(sql);
            cs.setString(1, sapId);
            rs = cs.executeQuery();
            while (rs.next()) {
                sapmodel = new SAPModel(
                        rs.getLong("id"),
                        rs.getString("sap_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("textarea"),
                        rs.getInt("is_deleted"),
                        rs.getString("create_at")
                );
            }
        } catch (Exception e) {
            System.out.println("com.sap.projectsap.dao.SAPDAO.findById()" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;

                if (rs != null) {
                    rs.close();
                }
                rs = null;

            } catch (Exception e) {
            }
        }
        return sapmodel;
    }

    public String update(SAPModel sapmodel) {
        String message = null;
        Connection con = null;
        CallableStatement cs = null;
        sql = "update Tbl_SAP set name = ?, email = ?, textarea = ?, is_deleted = ? where sap_id = ?";
        try {
            con = Sapdb.connectdb();
            cs = con.prepareCall(sql);

//            cs.setString(1,sapmodel.getSapId());
            cs.setString(1, sapmodel.getName());
            cs.setString(2, sapmodel.getEmail());
            cs.setString(3, sapmodel.getTextarea());
            cs.setInt(4, sapmodel.getIsDeleted());
            cs.setString(5, sapmodel.getSapId());

            int rows = cs.executeUpdate();
            if (rows >= 1) {
//                message = "Data Updated Successfully";
                message = ResponseMessages.DATA_UPDATED.getMessage();
            }
        } catch (SQLException e) {
//            message = "Unable to update";
            message = ResponseMessages.UNABLE_TO_UPDATE.getMessage() + e.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;
            } catch (SQLException e) {
            }
        }
        return message;
    }

    public Integer getSAPCount() {
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        Integer totalCount = 0;
        String sql = "select count(*)+1 as total from Tbl_SAP";
        try {
            con = Sapdb.connectdb();
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                totalCount = rs.getInt("total");
            }
        } catch (Exception e) {
            System.out.println("com.sap.projectsap.dao.SAPDAO.getSAPCount()");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;

                if (rs != null) {
                    rs.close();
                }
                rs = null;
            } catch (Exception e) {
            }
        }
        return totalCount;
    }

    public SAPModel findByEmail(String email) {
        SAPModel sapmodel = null;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = "select * from Tbl_SAP where email = ?";
        try {
            con = Sapdb.connectdb();
            cs = con.prepareCall(sql);
            cs.setString(1, email);
            rs = cs.executeQuery();
            while (rs.next()) {
                sapmodel = new SAPModel(
                        rs.getLong("id"),
                        rs.getString("sap_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("textarea"),
                        rs.getInt("is_deleted"),
                        rs.getString("create_at")
                );
            }
        } catch (Exception e) {
            sapmodel = null;
            System.out.println("com.sap.projectsap.dao.SAPDAO.findByEmail()");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;

                if (rs != null) {
                    rs.close();
                }
                rs = null;
            } catch (Exception e) {
            }
        }
        return sapmodel;
    }
}
