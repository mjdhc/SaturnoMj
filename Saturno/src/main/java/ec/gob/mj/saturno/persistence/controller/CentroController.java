/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.persistence.controller;

import ec.gob.mj.saturno.persistence.ejb.CentrosFacadeLocal;
import ec.gob.mj.saturno.persistence.entities.Centros;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author root
 */
@Named
@ViewScoped
public class CentroController implements Serializable {

    @EJB
    private CentrosFacadeLocal centrosEJB;
    private Centros Centros;

    public CentrosFacadeLocal getCentrosEJB() {
        return centrosEJB;
    }

    public void setCentrosEJB(CentrosFacadeLocal centrosEJB) {
        this.centrosEJB = centrosEJB;
    }

    public Centros getCentros() {
        return Centros;
    }

    public void setCentros(Centros Centros) {
        this.Centros = Centros;
    }

    @PostConstruct
    public void init() {
        Centros = new Centros();
    }
    
    public void registrar(){
        try {
            centrosEJB.create(Centros);
        } catch (Exception e) {
        }
    }

}
