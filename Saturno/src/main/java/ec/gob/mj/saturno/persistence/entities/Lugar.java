/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.persistence.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cuevaw
 */

@Entity
@Table(name="mj_etapas_t")
public class Lugar implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idLugar; 
    
   @ManyToOne
   @JoinColumn(name="idEtapas")
    private Centros idEtapas;
   
   @Column(name ="lugar")
   private String lugar;
   
   @Column(name ="descripcion")
   private String descripcion;
   
   @Column(name ="minAsp")
   private int minAsp;
   
   @Column(name ="maxAsp")
   private int maxAsp;
    
   @Column(name ="minAsp")
   private int personal;
   
   @Column(name ="estadoLugar")
   private int estadoLugar;

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public Centros getIdEtapas() {
        return idEtapas;
    }

    public void setIdEtapas(Centros idEtapas) {
        this.idEtapas = idEtapas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMinAsp() {
        return minAsp;
    }

    public void setMinAsp(int minAsp) {
        this.minAsp = minAsp;
    }

    public int getMaxAsp() {
        return maxAsp;
    }

    public void setMaxAsp(int maxAsp) {
        this.maxAsp = maxAsp;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    public int getEstadoLugar() {
        return estadoLugar;
    }

    public void setEstadoLugar(int estadoLugar) {
        this.estadoLugar = estadoLugar;
    }
     
}
