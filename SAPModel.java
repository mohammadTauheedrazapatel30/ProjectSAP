/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.projectsap.model;

/**
 *
 * @author Mohammad Tauheed
 */
public class SAPModel {
    
    private Long id;
    private String sapId;  
    private String name;
    private String email;
    private String textarea;
    private Integer isDeleted;
    private String create_at;

    public SAPModel() {
    }

    public SAPModel(Long id, String sapId, String name, String email, String textarea, Integer isDeleted, String create_at) {
        this.id = id;
        this.sapId = sapId;
        this.name = name;
        this.email = email;
        this.textarea = textarea;
        this.isDeleted = isDeleted;
        this.create_at = create_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSapId() {
        return sapId;
    }

    public void setSapId(String sapId) {
        this.sapId = sapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    @Override
    public String toString() {
        return "SAPModel{" + "id=" + id + ", sapId=" + sapId + ", name=" + name + ", email=" + email + ", textarea=" + textarea + ", isDeleted=" + isDeleted + ", create_at=" + create_at + '}';
    }
}
