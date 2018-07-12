/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "refeicoes", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Refeicoes.findAll", query = "SELECT r FROM Refeicoes r")
    , @NamedQuery(name = "Refeicoes.findByIdRefeicao", query = "SELECT r FROM Refeicoes r WHERE r.idRefeicao = :idRefeicao")
    , @NamedQuery(name = "Refeicoes.findByIdEscola", query = "SELECT r FROM Refeicoes r WHERE r.idEscola = :idEscola")
    , @NamedQuery(name = "Refeicoes.findByData", query = "SELECT r FROM Refeicoes r WHERE r.data = :data")
    , @NamedQuery(name = "Refeicoes.findByRefei\u00e7\u00e3o", query = "SELECT r FROM Refeicoes r WHERE r.refei\u00e7\u00e3o = :refei\u00e7\u00e3o")
    , @NamedQuery(name = "Refeicoes.findBySegmento", query = "SELECT r FROM Refeicoes r WHERE r.segmento = :segmento")
    , @NamedQuery(name = "Refeicoes.findByQtdRefeicao", query = "SELECT r FROM Refeicoes r WHERE r.qtdRefeicao = :qtdRefeicao")
    , @NamedQuery(name = "Refeicoes.findByQtdRepeticao", query = "SELECT r FROM Refeicoes r WHERE r.qtdRepeticao = :qtdRepeticao")})
public class Refeicoes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_refeicao")
    private Integer idRefeicao;
    @Column(name = "id_escola")
    private String idEscola;
    @Column(name = "data")
    private String data;
    @Column(name = "refei\u00e7\u00e3o")
    private String refeição;
    @Column(name = "segmento")
    private String segmento;
    @Column(name = "qtd_refeicao")
    private Integer qtdRefeicao;
    @Column(name = "qtd_repeticao")
    private Integer qtdRepeticao;

    public Refeicoes() {
    }

    public Refeicoes(Integer idRefeicao) {
        this.idRefeicao = idRefeicao;
    }

    public Integer getIdRefeicao() {
        return idRefeicao;
    }

    public void setIdRefeicao(Integer idRefeicao) {
        Integer oldIdRefeicao = this.idRefeicao;
        this.idRefeicao = idRefeicao;
        changeSupport.firePropertyChange("idRefeicao", oldIdRefeicao, idRefeicao);
    }

    public String getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(String idEscola) {
        String oldIdEscola = this.idEscola;
        this.idEscola = idEscola;
        changeSupport.firePropertyChange("idEscola", oldIdEscola, idEscola);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getRefeição() {
        return refeição;
    }

    public void setRefeição(String refeição) {
        String oldRefeição = this.refeição;
        this.refeição = refeição;
        changeSupport.firePropertyChange("refei\u00e7\u00e3o", oldRefeição, refeição);
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        String oldSegmento = this.segmento;
        this.segmento = segmento;
        changeSupport.firePropertyChange("segmento", oldSegmento, segmento);
    }

    public Integer getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(Integer qtdRefeicao) {
        Integer oldQtdRefeicao = this.qtdRefeicao;
        this.qtdRefeicao = qtdRefeicao;
        changeSupport.firePropertyChange("qtdRefeicao", oldQtdRefeicao, qtdRefeicao);
    }

    public Integer getQtdRepeticao() {
        return qtdRepeticao;
    }

    public void setQtdRepeticao(Integer qtdRepeticao) {
        Integer oldQtdRepeticao = this.qtdRepeticao;
        this.qtdRepeticao = qtdRepeticao;
        changeSupport.firePropertyChange("qtdRepeticao", oldQtdRepeticao, qtdRepeticao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRefeicao != null ? idRefeicao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Refeicoes)) {
            return false;
        }
        Refeicoes other = (Refeicoes) object;
        if ((this.idRefeicao == null && other.idRefeicao != null) || (this.idRefeicao != null && !this.idRefeicao.equals(other.idRefeicao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Refeicoes[ idRefeicao=" + idRefeicao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
