/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.controller;

import ec.gob.mj.saturno.ejb.MjLugarTFacadeLocal;
import ec.gob.mj.saturno.entities.MjLugarT;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author OIpiales
 */
@Named
@ViewScoped
public class MjLugarTController implements Serializable {

    @EJB
    private MjLugarTFacadeLocal placeEJB;
    List<MjLugarT> listPlacesAll;
    private MjLugarT place;
    //<editor-fold desc="Getters and Setters">

    public List<MjLugarT> getListPlacesAll() {
        return listPlacesAll;
    }

    public void setListPlacesAll(List<MjLugarT> listPlacesAll) {
        this.listPlacesAll = listPlacesAll;
    }

    public MjLugarTFacadeLocal getPlaceEJB() {
        return placeEJB;
    }

    public void setPlaceEJB(MjLugarTFacadeLocal placeEJB) {
        this.placeEJB = placeEJB;
    }

    public MjLugarT getPlace() {
        return place;
    }

    public void setPlace(MjLugarT place) {
        this.place = place;
    }
    //</editor-fold>

    @PostConstruct
    public void init() {
        listPlacesAll = placeEJB.findAll();
        place = new MjLugarT();
    }

  

}
