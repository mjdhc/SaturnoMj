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
@Table(name = "mj_opciones_t")
@NamedQueries({
    @NamedQuery(name = "MjOpcionesT.findAll", query = "SELECT m FROM MjOpcionesT m")
    , @NamedQuery(name = "MjOpcionesT.findByIdopciones", query = "SELECT m FROM MjOpcionesT m WHERE m.idopciones = :idopciones")
    , @NamedQuery(name = "MjOpcionesT.findByOpciones", query = "SELECT m FROM MjOpcionesT m WHERE m.opciones = :opciones")
    , @NamedQuery(name = "MjOpcionesT.findByEstadoopciones", query = "SELECT m FROM MjOpcionesT m WHERE m.estadoopciones = :estadoopciones")})
public class MjOpcionesT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idopciones")
    private Integer idopciones;
    @Size(max = 200)
    @Column(name = "opciones")
    private String opciones;
    @Column(name = "estadoopciones")
    private Boolean estadoopciones;
    @OneToMany(mappedBy = "idopciones")
    private Collection<MjLogsT> mjLogsTCollection;
    @OneToMany(mappedBy = "idopciones")
    private Collection<MjRolopcionesT> mjRolopcionesTCollection;

    public MjOpcionesT() {
    }

    public MjOpcionesT(Integer idopciones) {
        this.idopciones = idopciones;
    }

    public Integer getIdopciones() {
        return idopciones;
    }

    public void setIdopciones(Integer idopciones) {
        this.idopciones = idopciones;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    public Boolean getEstadoopciones() {
        return estadoopciones;
    }

    public void setEstadoopciones(Boolean estadoopciones) {
        this.estadoopciones = estadoopciones;
    }

    public Collection<MjLogsT> getMjLogsTCollection() {
        return mjLogsTCollection;
    }

    public void setMjLogsTCollection(Collection<MjLogsT> mjLogsTCollection) {
        this.mjLogsTCollection = mjLogsTCollection;
    }

    public Collection<MjRolopcionesT> getMjRolopcionesTCollection() {
        return mjRolopcionesTCollection;
    }

    public void setMjRolopcionesTCollection(Collection<MjRolopcionesT> mjRolopcionesTCollection) {
        this.mjRolopcionesTCollection = mjRolopcionesTCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idopciones != null ? idopciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjOpcionesT)) {
            return false;
        }
        MjOpcionesT other = (MjOpcionesT) object;
        if ((this.idopciones == null && other.idopciones != null) || (this.idopciones != null && !this.idopciones.equals(other.idopciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjOpcionesT[ idopciones=" + idopciones + " ]";
    }
    
}
