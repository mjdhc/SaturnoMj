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
@Table(name = "mj_centro_t")
@NamedQueries({
    @NamedQuery(name = "MjCentroT.findAll", query = "SELECT m FROM MjCentroT m")
    , @NamedQuery(name = "MjCentroT.findByIdcentro", query = "SELECT m FROM MjCentroT m WHERE m.idcentro = :idcentro")
    , @NamedQuery(name = "MjCentroT.findByNombrecentro", query = "SELECT m FROM MjCentroT m WHERE m.nombrecentro = :nombrecentro")
    , @NamedQuery(name = "MjCentroT.findByDesccentro", query = "SELECT m FROM MjCentroT m WHERE m.desccentro = :desccentro")
    , @NamedQuery(name = "MjCentroT.findByEstadocentro", query = "SELECT m FROM MjCentroT m WHERE m.estadocentro = :estadocentro")})
public class MjCentroT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcentro")
    private Integer idcentro;
    @Size(max = 60)
    @Column(name = "nombrecentro")
    private String nombrecentro;
    @Size(max = 100)
    @Column(name = "desccentro")
    private String desccentro;
    @Column(name = "estadocentro")
    private Boolean estadocentro=true;
    @OneToMany(mappedBy = "idcentro")
    private Collection<MjConfiguracentro> mjConfiguracentroCollection;
    @OneToMany(mappedBy = "idcentro")
    private Collection<MjAspT> mjAspTCollection;
    @OneToMany(mappedBy = "idcentro")
    private Collection<MjEtapasT> mjEtapasTCollection;
    @OneToMany(mappedBy = "idcentro")
    private Collection<MjUsuarioT> mjUsuarioTCollection;

    public MjCentroT() {
    }

    public MjCentroT(Integer idcentro) {
        this.idcentro = idcentro;
    }

    public Integer getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(Integer idcentro) {
        this.idcentro = idcentro;
    }

    public String getNombrecentro() {
        return nombrecentro;
    }

    public void setNombrecentro(String nombrecentro) {
        this.nombrecentro = nombrecentro;
    }

    public String getDesccentro() {
        return desccentro;
    }

    public void setDesccentro(String desccentro) {
        this.desccentro = desccentro;
    }

    public Boolean getEstadocentro() {
        return estadocentro;
    }

    public void setEstadocentro(Boolean estadocentro) {
        this.estadocentro = estadocentro;
    }

    public Collection<MjConfiguracentro> getMjConfiguracentroCollection() {
        return mjConfiguracentroCollection;
    }

    public void setMjConfiguracentroCollection(Collection<MjConfiguracentro> mjConfiguracentroCollection) {
        this.mjConfiguracentroCollection = mjConfiguracentroCollection;
    }

    public Collection<MjAspT> getMjAspTCollection() {
        return mjAspTCollection;
    }

    public void setMjAspTCollection(Collection<MjAspT> mjAspTCollection) {
        this.mjAspTCollection = mjAspTCollection;
    }

    public Collection<MjEtapasT> getMjEtapasTCollection() {
        return mjEtapasTCollection;
    }

    public void setMjEtapasTCollection(Collection<MjEtapasT> mjEtapasTCollection) {
        this.mjEtapasTCollection = mjEtapasTCollection;
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
        hash += (idcentro != null ? idcentro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjCentroT)) {
            return false;
        }
        MjCentroT other = (MjCentroT) object;
        if ((this.idcentro == null && other.idcentro != null) || (this.idcentro != null && !this.idcentro.equals(other.idcentro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjCentroT[ idcentro=" + idcentro + " ]";
    }
    
}
