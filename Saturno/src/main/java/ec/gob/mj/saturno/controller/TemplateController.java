/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.controller;

import ec.gob.mj.saturno.entities.MjUsuarioT;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author OIpiales
 */
@Named
@ViewScoped
public class TemplateController implements Serializable{
   
    public void checkSession(){
        try {
            FacesContext contentx=FacesContext.getCurrentInstance();
            MjUsuarioT userSession = (MjUsuarioT)contentx.getExternalContext().getSessionMap().get("usrSession");
            if (userSession==null) {
               contentx.getExternalContext().redirect("./../permits.xhtml");
            }
        } catch (Exception e) {
            System.out.println("Error Sssion: "+e.getMessage());
        }
    }
    
}
