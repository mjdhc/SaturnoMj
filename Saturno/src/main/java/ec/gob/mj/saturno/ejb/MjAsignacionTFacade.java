/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjAsignacionT;
import ec.gob.mj.saturno.entities.VListAssignment;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author root
 */
@Stateless
public class MjAsignacionTFacade extends AbstractFacade<MjAsignacionT> implements MjAsignacionTFacadeLocal {

    @PersistenceContext(unitName = "saturno")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MjAsignacionTFacade() {
        super(MjAsignacionT.class);
    }

    @Override
    public Boolean updateRowRegistres(MjAsignacionT asign) {
        
        String q = "";
        Boolean flagUpdate = false;
        try {
            q = "UPDATE MjAsignacionT SET idasp = ?1, idlugar = ?2, fechainicio=?3, fechafin=?4, fechaasignacion=?5, observaciones = ?6, estadoasignacion=?7 WHERE idasignacion=?8 ";
            Query query = em.createQuery(q);
            query.setParameter(1, asign.getIdasp());
            query.setParameter(2, asign.getIdlugar());
            query.setParameter(3, asign.getFechainicio());
            query.setParameter(4, asign.getFechafin());
            query.setParameter(5, asign.getFechaasignacion());
            query.setParameter(6, asign.getObservaciones());
            query.setParameter(7, asign.getEstadoasignacion());
            query.setParameter(8, asign.getIdasignacion());
            if (((Integer) query.executeUpdate()) > 0) {
                flagUpdate = true;
            }
        } catch (Exception e) {

            System.out.println("Error Update Row Registers: " + e.getMessage());
        }
        return flagUpdate;
    }
    
}
