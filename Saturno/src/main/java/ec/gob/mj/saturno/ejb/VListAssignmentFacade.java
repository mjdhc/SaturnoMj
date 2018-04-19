/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjLugarT;
import ec.gob.mj.saturno.entities.VListAssignment;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

/**
 *
 * @author root
 */
@Stateless
public class VListAssignmentFacade extends AbstractFacade<VListAssignment> implements VListAssignmentFacadeLocal {

    @PersistenceContext(unitName = "saturno")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VListAssignmentFacade() {
        super(VListAssignment.class);
    }

    @Override
    public List<VListAssignment> findListAssignments() {
        TypedQuery<VListAssignment> query = em.createNamedQuery("VListAssignment.findAll", VListAssignment.class);
        List<VListAssignment> ListAssignments = query.getResultList();
        return ListAssignments;
    }

    @Override
    public List<VListAssignment> findListAssignmentsWithParamater(int idGroup) {
        List<VListAssignment> ListAssignmentsParam = null;
        try {
            StoredProcedureQuery query = em.createNamedStoredProcedureQuery("findByIdGroupProcedure").setParameter("idgroup", idGroup);
            query.execute();
            ListAssignmentsParam = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            ListAssignmentsParam = null;
        }

        return ListAssignmentsParam;
    }

    @Override
    public List<String> listPlaces() {
        List<MjLugarT> placesDataSource = null;
        List<String> listPlaces = null;
        try {
            TypedQuery<MjLugarT> query = em.createNamedQuery("MjLugarT.findAll", MjLugarT.class);
            placesDataSource = query.getResultList();
            listPlaces = new ArrayList<String>();
            for (MjLugarT place : placesDataSource) {
                listPlaces.add(place.getDescripcion());
                //System.out.println("" + place.getDescripcion());
            }
        } catch (Exception e) {
            listPlaces = null;
            System.out.println("Error List places: " + e.getMessage());
        }

        return listPlaces;
    }

}
