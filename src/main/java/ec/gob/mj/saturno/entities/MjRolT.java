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
@Table(name = "mj_rol_t")
@NamedQueries({
    @NamedQuery(name = "MjRolT.findAll", query = "SELECT m FROM MjRolT m")
    , @NamedQuery(name = "MjRolT.findByIdrol", query = "SELECT m FROM MjRolT m WHERE m.idrol = :idrol")
    , @NamedQuery(name = "MjRolT.findByRol", query = "SELECT m FROM MjRolT m WHERE m.rol = :rol")
    , @NamedQuery(name = "MjRolT.findByEstadorol", query = "SELECT m FROM MjRolT m WHERE m.estadorol = :estadorol")})
public class MjRolT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrol")
    private Integer idrol;
    @Size(max = 20)
    @Column(name = "rol")
    private String rol;
    @Column(name = "estadorol")
    private Boolean estadorol;
    @OneToMany(mappedBy = "idrol")
    private Collection<MjRolopcionesT> mjRolopcionesTCollection;
    @OneToMany(mappedBy = "idrol")
    private Collection<MjUsuarioT> mjUsuarioTCollection;

    public MjRolT() {
    }

    public MjRolT(Integer idrol) {
        this.idrol = idrol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEstadorol() {
        return estadorol;
    }

    public void setEstadorol(Boolean estadorol) {
        this.estadorol = estadorol;
    }

    public Collection<MjRolopcionesT> getMjRolopcionesTCollection() {
        return mjRolopcionesTCollection;
    }

    public void setMjRolopcionesTCollection(Collection<MjRolopcionesT> mjRolopcionesTCollection) {
        this.mjRolopcionesTCollection = mjRolopcionesTCollection;
    }

    public Collection<MjUsuarioT> getMjUsuarioTCollection() {
        return mjUsuarioTCollection;
    }

    public void setMjUsuarioTCollection(Collection<MjUsuarioT> mjUsuarioTCollection) {
        this.mjUsuarioTCollection = mjUsuarioTCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrol != null ? idrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjRolT)) {
            return false;
        }
        MjRolT other = (MjRolT) object;
        if ((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjRolT[ idrol=" + idrol + " ]";
    }
    
}
