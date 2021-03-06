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
import ec.gob.mj.saturno.ejb.MjAsignacionTFacadeLocal;
import ec.gob.mj.saturno.ejb.MjLugarTFacadeLocal;
import ec.gob.mj.saturno.ejb.VListAssignmentFacadeLocal;
import ec.gob.mj.saturno.entities.MjAsignacionT;
import ec.gob.mj.saturno.entities.MjAspT;
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
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIColumn;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import org.primefaces.component.message.Message;
import org.primefaces.event.RowEditEvent;


/*end temporal packages*/
@Named
@ViewScoped
@SessionScoped
public class VListAssignmentController implements Serializable {

    @EJB
    private VListAssignmentFacadeLocal viewAssignmentEJB;
    @EJB
    private MjAsignacionTFacadeLocal assignmentEJB;
    @EJB
    private MjLugarTFacadeLocal placeEJB;
    List<MjLugarT> listPlacesAll;

    @Inject
    private MjLugarT place;
    @Inject
    private MjAspT asp;
    @Inject
    private MjAsignacionT assignmentTbl;

    private VListAssignment Assignment;
    private List<VListAssignment> listAssigments;
    private List<MjLugarT> listplaces;

    private Integer flagChecked = 0;
    private MjAsignacionT assign;

    private String jobschedule = "Seleccione ";
    private Map<String, String> jobSchedules;

    public Integer getFlagChecked() {
        return flagChecked;
    }

    //<editor-fold desc="Getters And Setters">
    /*Secction Getters And Setters*/
    public MjLugarTFacadeLocal getPlaceEJB() {
        return placeEJB;
    }

    public void setPlaceEJB(MjLugarTFacadeLocal placeEJB) {
        this.placeEJB = placeEJB;
    }

    public List<MjLugarT> getListPlacesAll() {
        return listPlacesAll;
    }

    public void setListPlacesAll(List<MjLugarT> listPlacesAll) {
        this.listPlacesAll = listPlacesAll;
    }

    public MjAsignacionT getAssignmentTbl() {
        return assignmentTbl;
    }

    public void setAssignmentTbl(MjAsignacionT assignmentTbl) {
        this.assignmentTbl = assignmentTbl;
    }

    public MjAsignacionTFacadeLocal getAssignmentEJB() {
        return assignmentEJB;
    }

    public void setAssignmentEJB(MjAsignacionTFacadeLocal assignmentEJB) {
        this.assignmentEJB = assignmentEJB;
    }

    public List<MjLugarT> getListplaces() {
        return listplaces;
    }

    public void setListplaces(List<MjLugarT> listplaces) {
        this.listplaces = listplaces;
    }

    public MjAsignacionT getAssign() {
        return assign;
    }

    public void setAssign(MjAsignacionT assign) {
        this.assign = assign;
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

    public MjLugarT getPlace() {
        return place;
    }

    public void setPlace(MjLugarT place) {
        this.place = place;
    }

    //</editor-fold>
    //<editor-fold desc="Construct">
    /*Section Construct */
    @PostConstruct
    public void init() {
        System.out.println("Init");
        listAssigments = viewAssignmentEJB.joinJpaAssigments();
        listplaces = viewAssignmentEJB.listPlaces();

        jobSchedules = new HashMap<String, String>();
        jobSchedules.put("Guardia", "Guardia");
        jobSchedules.put("Retenes", "Retenes");
        listPlacesAll = placeEJB.findAll();
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

    public void getRowEdit(VListAssignment viewAssigment) {

        Assignment = viewAssigment;
        assignmentTbl.setIdasignacion(Assignment.getId());
        asp.setIdasp(Assignment.getIdasp());
    }

    public void setPlaceOnchage(final AjaxBehaviorEvent event) {
        String h = (String) event.getComponent().getAttributes().get("placekey");

        System.out.println(" do something: " + h);

    }

    public void updateAssigment() {
        try {
            /*System.out.println("idAssignment " + assignmentTbl.getIdasignacion() + " " + assignmentTbl.getIdlugar() + " " + assignmentTbl.getObservaciones());
            System.out.println("placeId: " + place.getIdlugar() + "   aspId " + asp.getIdasp());*/

            assignmentTbl.setIdlugar(place);
            assignmentTbl.setIdasp(asp);
            assignmentTbl.setFechainicio(Assignment.getDatefrom());
            assignmentTbl.setFechafin(Assignment.getDateto());
            assignmentTbl.setFechaasignacion(Assignment.getDateassignment());
            assignmentTbl.setEstadoasignacion(Assignment.getStatus());
            assignmentTbl.setObservaciones(Assignment.getRemarks());
            assignmentEJB.updateRowRegistres(assignmentTbl);
            listAssigments = new ArrayList<VListAssignment>();
            listAssigments = viewAssignmentEJB.joinJpaAssigments();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro", "Actualizado"));

            /*System.out.println("idAssignment: " + assignmentTbl.getIdasignacion() + " " + assignmentTbl.getIdlugar() + " " + assignmentTbl.getObservaciones());*/
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "" + e.getMessage()));
        }

    }

    public void approveListAssignement() {
        try {
            for (MjAsignacionT assigment : (assignmentEJB.findAll())) {
                assigment.setEstadoasignacion(Boolean.TRUE);
                assignmentEJB.updateRowRegistres(assigment);
            }

            listAssigments = new ArrayList<VListAssignment>();
            listAssigments = viewAssignmentEJB.joinJpaAssigments();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registros", "Aprobados"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "" + e.getMessage()));
        }

    }

    //</editor-fold>
}
