package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe responsável pelo cálculo da playlist.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
@Entity
@Table(name = "CALCULA")
public class Calcula implements Serializable {
    
    @Id
    @Column(name = "idcalcula")
    @GeneratedValue
    
    /** Id de música retornado após os cálculos de recomendação. */
    private int idcalcula;
    /** Id de música retornado após os cálculos de recomendação. */
    private int musicaid;
    /** Id do mood retornado após os cálculos de recomendação. */
    private int tagmoodid;
    /** Id do status retornado após os cálculos de recomendação. */
    private int statustagid;
    
    /** Construtor simples para a classe. */
    public Calcula(){
    }

    /**
     * Getter para idcalcula
     * @return Retorna o valor da propriedade.
     */
    public int getIdcalcula() {
        return idcalcula;
    }

    /**
     * Setter para idcalcula
     * @param idcalcula Valor a ser setado.
     */
    public void setIdcalcula(int idcalcula) {
        this.idcalcula = idcalcula;
    }

    /**
     * Getter para musicaId
     * @return Retorna o valor da propriedade.
     */
    public int getMusicaid() {
        return musicaid;
    }

    /**
     * Setter para musicaid
     * @param musicaid Valor a ser setado.
     */
    public void setMusicaid(int musicaid) {
        this.musicaid = musicaid;
    }

    /**
     * Getter para tagmoodid
     * @return Retorna o valor da propriedade.
     */
    public int getTagmoodid() {
        return tagmoodid;
    }

    /**
     * Setter para tagmoodid
     * @param tagmoodid Valor a ser setado.
     */
    public void setTagmoodid(int tagmoodid) {
        this.tagmoodid = tagmoodid;
    }

    /**
     * Getter para statustagid
     * @return Retorna o valor da propriedade.
     */
    public int getStatustagid() {
        return statustagid;
    }

    /**
     * Setter para statustagid
     * @param statustagid Valor a ser setado.
     */
    public void setStatustagid(int statustagid) {
        this.statustagid = statustagid;
    }

}
