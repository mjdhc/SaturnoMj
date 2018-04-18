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

@Named
@ViewScoped
public class VListAssignmentController implements Serializable {

    @EJB
    private VListAssignmentFacadeLocal viewAssignmentEJB;
    private VListAssignment Assignment;
    private List<VListAssignment> listAssigments;
    private Integer flagChecked = 0;
    private String testlabel;

    public String getTestlabel() {
        return testlabel;
    }

    public void setTestlabel(String testlabel) {
        this.testlabel = testlabel;
    }
    

    public Integer getFlagChecked() {
        return flagChecked;
    }

    /*Secction Getters And Setters*/
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

    /*Section Construct */
    @PostConstruct
    public void init() {
        
        listAssigments = viewAssignmentEJB.findAll();
        //listAssigments=viewAssignmentEJB.findListAssignments();
        //Assignment = new VListAssignment();
    }

    
    public void doSomething() {
        System.out.println("Hello word");
        this.testlabel="hello";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("test", "test"));
        // Now, we move to another page...

    }

}
