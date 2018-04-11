/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_asignacion_t")
@NamedQueries({
    @NamedQuery(name = "MjAsignacionT.findAll", query = "SELECT m FROM MjAsignacionT m")
    , @NamedQuery(name = "MjAsignacionT.findByIdasignacion", query = "SELECT m FROM MjAsignacionT m WHERE m.idasignacion = :idasignacion")
    , @NamedQuery(name = "MjAsignacionT.findByFechainicio", query = "SELECT m FROM MjAsignacionT m WHERE m.fechainicio = :fechainicio")
    , @NamedQuery(name = "MjAsignacionT.findByFechafin", query = "SELECT m FROM MjAsignacionT m WHERE m.fechafin = :fechafin")
    , @NamedQuery(name = "MjAsignacionT.findByFechaasignacion", query = "SELECT m FROM MjAsignacionT m WHERE m.fechaasignacion = :fechaasignacion")
    , @NamedQuery(name = "MjAsignacionT.findByObservaciones", query = "SELECT m FROM MjAsignacionT m WHERE m.observaciones = :observaciones")
    , @NamedQuery(name = "MjAsignacionT.findByEstadoasignacion", query = "SELECT m FROM MjAsignacionT m WHERE m.estadoasignacion = :estadoasignacion")})
public class MjAsignacionT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idasignacion")
    private Integer idasignacion;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Column(name = "fechaasignacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaasignacion;
    @Size(max = 5000)
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "estadoasignacion")
    private Boolean estadoasignacion;
    @JoinColumn(name = "idasp", referencedColumnName = "idasp")
    @ManyToOne
    private MjAspT idasp;
    @JoinColumn(name = "idlugar", referencedColumnName = "idlugar")
    @ManyToOne
    private MjLugarT idlugar;
    @OneToMany(mappedBy = "idasignacion")
    private Collection<MjReasignacionT> mjReasignacionTCollection;

    public MjAsignacionT() {
    }

    public MjAsignacionT(Integer idasignacion) {
        this.idasignacion = idasignacion;
    }

    public Integer getIdasignacion() {
        return idasignacion;
    }

    public void setIdasignacion(Integer idasignacion) {
        this.idasignacion = idasignacion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Date getFechaasignacion() {
        return fechaasignacion;
    }

    public void setFechaasignacion(Date fechaasignacion) {
        this.fechaasignacion = fechaasignacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getEstadoasignacion() {
        return estadoasignacion;
    }

    public void setEstadoasignacion(Boolean estadoasignacion) {
        this.estadoasignacion = estadoasignacion;
    }

    public MjAspT getIdasp() {
        return idasp;
    }

    public void setIdasp(MjAspT idasp) {
        this.idasp = idasp;
    }

    public MjLugarT getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(MjLugarT idlugar) {
        this.idlugar = idlugar;
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
        hash += (idasignacion != null ? idasignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjAsignacionT)) {
            return false;
        }
        MjAsignacionT other = (MjAsignacionT) object;
        if ((this.idasignacion == null && other.idasignacion != null) || (this.idasignacion != null && !this.idasignacion.equals(other.idasignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjAsignacionT[ idasignacion=" + idasignacion + " ]";
    }
    
}
