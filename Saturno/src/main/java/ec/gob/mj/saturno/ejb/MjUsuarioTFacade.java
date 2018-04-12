/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjUsuarioT;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    @Override
    public MjUsuarioT login(MjUsuarioT usr) {
        MjUsuarioT user=null;
        String _query;
        try {
            _query = "SELECT u FROM MjUsuarioT u WHERE u.usuario= ?1 AND u.clave= ?2 ";
            Query query = em.createQuery(_query);
            query.setParameter(1, usr.getUsuario());
            query.setParameter(2, usr.getClave());
            List<MjUsuarioT> list_users = query.getResultList();
            if (!list_users.isEmpty()) {
                user = list_users.get(0);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
            user = null;
        }
        return user;
    }

}
