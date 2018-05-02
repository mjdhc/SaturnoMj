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
@Table(name = "mj_motivfalta_t")
@NamedQueries({
    @NamedQuery(name = "MjMotivfaltaT.findAll", query = "SELECT m FROM MjMotivfaltaT m")
    , @NamedQuery(name = "MjMotivfaltaT.findByIdmotivofalta", query = "SELECT m FROM MjMotivfaltaT m WHERE m.idmotivofalta = :idmotivofalta")
    , @NamedQuery(name = "MjMotivfaltaT.findByMotivofalta", query = "SELECT m FROM MjMotivfaltaT m WHERE m.motivofalta = :motivofalta")
    , @NamedQuery(name = "MjMotivfaltaT.findByEstadofalta", query = "SELECT m FROM MjMotivfaltaT m WHERE m.estadofalta = :estadofalta")})
public class MjMotivfaltaT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmotivofalta")
    private Integer idmotivofalta;
    @Size(max = 30)
    @Column(name = "motivofalta")
    private String motivofalta;
    @Column(name = "estadofalta")
    private Boolean estadofalta;
    @OneToMany(mappedBy = "idmotivofalta")
    private Collection<MjJustificaT> mjJustificaTCollection;

    public MjMotivfaltaT() {
    }

    public MjMotivfaltaT(Integer idmotivofalta) {
        this.idmotivofalta = idmotivofalta;
    }

    public Integer getIdmotivofalta() {
        return idmotivofalta;
    }

    public void setIdmotivofalta(Integer idmotivofalta) {
        this.idmotivofalta = idmotivofalta;
    }

    public String getMotivofalta() {
        return motivofalta;
    }

    public void setMotivofalta(String motivofalta) {
        this.motivofalta = motivofalta;
    }

    public Boolean getEstadofalta() {
        return estadofalta;
    }

    public void setEstadofalta(Boolean estadofalta) {
        this.estadofalta = estadofalta;
    }

    public Collection<MjJustificaT> getMjJustificaTCollection() {
        return mjJustificaTCollection;
    }

    public void setMjJustificaTCollection(Collection<MjJustificaT> mjJustificaTCollection) {
        this.mjJustificaTCollection = mjJustificaTCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmotivofalta != null ? idmotivofalta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjMotivfaltaT)) {
            return false;
        }
        MjMotivfaltaT other = (MjMotivfaltaT) object;
        if ((this.idmotivofalta == null && other.idmotivofalta != null) || (this.idmotivofalta != null && !this.idmotivofalta.equals(other.idmotivofalta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjMotivfaltaT[ idmotivofalta=" + idmotivofalta + " ]";
    }
    
}
