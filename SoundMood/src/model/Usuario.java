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
 * @author Leylane Ferreira
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue

    private int id;
    private String username;
    private String tipo;
    private String nome;
    private String email;
    private String senha;
    private String senhadica;

    private int tagmoodid;
    private int tagstatusid;

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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the senhadica
     */
    public String getSenhadica() {
        return senhadica;
    }

    /**
     * @param senhadica the senhadica to set
     */
    public void setSenhadica(String senhadica) {
        this.senhadica = senhadica;
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
     * @return the tagstatusid
     */
    public int getTagstatusid() {
        return tagstatusid;
    }

    /**
     * @param tagstatusid the tagstatusid to set
     */
    public void setTagstatusid(int tagstatusid) {
        this.tagstatusid = tagstatusid;
    }

    public void setTipo(int tipoConta) {
        throw new UnsupportedOperationException("Not supported yet.");
    //To change body of generated methods, choose Tools | Templates.
    }

}
