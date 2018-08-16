/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_historico_t")
@NamedQueries({
    @NamedQuery(name = "MjHistoricoT.findAll", query = "SELECT m FROM MjHistoricoT m")
    , @NamedQuery(name = "MjHistoricoT.findByIdhistorico", query = "SELECT m FROM MjHistoricoT m WHERE m.idhistorico = :idhistorico")
    , @NamedQuery(name = "MjHistoricoT.findByIdlugarnuevo", query = "SELECT m FROM MjHistoricoT m WHERE m.idlugarnuevo = :idlugarnuevo")
    , @NamedQuery(name = "MjHistoricoT.findByEstadohistorico", query = "SELECT m FROM MjHistoricoT m WHERE m.estadohistorico = :estadohistorico")
    , @NamedQuery(name = "MjHistoricoT.findByFechainicio", query = "SELECT m FROM MjHistoricoT m WHERE m.fechainicio = :fechainicio")
    , @NamedQuery(name = "MjHistoricoT.findByFechafin", query = "SELECT m FROM MjHistoricoT m WHERE m.fechafin = :fechafin")
    , @NamedQuery(name = "MjHistoricoT.findByReasignacion", query = "SELECT m FROM MjHistoricoT m WHERE m.reasignacion = :reasignacion")
    , @NamedQuery(name = "MjHistoricoT.findByObservaciones", query = "SELECT m FROM MjHistoricoT m WHERE m.observaciones = :observaciones")})
public class MjHistoricoT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhistorico")
    private Integer idhistorico;
    @Column(name = "idlugarnuevo")
    private Integer idlugarnuevo;
    @Column(name = "estadohistorico")
    private Boolean estadohistorico;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Size(max = 2)
    @Column(name = "reasignacion")
    private String reasignacion;
    @Size(max = 5000)
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "idasp", referencedColumnName = "idasp")
    @ManyToOne
    private MjAspT idasp;
    @JoinColumn(name = "idlugar", referencedColumnName = "idlugar")
    @ManyToOne
    private MjLugarT idlugar;

    public MjHistoricoT() {
    }

    public MjHistoricoT(Integer idhistorico) {
        this.idhistorico = idhistorico;
    }

    public Integer getIdhistorico() {
        return idhistorico;
    }

    public void setIdhistorico(Integer idhistorico) {
        this.idhistorico = idhistorico;
    }

    public Integer getIdlugarnuevo() {
        return idlugarnuevo;
    }

    public void setIdlugarnuevo(Integer idlugarnuevo) {
        this.idlugarnuevo = idlugarnuevo;
    }

    public Boolean getEstadohistorico() {
        return estadohistorico;
    }

    public void setEstadohistorico(Boolean estadohistorico) {
        this.estadohistorico = estadohistorico;
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

    public String getReasignacion() {
        return reasignacion;
    }

    public void setReasignacion(String reasignacion) {
        this.reasignacion = reasignacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhistorico != null ? idhistorico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjHistoricoT)) {
            return false;
        }
        MjHistoricoT other = (MjHistoricoT) object;
        if ((this.idhistorico == null && other.idhistorico != null) || (this.idhistorico != null && !this.idhistorico.equals(other.idhistorico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjHistoricoT[ idhistorico=" + idhistorico + " ]";
    }
    
}
