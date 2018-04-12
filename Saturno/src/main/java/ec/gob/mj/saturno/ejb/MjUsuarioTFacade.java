/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjUsuarioT;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class MjUsuarioTFacade extends AbstractFacade<MjUsuarioT> implements MjUsuarioTFacadeLocal {

    @PersistenceContext(unitName = "saturno")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MjUsuarioTFacade() {
        super(MjUsuarioT.class);
    }

    public MjUsuarioT login() {
        MjUsuarioT usuer = null;
        String query;
        try {
            query = "select * from mj_usuario_t u where u.usuario='suarezf' and u.clave='12345'";
        } catch (Exception e) {
        } finally {

        }
        return null;
    }

}
