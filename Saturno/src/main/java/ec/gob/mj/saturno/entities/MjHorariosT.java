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
@Table(name = "mj_horarios_t")
@NamedQueries({
    @NamedQuery(name = "MjHorariosT.findAll", query = "SELECT m FROM MjHorariosT m")
    , @NamedQuery(name = "MjHorariosT.findByIdhorarios", query = "SELECT m FROM MjHorariosT m WHERE m.idhorarios = :idhorarios")
    , @NamedQuery(name = "MjHorariosT.findByHorario", query = "SELECT m FROM MjHorariosT m WHERE m.horario = :horario")
    , @NamedQuery(name = "MjHorariosT.findByHorainicio", query = "SELECT m FROM MjHorariosT m WHERE m.horainicio = :horainicio")
    , @NamedQuery(name = "MjHorariosT.findByHorafin", query = "SELECT m FROM MjHorariosT m WHERE m.horafin = :horafin")
    , @NamedQuery(name = "MjHorariosT.findByNumhoras", query = "SELECT m FROM MjHorariosT m WHERE m.numhoras = :numhoras")
    , @NamedQuery(name = "MjHorariosT.findByEstadohorario", query = "SELECT m FROM MjHorariosT m WHERE m.estadohorario = :estadohorario")})
public class MjHorariosT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhorarios")
    private Integer idhorarios;
    @Size(max = 20)
    @Column(name = "horario")
    private String horario;
    @Column(name = "horainicio")
    @Temporal(TemporalType.TIME)
    private Date horainicio;
    @Column(name = "horafin")
    @Temporal(TemporalType.TIME)
    private Date horafin;
    @Column(name = "numhoras")
    private Integer numhoras;
    @Column(name = "estadohorario")
    private Boolean estadohorario;
    @OneToMany(mappedBy = "idhorarios")
    private Collection<MjHorariocentroT> mjHorariocentroTCollection;

    public MjHorariosT() {
    }

    public MjHorariosT(Integer idhorarios) {
        this.idhorarios = idhorarios;
    }

    public Integer getIdhorarios() {
        return idhorarios;
    }

    public void setIdhorarios(Integer idhorarios) {
        this.idhorarios = idhorarios;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getHorafin() {
        return horafin;
    }

    public void setHorafin(Date horafin) {
        this.horafin = horafin;
    }

    public Integer getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(Integer numhoras) {
        this.numhoras = numhoras;
    }

    public Boolean getEstadohorario() {
        return estadohorario;
    }

    public void setEstadohorario(Boolean estadohorario) {
        this.estadohorario = estadohorario;
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
        hash += (idhorarios != null ? idhorarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjHorariosT)) {
            return false;
        }
        MjHorariosT other = (MjHorariosT) object;
        if ((this.idhorarios == null && other.idhorarios != null) || (this.idhorarios != null && !this.idhorarios.equals(other.idhorarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjHorariosT[ idhorarios=" + idhorarios + " ]";
    }
    
}
