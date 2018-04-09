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
 * Mapeo de la tabla mj_grupo_t
 * 
 * @author cuevaw
 */
@Entity
@Table(name="mj_grupo_t")
public class Grupos implements Serializable{
     @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private  int idGrupo;
   
   @Column(name ="grupo")
   private  String grupo;
   
   @Column(name ="estadoGrupo")
   private boolean estadoGrupo;

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean isEstadoGrupo() {
        return estadoGrupo;
    }

    public void setEstadoGrupo(boolean estadoGrupo) {
        this.estadoGrupo = estadoGrupo;
    }
   
   
   
   
}
