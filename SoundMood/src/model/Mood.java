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
@Table(name = "MOOD")
public class Mood implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue
    
    private int id;
    private String nometag;
    private String descricao;

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

    /**
     * @return the nometag
     */
    public String getNometag() {
        return nometag;
    }

    /**
     * @param nometag the nometag to set
     */
    public void setNometag(String nometag) {
        this.nometag = nometag;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
       
}
