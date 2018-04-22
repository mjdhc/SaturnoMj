/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.controller;

import ec.gob.mj.saturno.ejb.MjCentroTFacadeLocal;
import ec.gob.mj.saturno.entities.MjCentroT;
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
public class MjGrupoTController implements Serializable{
    @EJB
    private MjCentroTFacadeLocal centrosEJB;
    private MjCentroT center;

    public MjCentroTFacadeLocal getCentrosEJB() {
        return centrosEJB;
    }

    public void setCentrosEJB(MjCentroTFacadeLocal centrosEJB) {
        this.centrosEJB = centrosEJB;
    }

    public MjCentroT getCenter() {
        return center;
    }

    public void setCenter(MjCentroT center) {
        this.center = center;
    }
    
     @PostConstruct
      public void init(){
      center =new MjCentroT();
      }

      public void register(){
          try {
              centrosEJB.create(center);
          } catch (Exception e) {
          }
      }
    
}
