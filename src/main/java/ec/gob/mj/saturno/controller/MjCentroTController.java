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
import ec.gob.mj.saturno.ejb.MjCentroTFacadeLocal;
import ec.gob.mj.saturno.entities.MjCentroT;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

@Named
@ViewScoped
public class MjCentroTController implements Serializable {

    @EJB
    private MjCentroTFacadeLocal centerEJB;
    private MjCentroT center;
    private List<MjCentroT> listCenters;

    public MjCentroTFacadeLocal getCenterEJB() {
        return centerEJB;
    }

    public void setCenterEJB(MjCentroTFacadeLocal centerEJB) {
        this.centerEJB = centerEJB;
    }

    public MjCentroT getCenter() {
        return center;
    }
    
    

    public void setCenter(MjCentroT center) {
        this.center = center;
    }

    public List<MjCentroT> getListCenters() {
        return listCenters;
    }

    public void setListCenters(List<MjCentroT> listCenters) {
        this.listCenters = listCenters;
    }

    @PostConstruct
    public void init() {
        listCenters = centerEJB.findAll();
        center = new MjCentroT();
    }

    public void onRowEdit(RowEditEvent event) {
        try {
            center = new MjCentroT();
            center = (MjCentroT) event.getObject();
            centerEJB.edit(center);
            FacesMessage msg = new FacesMessage("Centro Editado", ((MjCentroT) event.getObject()).getNombrecentro());
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("Error: ", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Cancelado", ((MjCentroT) event.getObject()).getNombrecentro());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Centro Actualizado", "Anterior: " + oldValue + ", Nuevo:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void register() {
        try {
            centerEJB.create(center);
            FacesMessage msg = new FacesMessage("Centro Creado",center.getNombrecentro());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("Error: ",e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }

}
