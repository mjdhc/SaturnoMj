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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *Mapeo de la tabla mj_Historico_t
 * 
 * @author cuevaw
 */
@Entity
@Table(name="mj_historico_t")
public class HistoricoASP implements Serializable{

   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private int idHistoico;
   
   @ManyToOne
   @JoinColumn(name="idGrupo")
   private ASP ASP;
   
   @ManyToOne
   @JoinColumn(name="idLugar")
   private Lugar Lugar;
   
   @Column(name ="estadoHistorico")
   private boolean estadoAsp;
   
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name ="fechaInicio")
   private Date fechaInicio;
    
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name ="fechaFin")
   private Date fechaFin;
    
   @Column(name ="reasignacion")
   private String reasignacion;
    
   @Column(name ="observacion")
   private String observacion;

    public int getIdHistoico() {
        return idHistoico;
    }

    public void setIdHistoico(int idHistoico) {
        this.idHistoico = idHistoico;
    }

    public ASP getASP() {
        return ASP;
    }

    public void setASP(ASP ASP) {
        this.ASP = ASP;
    }

    public Lugar getLugar() {
        return Lugar;
    }

    public void setLugar(Lugar Lugar) {
        this.Lugar = Lugar;
    }

    public boolean isEstadoAsp() {
        return estadoAsp;
    }

    public void setEstadoAsp(boolean estadoAsp) {
        this.estadoAsp = estadoAsp;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getReasignacion() {
        return reasignacion;
    }

    public void setReasignacion(String reasignacion) {
        this.reasignacion = reasignacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
     
  
   
   
   
   
}
