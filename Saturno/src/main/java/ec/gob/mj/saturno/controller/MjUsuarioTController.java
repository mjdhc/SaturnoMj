/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.controller;

/**
 *
 * @author Odilo Ipiales
 */
import ec.gob.mj.saturno.ejb.MjUsuarioTFacadeLocal;
import ec.gob.mj.saturno.entities.MjUsuarioT;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Query;

@Named
@ViewScoped
public class MjUsuarioTController implements Serializable {

    @EJB
    private MjUsuarioTFacadeLocal UsersEJB;
    private MjUsuarioT user;

    public MjUsuarioTFacadeLocal getUsersEJB() {
        return UsersEJB;
    }

    public void setUsersEJB(MjUsuarioTFacadeLocal UsersEJB) {
        this.UsersEJB = UsersEJB;
    }

    public MjUsuarioT getUser() {
        return user;
    }

    public void setUser(MjUsuarioT user) {
        this.user = user;
    }

    @PostConstruct
    public void init() {
        user = new MjUsuarioT();
    }

    public void register() {
        try {
            UsersEJB.create(user);
        } catch (Exception e) {
        }
    }

    public String loginSession() {
        String redirection = null;
        try {
            if (UsersEJB.login(user) != null) {
                redirection = "home?faces-redirect=true";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "No existe usuario"));
                redirection = "index";
            }

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
            redirection = "index";
        }

        return redirection;
    }
}
