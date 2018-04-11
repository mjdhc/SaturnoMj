/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_etapas_t")
@NamedQueries({
    @NamedQuery(name = "MjEtapasT.findAll", query = "SELECT m FROM MjEtapasT m")
    , @NamedQuery(name = "MjEtapasT.findByIdetapas", query = "SELECT m FROM MjEtapasT m WHERE m.idetapas = :idetapas")
    , @NamedQuery(name = "MjEtapasT.findByEtapas", query = "SELECT m FROM MjEtapasT m WHERE m.etapas = :etapas")
    , @NamedQuery(name = "MjEtapasT.findByEstadoetapa", query = "SELECT m FROM MjEtapasT m WHERE m.estadoetapa = :estadoetapa")})
public class MjEtapasT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idetapas")
    private Integer idetapas;
    @Size(max = 50)
    @Column(name = "etapas")
    private String etapas;
    @Column(name = "estadoetapa")
    private Boolean estadoetapa;
    @OneToMany(mappedBy = "idetapas")
    private Collection<MjLugarT> mjLugarTCollection;
    @JoinColumn(name = "idcentro", referencedColumnName = "idcentro")
    @ManyToOne
    private MjCentroT idcentro;

    public MjEtapasT() {
    }

    public MjEtapasT(Integer idetapas) {
        this.idetapas = idetapas;
    }

    public Integer getIdetapas() {
        return idetapas;
    }

    public void setIdetapas(Integer idetapas) {
        this.idetapas = idetapas;
    }

    public String getEtapas() {
        return etapas;
    }

    public void setEtapas(String etapas) {
        this.etapas = etapas;
    }

    public Boolean getEstadoetapa() {
        return estadoetapa;
    }

    public void setEstadoetapa(Boolean estadoetapa) {
        this.estadoetapa = estadoetapa;
    }

    public Collection<MjLugarT> getMjLugarTCollection() {
        return mjLugarTCollection;
    }

    public void setMjLugarTCollection(Collection<MjLugarT> mjLugarTCollection) {
        this.mjLugarTCollection = mjLugarTCollection;
    }

    public MjCentroT getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(MjCentroT idcentro) {
        this.idcentro = idcentro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idetapas != null ? idetapas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjEtapasT)) {
            return false;
        }
        MjEtapasT other = (MjEtapasT) object;
        if ((this.idetapas == null && other.idetapas != null) || (this.idetapas != null && !this.idetapas.equals(other.idetapas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjEtapasT[ idetapas=" + idetapas + " ]";
    }
    
}
