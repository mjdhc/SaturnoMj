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

//    public String validateUser() {
//
//        FacesMessage msg;
//
//        if (verificarUsuario()) {
//
//            return "home?faces-redirect=true";
//        }
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario", "El usuario o la contraseña no son los correctos"));
//        System.out.println("Credenciales Fallidas");
//        return "login";
//    }

//    private boolean verificarUsuario() {
//        boolean flagFindUser = false;
//
//        try {
//            UserImplementDAO userIDao = new UserImplementDAO();
//
//            Usuario u = userIDao.getUserKey(this.user, this.password);
//            if (u != null) {
//                // System.out.println(" find UserBean: "+u.getUsuario());
//                flagFindUser = true;
//            }
//
//        } catch (Exception e) {
//
//            System.out.println("Error find UserBean: " + e.getMessage());
//            flagFindUser = false;
//        }
//        return flagFindUser;
//    }

}
