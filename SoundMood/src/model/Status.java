package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe referente a um tipo de <b>status</b> escolhido de um usuário no sistema.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Richard
 * @author Leylane Ferreira
 * @author Washington Filipe 
 */
@Entity
@Table(name = "STATUS")
public class Status implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue
    
    /** Id do status. */
    private int id;
    /** Nome do status. */
    private String nometag;
    /** Descrição do status. */
    private String descricao;
    
    /**
     * Getter para pegar o valor da id do humor.
     * @return Retorna o valor da propriedade.
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
     * Getter para pegar o valor do tag do humor.
     * @return Retorna o valor da propriedade.
     */
    public String getNometag() {
        return nometag;
    }

    /**
     * Setter para alterar o valor de nometag.
     * @param nometag Valor a ser alterado em nometag.
     */
    public void setNometag(String nometag) {
        this.nometag = nometag;
    }

    /**
     * Getter para pegar o valor da descricão do humor.
     * @return Retorna o valor da propriedade.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Setter para alterar o valor da descricão.
     * @param descricao Valor a ser alterado em descricão.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
