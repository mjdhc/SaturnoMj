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
import javax.persistence.Table;

/**
 *
 * @author root
 */
@Entity
@Table(name="mj_centro_t")

public class Centros implements Serializable {
    
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private  int idcentro;
   
   @Column(name ="nombrecentro")
   private  String nombrecentro;
   
    @Column(name ="desccentro")
   private String desccentro;
   
   @Column(name ="estadocentro")
   private boolean estadocentro;

    public int getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(int idcentro) {
        this.idcentro = idcentro;
    }

    public String getNombrecentro() {
        return nombrecentro;
    }

    public void setNombrecentro(String nombrecentro) {
        this.nombrecentro = nombrecentro;
    }

    public String getDesccentro() {
        return desccentro;
    }

    public void setDesccentro(String desccentro) {
        this.desccentro = desccentro;
    }

    public boolean isEstadocentro() {
        return estadocentro;
    }

    public void setEstadocentro(boolean estadocentro) {
        this.estadocentro = estadocentro;
    }

 
  
   
   
   
 
 
 
    
}
