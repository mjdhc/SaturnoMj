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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *Mapeo de la tabla mj_horarios_t
 * 
 * @author cuevaw
 */

@Entity
@Table(name="mj_horarios_t")
public class Horarios  implements Serializable{
    
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private  int idHorarios;
   
   @Column(name ="horario")
   private  String horario;
   
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name ="horaInicio")
   private Date horaInicio;
   
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name ="horaFin")
   private Date horaFin;
    
   @Column(name ="numHoras")
   private int numHoras;
    
   @Column(name ="estadoHorario")
   private boolean estadoHorario;

    public int getIdHorarios() {
        return idHorarios;
    }

    public void setIdHorarios(int idHorarios) {
        this.idHorarios = idHorarios;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public boolean isEstadoHorario() {
        return estadoHorario;
    }

    public void setEstadoHorario(boolean estadoHorario) {
        this.estadoHorario = estadoHorario;
    }
   
}
