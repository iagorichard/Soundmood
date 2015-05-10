/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author biancamoreira
 */
@Entity
@Table(name = "CALCULA")
public class Calcula implements Serializable {
    
    @Id
    @Column(name = "musicaid")
    @GeneratedValue
    
    private int musicaid;
    private int moodid;
    private int statusid;
    
    public Calcula(){
    }

    /**
     * @return the musicaid
     */
    public int getMusicaid() {
        return musicaid;
    }

    /**
     * @param musicaid the musicaid to set
     */
    public void setMusicaid(int musicaid) {
        this.musicaid = musicaid;
    }

    /**
     * @return the moodid
     */
    public int getMoodid() {
        return moodid;
    }

    /**
     * @param moodid the moodid to set
     */
    public void setMoodid(int moodid) {
        this.moodid = moodid;
    }

    /**
     * @return the statusid
     */
    public int getStatusid() {
        return statusid;
    }

    /**
     * @param statusid the statusid to set
     */
    public void setStatusid(int statusid) {
        this.statusid = statusid;
    }
    
    
    
    
}
