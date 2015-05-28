package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe referente à um tipo de <b>humor</b> do sistema.
 *
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
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
     * Getter para pegar o valor de id.
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
     * Getter para pegar o valor de nometag.
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
     * Getter para pegar o valor de descricao.
     * @return Retorna o valor da propriedade.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Setter para alterar o valor de descricao.
     * @param descricao Valor a ser alterado em descricao.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
       
}
