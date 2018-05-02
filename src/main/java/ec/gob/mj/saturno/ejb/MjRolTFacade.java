/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjRolT;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class MjRolTFacade extends AbstractFacade<MjRolT> implements MjRolTFacadeLocal {

    @PersistenceContext(unitName = "saturno")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MjRolTFacade() {
        super(MjRolT.class);
    }
    
}
