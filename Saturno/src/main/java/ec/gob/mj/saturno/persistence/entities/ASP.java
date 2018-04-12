/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.persistence.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *Mapeo de la tabla mj_asp_t 
 * @author cuevaw
 */
@Entity
@Table(name="mj_horarios_t")
public class ASP  implements Serializable{

   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private  int idAsp;
     
   @OneToOne
   @JoinColumn(name="idGrupo")
   private Grupos Grupos;
   
   @ManyToOne
   @JoinColumn(name="idCentro")
   private Centros Centros;
   
   @OneToOne
   @JoinColumn(name="idGenero")
   private Genero Genero;
      
   @Column(name ="nombreAsp")
   private String nombreAsp;
   
   @Column(name ="apellidosAsp")
   private String apellidosAsp;
   
   @Column(name ="estadoAsp")
   private boolean estadoAsp;
   
   @Column(name ="cedulaAsp")
   private String cedulaAsp;
   
   @Column(name ="correoAsp")
   private String correoAsp;
      
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name ="fechaIngreso")
   private Date fechaIngreso;
  
   @Column(name ="fotoAsp")
   private String fotoAsp;

    public int getIdAsp() {
        return idAsp;
    }

    public void setIdAsp(int idAsp) {
        this.idAsp = idAsp;
    }

    public Grupos getGrupos() {
        return Grupos;
    }

    public void setGrupos(Grupos Grupos) {
        this.Grupos = Grupos;
    }

    public Centros getCentros() {
        return Centros;
    }

    public void setCentros(Centros Centros) {
        this.Centros = Centros;
    }

    public Genero getGenero() {
        return Genero;
    }

    public void setGenero(Genero Genero) {
        this.Genero = Genero;
    }

    public String getNombreAsp() {
        return nombreAsp;
    }

    public void setNombreAsp(String nombreAsp) {
        this.nombreAsp = nombreAsp;
    }

    public String getApellidosAsp() {
        return apellidosAsp;
    }

    public void setApellidosAsp(String apellidosAsp) {
        this.apellidosAsp = apellidosAsp;
    }

    public boolean isEstadoAsp() {
        return estadoAsp;
    }

    public void setEstadoAsp(boolean estadoAsp) {
        this.estadoAsp = estadoAsp;
    }

    public String getCedulaAsp() {
        return cedulaAsp;
    }

    public void setCedulaAsp(String cedulaAsp) {
        this.cedulaAsp = cedulaAsp;
    }

    public String getCorreoAsp() {
        return correoAsp;
    }

    public void setCorreoAsp(String correoAsp) {
        this.correoAsp = correoAsp;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFotoAsp() {
        return fotoAsp;
    }

    public void setFotoAsp(String fotoAsp) {
        this.fotoAsp = fotoAsp;
    }
   
   
   
   
   
   
   
    
}
