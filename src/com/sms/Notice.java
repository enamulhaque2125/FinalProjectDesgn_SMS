/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms;

/**
 *
 * @author saift
 */
public class Notice {
    private int id;
    private String noticepublished;

    /**
     * @return the noticepublished
     */
    public String getNoticepublished() {
        return noticepublished;
    }

    /**
     * @param noticepublished the noticepublished to set
     */
    public void setNoticepublished(String noticepublished) {
        this.noticepublished = noticepublished;
    }
    
    public Notice(int id, String noticepublished){
        this.id = id;
        this.noticepublished = noticepublished;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
