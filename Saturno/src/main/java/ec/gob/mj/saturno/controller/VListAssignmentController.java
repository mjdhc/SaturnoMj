/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.controller;

/**
 *
 * @author OIpiales
 */
import ec.gob.mj.saturno.ejb.VListAssignmentFacadeLocal;
import ec.gob.mj.saturno.entities.MjLugarT;
import ec.gob.mj.saturno.entities.VListAssignment;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Query;
/*  start temporal packages*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIColumn;
import javax.faces.context.FacesContext;


/*end temporal packages*/
@Named
@ViewScoped
public class VListAssignmentController implements Serializable {

    @EJB
    private VListAssignmentFacadeLocal viewAssignmentEJB;
    private VListAssignment Assignment;
    private List<VListAssignment> listAssigments;
    private List<MjLugarT> listplaces;
    private Integer flagChecked = 0;

    private String jobschedule = "Seleccione ";
    private Map<String, String> jobSchedules;

    public Integer getFlagChecked() {
        return flagChecked;
    }

    //<editor-fold desc="Getters And Setters">
    /*Secction Getters And Setters*/
    public List<MjLugarT> getListplaces() {
        return listplaces;
    }

    public void setListplaces(List<MjLugarT> listplaces) {
        this.listplaces = listplaces;
    }

    public String getJobschedule() {
        return jobschedule;
    }

    public void setJobschedule(String jobschedule) {
        this.jobschedule = jobschedule;
    }

    public Map<String, String> getJobSchedules() {
        return jobSchedules;
    }

    public void setJobSchedules(Map<String, String> jobSchedules) {
        this.jobSchedules = jobSchedules;
    }

    public void setFlagChecked(Integer flagChecked) {
        this.flagChecked = flagChecked;
    }

    public VListAssignmentFacadeLocal getViewAssignmentEJB() {
        return viewAssignmentEJB;
    }

    public void setViewAssignmentEJB(VListAssignmentFacadeLocal viewAssignmentEJB) {
        this.viewAssignmentEJB = viewAssignmentEJB;
    }

    public VListAssignment getAssignment() {
        return Assignment;
    }

    public void setAssignment(VListAssignment Assignment) {
        this.Assignment = Assignment;
    }

    public List<VListAssignment> getListAssigments() {
        return listAssigments;
    }

    public void setListAssigments(List<VListAssignment> listAssigments) {
        this.listAssigments = listAssigments;
    }
    
    //</editor-fold>

    //<editor-fold desc="Construct">
    /*Section Construct */
    @PostConstruct
    public void init() {

        System.out.println("Init");
        listAssigments = viewAssignmentEJB.findAll();
        listplaces = viewAssignmentEJB.listPlaces();
        jobSchedules = new HashMap<String, String>();
        jobSchedules.put("Guardia", "Guardia");
        jobSchedules.put("Retenes", "Retenes");
        //listAssigments=viewAssignmentEJB.findListAssignments();
        //Assignment = new VListAssignment();
    }
    //</editor-fold>

    
    //<editor-fold desc="Methods">
    /*Methods*/
    public void onJobScheduleChange() {
        if (jobschedule != null && !jobschedule.equals("")) {
            jobschedule = jobSchedules.get(jobschedule);
            if (jobschedule.equals("Retenes")) {
                listAssigments = viewAssignmentEJB.findListAssignmentsWithParamater(2);
            } else {
                listAssigments = viewAssignmentEJB.findListAssignmentsWithParamater(1);
            }

        } else {
            jobschedule = "Guardia";
        }
    }
    
    //</editor-fold>

}
