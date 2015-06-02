package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe referente a um <b>usuário</b> do sistema.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Richard
 * @author Leylane Ferreira
 * @author Washington Filipe 
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue

    /** ID do usuário. */
    private int id;
    /** USERNAME do usuário. */
    private String username;
    /** TIPO de usuário. */
    private String tipo;
    /** NOME completo do usuário. */
    private String nome;
    /** E-MAIL do usuário. */
    private String email;
    /** SENHA do usuário. */
    private String senha;
    /** DICA da SENHA do usuário. */
    private String senhadica;
    /** ID do ATUAL HUMOR do usuário. */
    private int tagmoodid;
    /** ID do ATUAL STATUS do usuário. */
    private int tagstatusid;

    /**
     * Getter para pegar o valor do id do usuário.
     * @return Retorna do valor da propriedade.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter para alterar o valor do id.
     * @param id Valor a ser alterado em id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter para pegar o valor d username do usuário.
     * @return Retorna do valor da propriedade.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter para alterar o valor de username.
     * @param username Valor a ser alterado em username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter para pegar o valor do tipo de usuário.
     * @return Retorna do valor da propriedade.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter para alterar o valor de tipo.
     * @param tipo Valor a ser alterado em tipo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Getter para pegar o valor do nome do usuário.
     * @return Retorna do valor da propriedade.
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
     * Getter para pegar o valor do e-mail do usuário.
     * @return Retorna do valor da propriedade.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter para alterar o valor de email.
     * @param email Valor a ser alterado em email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter para pegar o valor da senha do usuário.
     * @return Retorna do valor da propriedade.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Setter para alterar o valor de senha.
     * @param senha Valor a ser alterado em senha.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Getter para pegar o valor da dica de senha do usuário.
     * @return Retorna do valor da propriedade.
     */
    public String getSenhadica() {
        return senhadica;
    }

    /**
     * Setter para alterar o valor de senhadica.
     * @param senhadica Valor a ser alterado em senhadica.
     */
    public void setSenhadica(String senhadica) {
        this.senhadica = senhadica;
    }

    /**
     * Getter para pegar o valor da id do humor do usuário.
     * @return Retorna do valor da propriedade.
     */
    public int getTagmoodid() {
        return tagmoodid;
    }

    /**
     * Setter para alterar o valor de tagmoodid.
     * @param tagmoodid Valor a ser alterado em tagmoodid.
     */
    public void setTagmoodid(int tagmoodid) {
        this.tagmoodid = tagmoodid;
    }

    /**
     * Getter para pegar o valor da id do status do usuário.
     * @return Retorna do valor da propriedade.
     */
    public int getTagstatusid() {
        return tagstatusid;
    }

    /**
     * Setter para alterar o valor de tagstatusid.
     * @param tagstatusid Valor a ser alterado em tagstatusid.
     */
    public void setTagstatusid(int tagstatusid) {
        this.tagstatusid = tagstatusid;
    }
    
    /**
     * Setter para alterar o valor de tipoConta.
     * @param tipoConta Valor a ser alterado em tipoConta.
     */
    public void setTipo(int tipoConta) {
        throw new UnsupportedOperationException("Not supported yet.");
    //To change body of generated methods, choose Tools | Templates.
    }

}
