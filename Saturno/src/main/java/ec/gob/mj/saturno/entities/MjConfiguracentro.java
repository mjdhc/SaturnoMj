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

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_configuracentro")
@NamedQueries({
    @NamedQuery(name = "MjConfiguracentro.findAll", query = "SELECT m FROM MjConfiguracentro m")
    , @NamedQuery(name = "MjConfiguracentro.findByIdconfig", query = "SELECT m FROM MjConfiguracentro m WHERE m.idconfig = :idconfig")
    , @NamedQuery(name = "MjConfiguracentro.findByPeriodo", query = "SELECT m FROM MjConfiguracentro m WHERE m.periodo = :periodo")
    , @NamedQuery(name = "MjConfiguracentro.findByNumaspausentes", query = "SELECT m FROM MjConfiguracentro m WHERE m.numaspausentes = :numaspausentes")
    , @NamedQuery(name = "MjConfiguracentro.findByFechaguarda", query = "SELECT m FROM MjConfiguracentro m WHERE m.fechaguarda = :fechaguarda")})
public class MjConfiguracentro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconfig")
    private Integer idconfig;
    @Column(name = "periodo")
    private Integer periodo;
    @Column(name = "numaspausentes")
    private Integer numaspausentes;
    @Column(name = "fechaguarda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaguarda;
    @JoinColumn(name = "idcentro", referencedColumnName = "idcentro")
    @ManyToOne
    private MjCentroT idcentro;
    @OneToMany(mappedBy = "idconfig")
    private Collection<MjHorariocentroT> mjHorariocentroTCollection;

    public MjConfiguracentro() {
    }

    public MjConfiguracentro(Integer idconfig) {
        this.idconfig = idconfig;
    }

    public Integer getIdconfig() {
        return idconfig;
    }

    public void setIdconfig(Integer idconfig) {
        this.idconfig = idconfig;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Integer getNumaspausentes() {
        return numaspausentes;
    }

    public void setNumaspausentes(Integer numaspausentes) {
        this.numaspausentes = numaspausentes;
    }

    public Date getFechaguarda() {
        return fechaguarda;
    }

    public void setFechaguarda(Date fechaguarda) {
        this.fechaguarda = fechaguarda;
    }

    public MjCentroT getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(MjCentroT idcentro) {
        this.idcentro = idcentro;
    }

    public Collection<MjHorariocentroT> getMjHorariocentroTCollection() {
        return mjHorariocentroTCollection;
    }

    public void setMjHorariocentroTCollection(Collection<MjHorariocentroT> mjHorariocentroTCollection) {
        this.mjHorariocentroTCollection = mjHorariocentroTCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconfig != null ? idconfig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjConfiguracentro)) {
            return false;
        }
        MjConfiguracentro other = (MjConfiguracentro) object;
        if ((this.idconfig == null && other.idconfig != null) || (this.idconfig != null && !this.idconfig.equals(other.idconfig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjConfiguracentro[ idconfig=" + idconfig + " ]";
    }
    
}
