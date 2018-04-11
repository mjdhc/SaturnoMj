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
@Table(name = "mj_justifica_t")
@NamedQueries({
    @NamedQuery(name = "MjJustificaT.findAll", query = "SELECT m FROM MjJustificaT m")
    , @NamedQuery(name = "MjJustificaT.findByIdjustifica", query = "SELECT m FROM MjJustificaT m WHERE m.idjustifica = :idjustifica")
    , @NamedQuery(name = "MjJustificaT.findByFechainicio", query = "SELECT m FROM MjJustificaT m WHERE m.fechainicio = :fechainicio")
    , @NamedQuery(name = "MjJustificaT.findByFechafin", query = "SELECT m FROM MjJustificaT m WHERE m.fechafin = :fechafin")
    , @NamedQuery(name = "MjJustificaT.findByFechaguarda", query = "SELECT m FROM MjJustificaT m WHERE m.fechaguarda = :fechaguarda")})
public class MjJustificaT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjustifica")
    private Integer idjustifica;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Column(name = "fechaguarda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaguarda;
    @JoinColumn(name = "idasp", referencedColumnName = "idasp")
    @ManyToOne
    private MjAspT idasp;
    @JoinColumn(name = "idmotivofalta", referencedColumnName = "idmotivofalta")
    @ManyToOne
    private MjMotivfaltaT idmotivofalta;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private MjUsuarioT idusuario;

    public MjJustificaT() {
    }

    public MjJustificaT(Integer idjustifica) {
        this.idjustifica = idjustifica;
    }

    public Integer getIdjustifica() {
        return idjustifica;
    }

    public void setIdjustifica(Integer idjustifica) {
        this.idjustifica = idjustifica;
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

    public Date getFechaguarda() {
        return fechaguarda;
    }

    public void setFechaguarda(Date fechaguarda) {
        this.fechaguarda = fechaguarda;
    }

    public MjAspT getIdasp() {
        return idasp;
    }

    public void setIdasp(MjAspT idasp) {
        this.idasp = idasp;
    }

    public MjMotivfaltaT getIdmotivofalta() {
        return idmotivofalta;
    }

    public void setIdmotivofalta(MjMotivfaltaT idmotivofalta) {
        this.idmotivofalta = idmotivofalta;
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
        hash += (idjustifica != null ? idjustifica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjJustificaT)) {
            return false;
        }
        MjJustificaT other = (MjJustificaT) object;
        if ((this.idjustifica == null && other.idjustifica != null) || (this.idjustifica != null && !this.idjustifica.equals(other.idjustifica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjJustificaT[ idjustifica=" + idjustifica + " ]";
    }
    
}
