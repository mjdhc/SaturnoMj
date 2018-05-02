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
@Table(name = "mj_lugar_t")
@NamedQueries({
    @NamedQuery(name = "MjLugarT.findAll", query = "SELECT m FROM MjLugarT m")
    , @NamedQuery(name = "MjLugarT.findByIdlugar", query = "SELECT m FROM MjLugarT m WHERE m.idlugar = :idlugar")
    , @NamedQuery(name = "MjLugarT.findByLugar", query = "SELECT m FROM MjLugarT m WHERE m.lugar = :lugar")
    , @NamedQuery(name = "MjLugarT.findByDescripcion", query = "SELECT m FROM MjLugarT m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MjLugarT.findByMinasp", query = "SELECT m FROM MjLugarT m WHERE m.minasp = :minasp")
    , @NamedQuery(name = "MjLugarT.findByMaxasp", query = "SELECT m FROM MjLugarT m WHERE m.maxasp = :maxasp")
    , @NamedQuery(name = "MjLugarT.findByPersonal", query = "SELECT m FROM MjLugarT m WHERE m.personal = :personal")
    , @NamedQuery(name = "MjLugarT.findByEstadolugar", query = "SELECT m FROM MjLugarT m WHERE m.estadolugar = :estadolugar")})
public class MjLugarT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlugar")
    private Integer idlugar;
    @Size(max = 20)
    @Column(name = "lugar")
    private String lugar;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "minasp")
    private Integer minasp;
    @Column(name = "maxasp")
    private Integer maxasp;
    @Column(name = "personal")
    private Integer personal;
    @Column(name = "estadolugar")
    private Boolean estadolugar;
    @OneToMany(mappedBy = "idlugar")
    private Collection<MjAsignacionT> mjAsignacionTCollection;
    @OneToMany(mappedBy = "idlugar")
    private Collection<MjReasignacionT> mjReasignacionTCollection;
    
    @JoinColumn(name = "idetapas", referencedColumnName = "idetapas")
    @ManyToOne
    private MjEtapasT idetapas;
    @OneToMany(mappedBy = "idlugar")
    private Collection<MjHistoricoT> mjHistoricoTCollection;

    public MjLugarT() {
    }

    public MjLugarT(Integer idlugar) {
        this.idlugar = idlugar;
    }

    public Integer getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(Integer idlugar) {
        this.idlugar = idlugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getMinasp() {
        return minasp;
    }

    public void setMinasp(Integer minasp) {
        this.minasp = minasp;
    }

    public Integer getMaxasp() {
        return maxasp;
    }

    public void setMaxasp(Integer maxasp) {
        this.maxasp = maxasp;
    }

    public Integer getPersonal() {
        return personal;
    }

    public void setPersonal(Integer personal) {
        this.personal = personal;
    }

    public Boolean getEstadolugar() {
        return estadolugar;
    }

    public void setEstadolugar(Boolean estadolugar) {
        this.estadolugar = estadolugar;
    }

    public Collection<MjAsignacionT> getMjAsignacionTCollection() {
        return mjAsignacionTCollection;
    }

    public void setMjAsignacionTCollection(Collection<MjAsignacionT> mjAsignacionTCollection) {
        this.mjAsignacionTCollection = mjAsignacionTCollection;
    }

    public Collection<MjReasignacionT> getMjReasignacionTCollection() {
        return mjReasignacionTCollection;
    }

    public void setMjReasignacionTCollection(Collection<MjReasignacionT> mjReasignacionTCollection) {
        this.mjReasignacionTCollection = mjReasignacionTCollection;
    }

    public MjEtapasT getIdetapas() {
        return idetapas;
    }

    public void setIdetapas(MjEtapasT idetapas) {
        this.idetapas = idetapas;
    }

    public Collection<MjHistoricoT> getMjHistoricoTCollection() {
        return mjHistoricoTCollection;
    }

    public void setMjHistoricoTCollection(Collection<MjHistoricoT> mjHistoricoTCollection) {
        this.mjHistoricoTCollection = mjHistoricoTCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlugar != null ? idlugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjLugarT)) {
            return false;
        }
        MjLugarT other = (MjLugarT) object;
        if ((this.idlugar == null && other.idlugar != null) || (this.idlugar != null && !this.idlugar.equals(other.idlugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjLugarT[ idlugar=" + idlugar + " ]";
    }
    
}
