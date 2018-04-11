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
@Table(name = "mj_motivreasigna_t")
@NamedQueries({
    @NamedQuery(name = "MjMotivreasignaT.findAll", query = "SELECT m FROM MjMotivreasignaT m")
    , @NamedQuery(name = "MjMotivreasignaT.findByIdmotivoreasigna", query = "SELECT m FROM MjMotivreasignaT m WHERE m.idmotivoreasigna = :idmotivoreasigna")
    , @NamedQuery(name = "MjMotivreasignaT.findByMotivoreasigna", query = "SELECT m FROM MjMotivreasignaT m WHERE m.motivoreasigna = :motivoreasigna")})
public class MjMotivreasignaT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmotivoreasigna")
    private Integer idmotivoreasigna;
    @Size(max = 30)
    @Column(name = "motivoreasigna")
    private String motivoreasigna;
    @OneToMany(mappedBy = "idmotivoreasigna")
    private Collection<MjReasignacionT> mjReasignacionTCollection;

    public MjMotivreasignaT() {
    }

    public MjMotivreasignaT(Integer idmotivoreasigna) {
        this.idmotivoreasigna = idmotivoreasigna;
    }

    public Integer getIdmotivoreasigna() {
        return idmotivoreasigna;
    }

    public void setIdmotivoreasigna(Integer idmotivoreasigna) {
        this.idmotivoreasigna = idmotivoreasigna;
    }

    public String getMotivoreasigna() {
        return motivoreasigna;
    }

    public void setMotivoreasigna(String motivoreasigna) {
        this.motivoreasigna = motivoreasigna;
    }

    public Collection<MjReasignacionT> getMjReasignacionTCollection() {
        return mjReasignacionTCollection;
    }

    public void setMjReasignacionTCollection(Collection<MjReasignacionT> mjReasignacionTCollection) {
        this.mjReasignacionTCollection = mjReasignacionTCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmotivoreasigna != null ? idmotivoreasigna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjMotivreasignaT)) {
            return false;
        }
        MjMotivreasignaT other = (MjMotivreasignaT) object;
        if ((this.idmotivoreasigna == null && other.idmotivoreasigna != null) || (this.idmotivoreasigna != null && !this.idmotivoreasigna.equals(other.idmotivoreasigna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjMotivreasignaT[ idmotivoreasigna=" + idmotivoreasigna + " ]";
    }
    
}
