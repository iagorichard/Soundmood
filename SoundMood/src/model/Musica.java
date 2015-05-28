package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe referente a uma música do sistema.
 *
 * @author biancamoreira
 * @author Iago Richard
 * @author Leylane Ferreira
 * @author Washigton Filipe 
 */
@Entity
@Table(name = "MUSICA")
public class Musica implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue
    
    private int id;
    private String nome;
    private String artista;
    private String pathurl;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the pathurl
     */
    public String getPathurl() {
        return pathurl;
    }

    /**
     * @param pathurl the pathurl to set
     */
    public void setPathurl(String pathurl) {
        this.pathurl = pathurl;
    }
       
}
