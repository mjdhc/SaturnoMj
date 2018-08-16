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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "mj_grupo_t")
@NamedQueries({
    @NamedQuery(name = "MjGrupoT.findAll", query = "SELECT m FROM MjGrupoT m")
    , @NamedQuery(name = "MjGrupoT.findByIdgrupo", query = "SELECT m FROM MjGrupoT m WHERE m.idgrupo = :idgrupo")
    , @NamedQuery(name = "MjGrupoT.findByGrupo", query = "SELECT m FROM MjGrupoT m WHERE m.grupo = :grupo")
    , @NamedQuery(name = "MjGrupoT.findByEstadogrupo", query = "SELECT m FROM MjGrupoT m WHERE m.estadogrupo = :estadogrupo")})
public class MjGrupoT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgrupo")
    private Integer idgrupo;
    @Size(max = 50)
    @Column(name = "grupo")
    private String grupo;
    @Column(name = "estadogrupo")
    private Boolean estadogrupo;

    public MjGrupoT() {
    }

    public MjGrupoT(Integer idgrupo) {
        this.idgrupo = idgrupo;
    }

    public Integer getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Integer idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Boolean getEstadogrupo() {
        return estadogrupo;
    }

    public void setEstadogrupo(Boolean estadogrupo) {
        this.estadogrupo = estadogrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrupo != null ? idgrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MjGrupoT)) {
            return false;
        }
        MjGrupoT other = (MjGrupoT) object;
        if ((this.idgrupo == null && other.idgrupo != null) || (this.idgrupo != null && !this.idgrupo.equals(other.idgrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.mj.saturno.entities.MjGrupoT[ idgrupo=" + idgrupo + " ]";
    }
    
}
