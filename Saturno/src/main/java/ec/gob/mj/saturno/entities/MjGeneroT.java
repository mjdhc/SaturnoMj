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
@Table(name = "mj_genero_t")
@NamedQueries({
    @NamedQuery(name = "MjGeneroT.findAll", query = "SELECT m FROM MjGeneroT m")
    , @NamedQuery(name = "MjGeneroT.findByIdgenero", query = "SELECT m FROM MjGeneroT m WHERE m.idgenero = :idgenero")
    , @NamedQuery(name = "MjGeneroT.findByGenero", query = "SELECT m FROM MjGeneroT m WHERE m.genero = :genero")
    , @NamedQuery(name = "MjGeneroT.findByEstadogenero", query = "SELECT m FROM MjGeneroT m WHERE m.estadogenero = :estadogenero")})
public class MjGeneroT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgenero")
    private Integer idgenero;
    @Size(max = 20)
    @Column(name = "genero")
    private String genero;
    @Column(name = "estadogenero")
    private Boolean estadogenero;
    @OneToMany(mappedBy = "idgenero")
    private Collection<MjAspT> mjAspTCollection;

    public MjGeneroT() {
    }

    public MjGeneroT(Integer idgenero) {
        this.idgenero = idgenero;
    }

    public Integer getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Integer idgenero) {
        this.idgenero = idgenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getEstadogenero() {
        return estadogenero;
    }

    public void setEstadogenero(Boolean estadogenero) {
        this.estadogenero = estadogenero;
    }

    public Collection<MjAspT> getMjAspTCollection() {
        return mjAspTCollection;
    }

    public void setMjAspTCollection(Collection<MjAspT> mjAspTCollection) {
        this.mjAspTCollection = mjAspTCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgenero != null ? idgenero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjGeneroT)) {
            return false;
        }
        MjGeneroT other = (MjGeneroT) object;
        if ((this.idgenero == null && other.idgenero != null) || (this.idgenero != null && !this.idgenero.equals(other.idgenero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjGeneroT[ idgenero=" + idgenero + " ]";
    }
    
}
