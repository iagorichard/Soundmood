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
    @Column(name = "idcalcula")
    @GeneratedValue
    
    private int idcalcula;
    private int idmusica;
    private int tagmoodid;
    private int statustagid;
    
    public Calcula(){
    }

    /**
     * @return the idcalcula
     */
    public int getIdcalcula() {
        return idcalcula;
    }

    /**
     * @param idcalcula the idcalcula to set
     */
    public void setIdcalcula(int idcalcula) {
        this.idcalcula = idcalcula;
    }

    /**
     * @return the musicaid
     */
    public int getIdmusica() {
        return idmusica;
    }

    /**
     * @param musicaid the musicaid to set
     */
    public void setIdmusica(int musicaid) {
        this.idmusica = musicaid;
    }

    /**
     * @return the tagmoodid
     */
    public int getTagmoodid() {
        return tagmoodid;
    }

    /**
     * @param tagmoodid the tagmoodid to set
     */
    public void setTagmoodid(int tagmoodid) {
        this.tagmoodid = tagmoodid;
    }

    /**
     * @return the statustagid
     */
    public int getStatustagid() {
        return statustagid;
    }

    /**
     * @param statustagid the statustagid to set
     */
    public void setStatustagid(int statustagid) {
        this.statustagid = statustagid;
    }

    
    
}
