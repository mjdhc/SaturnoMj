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
@Table(name = "mj_logs_t")
@NamedQueries({
    @NamedQuery(name = "MjLogsT.findAll", query = "SELECT m FROM MjLogsT m")
    , @NamedQuery(name = "MjLogsT.findByIdlog", query = "SELECT m FROM MjLogsT m WHERE m.idlog = :idlog")
    , @NamedQuery(name = "MjLogsT.findByAccion", query = "SELECT m FROM MjLogsT m WHERE m.accion = :accion")
    , @NamedQuery(name = "MjLogsT.findByCampoanterior", query = "SELECT m FROM MjLogsT m WHERE m.campoanterior = :campoanterior")
    , @NamedQuery(name = "MjLogsT.findByCamponuevo", query = "SELECT m FROM MjLogsT m WHERE m.camponuevo = :camponuevo")
    , @NamedQuery(name = "MjLogsT.findByFechacambio", query = "SELECT m FROM MjLogsT m WHERE m.fechacambio = :fechacambio")})
public class MjLogsT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlog")
    private Integer idlog;
    @Size(max = 60)
    @Column(name = "accion")
    private String accion;
    @Size(max = 60)
    @Column(name = "campoanterior")
    private String campoanterior;
    @Size(max = 60)
    @Column(name = "camponuevo")
    private String camponuevo;
    @Column(name = "fechacambio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacambio;
    @JoinColumn(name = "idopciones", referencedColumnName = "idopciones")
    @ManyToOne
    private MjOpcionesT idopciones;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private MjUsuarioT idusuario;

    public MjLogsT() {
    }

    public MjLogsT(Integer idlog) {
        this.idlog = idlog;
    }

    public Integer getIdlog() {
        return idlog;
    }

    public void setIdlog(Integer idlog) {
        this.idlog = idlog;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getCampoanterior() {
        return campoanterior;
    }

    public void setCampoanterior(String campoanterior) {
        this.campoanterior = campoanterior;
    }

    public String getCamponuevo() {
        return camponuevo;
    }

    public void setCamponuevo(String camponuevo) {
        this.camponuevo = camponuevo;
    }

    public Date getFechacambio() {
        return fechacambio;
    }

    public void setFechacambio(Date fechacambio) {
        this.fechacambio = fechacambio;
    }

    public MjOpcionesT getIdopciones() {
        return idopciones;
    }

    public void setIdopciones(MjOpcionesT idopciones) {
        this.idopciones = idopciones;
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
        hash += (idlog != null ? idlog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjLogsT)) {
            return false;
        }
        MjLogsT other = (MjLogsT) object;
        if ((this.idlog == null && other.idlog != null) || (this.idlog != null && !this.idlog.equals(other.idlog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjLogsT[ idlog=" + idlog + " ]";
    }
    
}
