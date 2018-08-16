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

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_reasignacion_t")
@NamedQueries({
    @NamedQuery(name = "MjReasignacionT.findAll", query = "SELECT m FROM MjReasignacionT m")
    , @NamedQuery(name = "MjReasignacionT.findByIdreasigna", query = "SELECT m FROM MjReasignacionT m WHERE m.idreasigna = :idreasigna")
    , @NamedQuery(name = "MjReasignacionT.findByFechainicio", query = "SELECT m FROM MjReasignacionT m WHERE m.fechainicio = :fechainicio")
    , @NamedQuery(name = "MjReasignacionT.findByFechafin", query = "SELECT m FROM MjReasignacionT m WHERE m.fechafin = :fechafin")
    , @NamedQuery(name = "MjReasignacionT.findByFechareasigna", query = "SELECT m FROM MjReasignacionT m WHERE m.fechareasigna = :fechareasigna")
    , @NamedQuery(name = "MjReasignacionT.findByAprobado", query = "SELECT m FROM MjReasignacionT m WHERE m.aprobado = :aprobado")})
public class MjReasignacionT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreasigna")
    private Integer idreasigna;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Column(name = "fechareasigna")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareasigna;
    @Column(name = "aprobado")
    private Boolean aprobado;
    @JoinColumn(name = "idasignacion", referencedColumnName = "idasignacion")
    @ManyToOne
    private MjAsignacionT idasignacion;
    @JoinColumn(name = "idlugar", referencedColumnName = "idlugar")
    @ManyToOne
    private MjLugarT idlugar;
    @JoinColumn(name = "idmotivoreasigna", referencedColumnName = "idmotivoreasigna")
    @ManyToOne
    private MjMotivreasignaT idmotivoreasigna;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private MjUsuarioT idusuario;

    public MjReasignacionT() {
    }

    public MjReasignacionT(Integer idreasigna) {
        this.idreasigna = idreasigna;
    }

    public Integer getIdreasigna() {
        return idreasigna;
    }

    public void setIdreasigna(Integer idreasigna) {
        this.idreasigna = idreasigna;
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

    public Date getFechareasigna() {
        return fechareasigna;
    }

    public void setFechareasigna(Date fechareasigna) {
        this.fechareasigna = fechareasigna;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public MjAsignacionT getIdasignacion() {
        return idasignacion;
    }

    public void setIdasignacion(MjAsignacionT idasignacion) {
        this.idasignacion = idasignacion;
    }

    public MjLugarT getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(MjLugarT idlugar) {
        this.idlugar = idlugar;
    }

    public MjMotivreasignaT getIdmotivoreasigna() {
        return idmotivoreasigna;
    }

    public void setIdmotivoreasigna(MjMotivreasignaT idmotivoreasigna) {
        this.idmotivoreasigna = idmotivoreasigna;
    }

    public MjUsuarioT getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(MjUsuarioT idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreasigna != null ? idreasigna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjReasignacionT)) {
            return false;
        }
        MjReasignacionT other = (MjReasignacionT) object;
        if ((this.idreasigna == null && other.idreasigna != null) || (this.idreasigna != null && !this.idreasigna.equals(other.idreasigna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjReasignacionT[ idreasigna=" + idreasigna + " ]";
    }
    
}
