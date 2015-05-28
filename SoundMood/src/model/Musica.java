package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe referente a uma <b>música</b> do sistema.
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
     * Getter para pegar o valor da id da música.
     * @return Valor da propriedade.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter para alterar o valor de id.
     * @param id Valor a ser alterado em id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter para pegar o valor do nome da música.
     * @return Valor da propriedade.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter para alterar o valor de nome.
     * @param nome Valor a ser alterado em nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter para pegar o valor do nome do artista da música.
     * @return Valor da propriedade.
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Setter para alterar o valor de artista.
     * @param artista Valor a ser alterado em artista.
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Getter para pegar o valor do path de localização da música.
     * @return Valor da propriedade.
     */
    public String getPathurl() {
        return pathurl;
    }

    /**
     * Setter para alterar o valor de pathurl.
     * @param pathurl Valor a ser alterado em pathurl.
     */
    public void setPathurl(String pathurl) {
        this.pathurl = pathurl;
    }
       
}
