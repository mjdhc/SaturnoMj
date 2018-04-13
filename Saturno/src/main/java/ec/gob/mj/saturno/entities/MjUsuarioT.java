/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "mj_usuario_t")
@NamedQueries({
    @NamedQuery(name = "MjUsuarioT.findAll", query = "SELECT m FROM MjUsuarioT m")
    , @NamedQuery(name = "MjUsuarioT.findByIdusuario", query = "SELECT m FROM MjUsuarioT m WHERE m.idusuario = :idusuario")
    , @NamedQuery(name = "MjUsuarioT.findByNombreusuario", query = "SELECT m FROM MjUsuarioT m WHERE m.nombreusuario = :nombreusuario")
    , @NamedQuery(name = "MjUsuarioT.findByApellidousuario", query = "SELECT m FROM MjUsuarioT m WHERE m.apellidousuario = :apellidousuario")
    , @NamedQuery(name = "MjUsuarioT.findByUsuario", query = "SELECT m FROM MjUsuarioT m WHERE m.usuario = :usuario")
    , @NamedQuery(name = "MjUsuarioT.findByClave", query = "SELECT m FROM MjUsuarioT m WHERE m.clave = :clave")
    , @NamedQuery(name = "MjUsuarioT.findByEstadousuario", query = "SELECT m FROM MjUsuarioT m WHERE m.estadousuario = :estadousuario")})
public class MjUsuarioT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Size(max = 60)
    @Column(name = "nombreusuario")
    private String nombreusuario;
    @Size(max = 60)
    @Column(name = "apellidousuario")
    private String apellidousuario;
    @Size(max = 15)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 60)
    @Column(name = "clave")
    private String clave;
    @Column(name = "estadousuario")
    private Boolean estadousuario;
    @OneToMany(mappedBy = "idusuario")
    private Collection<MjLogsT> mjLogsTCollection;
    @OneToMany(mappedBy = "idusuario")
    private Collection<MjJustificaT> mjJustificaTCollection;
    @OneToMany(mappedBy = "idusuario")
    private Collection<MjReasignacionT> mjReasignacionTCollection;
    @JoinColumn(name = "idcentro", referencedColumnName = "idcentro")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private MjCentroT idcentro;
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    @ManyToOne
    private MjRolT idrol;

    public MjUsuarioT() {
    }

    public MjUsuarioT(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getEstadousuario() {
        return estadousuario;
    }

    public void setEstadousuario(Boolean estadousuario) {
        this.estadousuario = estadousuario;
    }

    public Collection<MjLogsT> getMjLogsTCollection() {
        return mjLogsTCollection;
    }

    public void setMjLogsTCollection(Collection<MjLogsT> mjLogsTCollection) {
        this.mjLogsTCollection = mjLogsTCollection;
    }

    public Collection<MjJustificaT> getMjJustificaTCollection() {
        return mjJustificaTCollection;
    }

    public void setMjJustificaTCollection(Collection<MjJustificaT> mjJustificaTCollection) {
        this.mjJustificaTCollection = mjJustificaTCollection;
    }

    public Collection<MjReasignacionT> getMjReasignacionTCollection() {
        return mjReasignacionTCollection;
    }

    public void setMjReasignacionTCollection(Collection<MjReasignacionT> mjReasignacionTCollection) {
        this.mjReasignacionTCollection = mjReasignacionTCollection;
    }

    public MjCentroT getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(MjCentroT idcentro) {
        this.idcentro = idcentro;
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
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjUsuarioT)) {
            return false;
        }
        MjUsuarioT other = (MjUsuarioT) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjUsuarioT[ idusuario=" + idusuario + " ]";
    }
    
}
