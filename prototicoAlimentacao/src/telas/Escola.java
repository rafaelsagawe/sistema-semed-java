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
@Table(name = "escola", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Escola.findAll", query = "SELECT e FROM Escola e")
    , @NamedQuery(name = "Escola.findById", query = "SELECT e FROM Escola e WHERE e.id = :id")
    , @NamedQuery(name = "Escola.findByNmEscola", query = "SELECT e FROM Escola e WHERE e.nmEscola = :nmEscola")
    , @NamedQuery(name = "Escola.findByCodInep", query = "SELECT e FROM Escola e WHERE e.codInep = :codInep")
    , @NamedQuery(name = "Escola.findByDiretorecao", query = "SELECT e FROM Escola e WHERE e.diretorecao = :diretorecao")
    , @NamedQuery(name = "Escola.findByPrestadora", query = "SELECT e FROM Escola e WHERE e.prestadora = :prestadora")})
public class Escola implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nm_escola")
    private String nmEscola;
    @Column(name = "cod_inep")
    private Integer codInep;
    @Basic(optional = false)
    @Column(name = "diretorecao")
    private String diretorecao;
    @Column(name = "prestadora")
    private String prestadora;

    public Escola() {
    }

    public Escola(Integer id) {
        this.id = id;
    }

    public Escola(Integer id, String diretorecao) {
        this.id = id;
        this.diretorecao = diretorecao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNmEscola() {
        return nmEscola;
    }

    public void setNmEscola(String nmEscola) {
        String oldNmEscola = this.nmEscola;
        this.nmEscola = nmEscola;
        changeSupport.firePropertyChange("nmEscola", oldNmEscola, nmEscola);
    }

    public Integer getCodInep() {
        return codInep;
    }

    public void setCodInep(Integer codInep) {
        Integer oldCodInep = this.codInep;
        this.codInep = codInep;
        changeSupport.firePropertyChange("codInep", oldCodInep, codInep);
    }

    public String getDiretorecao() {
        return diretorecao;
    }

    public void setDiretorecao(String diretorecao) {
        String oldDiretorecao = this.diretorecao;
        this.diretorecao = diretorecao;
        changeSupport.firePropertyChange("diretorecao", oldDiretorecao, diretorecao);
    }

    public String getPrestadora() {
        return prestadora;
    }

    public void setPrestadora(String prestadora) {
        String oldPrestadora = this.prestadora;
        this.prestadora = prestadora;
        changeSupport.firePropertyChange("prestadora", oldPrestadora, prestadora);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escola)) {
            return false;
        }
        Escola other = (Escola) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Escola[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
