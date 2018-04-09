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
 * Mapeo de la tabla Mj_Genero_t
 * 
 * @author cuevaw
 */

@Entity
@Table(name="mj_genero_t")
public class Genero implements Serializable{
   
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private  int idGenero;
   
   @Column(name ="genero")
   private  String genero;
   
   @Column(name ="estadoGenero")
   private boolean estadoGenero;

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstadoGenero() {
        return estadoGenero;
    }

    public void setEstadoGenero(boolean estadoGenero) {
        this.estadoGenero = estadoGenero;
    }
   
   
}
