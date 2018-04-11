/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
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

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_horariocentro_t")
@NamedQueries({
    @NamedQuery(name = "MjHorariocentroT.findAll", query = "SELECT m FROM MjHorariocentroT m")
    , @NamedQuery(name = "MjHorariocentroT.findByIdhorariocentro", query = "SELECT m FROM MjHorariocentroT m WHERE m.idhorariocentro = :idhorariocentro")})
public class MjHorariocentroT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhorariocentro")
    private Integer idhorariocentro;
    @JoinColumn(name = "idconfig", referencedColumnName = "idconfig")
    @ManyToOne
    private MjConfiguracentro idconfig;
    @JoinColumn(name = "idhorarios", referencedColumnName = "idhorarios")
    @ManyToOne
    private MjHorariosT idhorarios;

    public MjHorariocentroT() {
    }

    public MjHorariocentroT(Integer idhorariocentro) {
        this.idhorariocentro = idhorariocentro;
    }

    public Integer getIdhorariocentro() {
        return idhorariocentro;
    }

    public void setIdhorariocentro(Integer idhorariocentro) {
        this.idhorariocentro = idhorariocentro;
    }

    public MjConfiguracentro getIdconfig() {
        return idconfig;
    }

    public void setIdconfig(MjConfiguracentro idconfig) {
        this.idconfig = idconfig;
    }

    public MjHorariosT getIdhorarios() {
        return idhorarios;
    }

    public void setIdhorarios(MjHorariosT idhorarios) {
        this.idhorarios = idhorarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhorariocentro != null ? idhorariocentro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjHorariocentroT)) {
            return false;
        }
        MjHorariocentroT other = (MjHorariocentroT) object;
        if ((this.idhorariocentro == null && other.idhorariocentro != null) || (this.idhorariocentro != null && !this.idhorariocentro.equals(other.idhorariocentro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjHorariocentroT[ idhorariocentro=" + idhorariocentro + " ]";
    }
    
}
