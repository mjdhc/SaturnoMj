/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.controller;

import ec.gob.mj.saturno.ejb.MjAsignacionTFacadeLocal;
import ec.gob.mj.saturno.ejb.MjLugarTFacadeLocal;
import ec.gob.mj.saturno.entities.MjAsignacionT;
import ec.gob.mj.saturno.entities.MjLugarT;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author root
 */
@Named
@ViewScoped
public class MjAsignacionTController implements Serializable {
//
//    @EJB/*Table Assignment interfaces for called methods from abstract class*/
//    private MjAsignacionTFacadeLocal assigmentEJB;
//    @EJB
//    private MjLugarTFacadeLocal placeEJB;
//    
//    List<MjLugarT> listPlacesAll;
//    
//    @Inject
//    private MjLugarT place;
//    @Inject
//    private MjAsignacionT assignmentTbl;
//
//    private Integer idPlace;
//    
//
//    public MjAsignacionT getAssignmentTbl() {
//        return assignmentTbl;
//    }
//
//    public void setAssignmentTbl(MjAsignacionT assignmentTbl) {
//        this.assignmentTbl = assignmentTbl;
//    }
//
//    public MjAsignacionTFacadeLocal getAssigmentEJB() {
//        return assigmentEJB;
//    }
//
//    //<editor-fold desc="Getters and Setters">
//    public void setAssigmentEJB(MjAsignacionTFacadeLocal assigmentEJB) {
//        this.assigmentEJB = assigmentEJB;
//    }
//
//    public Integer getIdPlace() {
//        return idPlace;
//    }
//
//    public void setIdPlace(Integer idPlace) {
//        this.idPlace = idPlace;
//    }
//
//    public List<MjLugarT> getListPlacesAll() {
//        return listPlacesAll;
//    }
//
//    public void setListPlacesAll(List<MjLugarT> listPlacesAll) {
//        this.listPlacesAll = listPlacesAll;
//    }
//
//    public MjLugarTFacadeLocal getPlaceEJB() {
//        return placeEJB;
//    }
//
//    public void setPlaceEJB(MjLugarTFacadeLocal placeEJB) {
//        this.placeEJB = placeEJB;
//    }
//
//    public MjLugarT getPlace() {
//        return place;
//    }
//
//    public void setPlace(MjLugarT place) {
//        this.place = place;
//    }
//    //</editor-fold>
//
//    @PostConstruct
//    public void init() {
//        listPlacesAll = placeEJB.findAll();  
//    }
//
//    public void updateAssigment() {
//        try {
//            assignmentTbl.setIdlugar(place);           
//            //assigmentEJB.edit(assignmentTbl);
//            //assigmentEJB.updateRowRegistres(assignmentTbl);
//           System.out.println("places id "+ assignmentTbl.getIdasignacion()+" "+assignmentTbl.getIdlugar()+" "+assignmentTbl.getObservaciones());
//           // assigmentEJB.edit(assignmentTbl);
//        } catch (Exception e) {
//            System.out.println("Error: "+ e.getMessage());
//             
//        }
//
//        
//    }

}
