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
import javax.persistence.Lob;
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
@Table(name = "mj_asp_t")
@NamedQueries({
    @NamedQuery(name = "MjAspT.findAll", query = "SELECT m FROM MjAspT m")
    , @NamedQuery(name = "MjAspT.findByIdasp", query = "SELECT m FROM MjAspT m WHERE m.idasp = :idasp")
    , @NamedQuery(name = "MjAspT.findByIdgrupo", query = "SELECT m FROM MjAspT m WHERE m.idgrupo = :idgrupo")
    , @NamedQuery(name = "MjAspT.findByNombreasp", query = "SELECT m FROM MjAspT m WHERE m.nombreasp = :nombreasp")
    , @NamedQuery(name = "MjAspT.findByApellidoasp", query = "SELECT m FROM MjAspT m WHERE m.apellidoasp = :apellidoasp")
    , @NamedQuery(name = "MjAspT.findByEstadoasp", query = "SELECT m FROM MjAspT m WHERE m.estadoasp = :estadoasp")
    , @NamedQuery(name = "MjAspT.findByCedulaasp", query = "SELECT m FROM MjAspT m WHERE m.cedulaasp = :cedulaasp")
    , @NamedQuery(name = "MjAspT.findByCorreoasp", query = "SELECT m FROM MjAspT m WHERE m.correoasp = :correoasp")
    , @NamedQuery(name = "MjAspT.findByFechaingreso", query = "SELECT m FROM MjAspT m WHERE m.fechaingreso = :fechaingreso")})
public class MjAspT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idasp")
    private Integer idasp;
    @Size(max = 60)
    @Column(name = "nombreasp")
    private String nombreasp;
    @Size(max = 60)
    @Column(name = "apellidoasp")
    private String apellidoasp;
    @Column(name = "estadoasp")
    private Boolean estadoasp;
    @Size(max = 10)
    @Column(name = "cedulaasp")
    private String cedulaasp;
    @Size(max = 60)
    @Column(name = "correoasp")
    private String correoasp;
    @Column(name = "fechaingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaingreso;
    @Lob
    @Column(name = "fotoasp")
    private byte[] fotoasp;
    @OneToMany(mappedBy = "idasp")
    private Collection<MjAsignacionT> mjAsignacionTCollection;
    @OneToMany(mappedBy = "idasp")
    private Collection<MjJustificaT> mjJustificaTCollection;
    
    @JoinColumn(name = "idcentro", referencedColumnName = "idcentro")
    @ManyToOne
    private MjCentroT idcentro;
   
    @JoinColumn(name = "idgrupo",referencedColumnName = "idgrupo")
    @ManyToOne
    private  MjGrupoT idgrupo;
   
    @JoinColumn(name = "idgenero", referencedColumnName = "idgenero")
    @ManyToOne
    private MjGeneroT idgenero;
    
    @OneToMany(mappedBy = "idasp")
    private Collection<MjHistoricoT> mjHistoricoTCollection;

    public MjAspT() {
    }

    public MjAspT(Integer idasp) {
        this.idasp = idasp;
    }

    public Integer getIdasp() {
        return idasp;
    }

    public void setIdasp(Integer idasp) {
        this.idasp = idasp;
    }

    public MjGrupoT getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(MjGrupoT idgrupo) {
        this.idgrupo = idgrupo;
    }

  

    public String getNombreasp() {
        return nombreasp;
    }

    public void setNombreasp(String nombreasp) {
        this.nombreasp = nombreasp;
    }

    public String getApellidoasp() {
        return apellidoasp;
    }

    public void setApellidoasp(String apellidoasp) {
        this.apellidoasp = apellidoasp;
    }

    public Boolean getEstadoasp() {
        return estadoasp;
    }

    public void setEstadoasp(Boolean estadoasp) {
        this.estadoasp = estadoasp;
    }

    public String getCedulaasp() {
        return cedulaasp;
    }

    public void setCedulaasp(String cedulaasp) {
        this.cedulaasp = cedulaasp;
    }

    public String getCorreoasp() {
        return correoasp;
    }

    public void setCorreoasp(String correoasp) {
        this.correoasp = correoasp;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public byte[] getFotoasp() {
        return fotoasp;
    }

    public void setFotoasp(byte[] fotoasp) {
        this.fotoasp = fotoasp;
    }

    public Collection<MjAsignacionT> getMjAsignacionTCollection() {
        return mjAsignacionTCollection;
    }

    public void setMjAsignacionTCollection(Collection<MjAsignacionT> mjAsignacionTCollection) {
        this.mjAsignacionTCollection = mjAsignacionTCollection;
    }

    public Collection<MjJustificaT> getMjJustificaTCollection() {
        return mjJustificaTCollection;
    }

    public void setMjJustificaTCollection(Collection<MjJustificaT> mjJustificaTCollection) {
        this.mjJustificaTCollection = mjJustificaTCollection;
    }

    public MjCentroT getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(MjCentroT idcentro) {
        this.idcentro = idcentro;
    }

    public MjGeneroT getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(MjGeneroT idgenero) {
        this.idgenero = idgenero;
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
        hash += (idasp != null ? idasp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjAspT)) {
            return false;
        }
        MjAspT other = (MjAspT) object;
        if ((this.idasp == null && other.idasp != null) || (this.idasp != null && !this.idasp.equals(other.idasp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjAspT[ idasp=" + idasp + " ]";
    }
    
}
