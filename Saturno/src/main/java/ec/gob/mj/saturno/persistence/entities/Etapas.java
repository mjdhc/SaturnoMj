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
public class Etapas implements Serializable{
    @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idEtapas; 
    
    @Column(name ="etapas")
    private String etapas;
    
    @Column(name ="estadoEtapas")
    private boolean estadoEtapas;
    
   @ManyToOne
   @JoinColumn(name="idCentro")
    private Centros Centros;

    public int getIdEtapas() {
        return idEtapas;
    }

    public void setIdEtapas(int idEtapas) {
        this.idEtapas = idEtapas;
    }

    public String getEtapas() {
        return etapas;
    }

    public void setEtapas(String etapas) {
        this.etapas = etapas;
    }

    public boolean isEstadoEtapas() {
        return estadoEtapas;
    }

    public void setEstadoEtapas(boolean estadoEtapas) {
        this.estadoEtapas = estadoEtapas;
    }

    public Centros getCentros() {
        return Centros;
    }

    public void setCentros(Centros Centros) {
        this.Centros = Centros;
    }
    
   
}
