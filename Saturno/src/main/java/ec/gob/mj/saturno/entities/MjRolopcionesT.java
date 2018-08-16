/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_rolopciones_t")
@NamedQueries({
    @NamedQuery(name = "MjRolopcionesT.findAll", query = "SELECT m FROM MjRolopcionesT m")
    , @NamedQuery(name = "MjRolopcionesT.findByIdrolopciones", query = "SELECT m FROM MjRolopcionesT m WHERE m.idrolopciones = :idrolopciones")})
public class MjRolopcionesT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrolopciones")
    private Integer idrolopciones;
    @JoinColumn(name = "idopciones", referencedColumnName = "idopciones")
    @ManyToOne
    private MjOpcionesT idopciones;
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    @ManyToOne
    private MjRolT idrol;

    public MjRolopcionesT() {
    }

    public MjRolopcionesT(Integer idrolopciones) {
        this.idrolopciones = idrolopciones;
    }

    public Integer getIdrolopciones() {
        return idrolopciones;
    }

    public void setIdrolopciones(Integer idrolopciones) {
        this.idrolopciones = idrolopciones;
    }

    public MjOpcionesT getIdopciones() {
        return idopciones;
    }

    public void setIdopciones(MjOpcionesT idopciones) {
        this.idopciones = idopciones;
    }

    public MjRolT getIdrol() {
        return idrol;
    }

    public void setIdrol(MjRolT idrol) {
        this.idrol = idrol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrolopciones != null ? idrolopciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjRolopcionesT)) {
            return false;
        }
        MjRolopcionesT other = (MjRolopcionesT) object;
        if ((this.idrolopciones == null && other.idrolopciones != null) || (this.idrolopciones != null && !this.idrolopciones.equals(other.idrolopciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjRolopcionesT[ idrolopciones=" + idrolopciones + " ]";
    }
    
}
