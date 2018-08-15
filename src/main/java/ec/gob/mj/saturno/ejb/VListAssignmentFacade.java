/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjAsignacionT;
import ec.gob.mj.saturno.entities.MjLugarT;
import ec.gob.mj.saturno.entities.VListAssignment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

/**
 *
 * @author OIpiales
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
    public List<MjLugarT> listPlaces() {
        List<MjLugarT> listPlacesAll = null;

        try {
            TypedQuery<MjLugarT> query = em.createNamedQuery("MjLugarT.findAll", MjLugarT.class);
            listPlacesAll = query.getResultList();

        } catch (Exception e) {
            System.out.println("Error List places: " + e.getMessage());
        }

        return listPlacesAll;
    }

    @Override
    public List<VListAssignment> viewInnerJoin() {
        VListAssignment assignEntity;
        List<VListAssignment> listAssigment = null;
        List<Object[]> list_assignment = null;
        String _query;
        try {

            _query = ""
                    + "select *from v_list_assignment   "
                    + "";
            Query query = em.createNativeQuery(_query);
            list_assignment = query.getResultList();
            listAssigment = new ArrayList<VListAssignment>();
            for (Object[] assign : list_assignment) {

                assignEntity = new VListAssignment();
                assignEntity.setId((Integer) assign[0]);            //id
                assignEntity.setId((Integer) assign[1]);            //idasp
                assignEntity.setNames(assign[2].toString());        //names
                assignEntity.setLastname(assign[3].toString());     //lastname
                assignEntity.setStages(assign[4].toString());       //stages
                assignEntity.setPlace(assign[5].toString());        //places
                assignEntity.setDescriptions(assign[6].toString()); //descriptions               
                assignEntity.setIdgr((Integer) assign[7]);          //idgr
                assignEntity.setTeamGroup(assign[8].toString());    //team_group
                assignEntity.setDatefrom((Date) assign[9]);         //datefrom
                assignEntity.setDateto((Date) assign[10]);          //dateto               
                assignEntity.setDateassignment((Date) assign[11]);  //dateassignment
                assignEntity.setRemarks(assign[12].toString());     //remarks
                assignEntity.setStatus((Boolean) assign[13]);       //status
                listAssigment.add(assignEntity);
                /*System.out.println("Id: "+assign[0].toString()+" name: "+assign[2].toString());*/

            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());

        }
        return listAssigment;
    }

    @Override
    public List<VListAssignment> joinJpaAssigments() {
        VListAssignment assignEntity;
        List<VListAssignment> listAssigment = null;
        List<Object[]> list_assignment = null;
        String _query = "SELECT  a.idasignacion as id , asp.idasp as  idasp,asp.nombreasp as names , asp.apellidoasp as lastname,etp.etapas as stages  , "
                + " l.lugar  as place, l.descripcion as descriptions, gr.idgrupo as idgr, gr.grupo as team_group, a.fechainicio as dateFrom,  "
                + " a.fechafin as dateTo,a.fechaasignacion as dateassignment, case when (a.observaciones=null) then '' else a.observaciones end as remarks, a.estadoasignacion as status  "
                + " FROM MjAsignacionT a "
                + " JOIN a.idasp asp "
                + " JOIN a.idlugar l "
                + " JOIN l.idetapas etp "
                + " JOIN asp.idgrupo gr"
                + " ORDER BY a.idasignacion"
                + "";

        try {
            Query query = em.createQuery(_query);
            list_assignment = query.getResultList();
            listAssigment = new ArrayList<VListAssignment>();          
            
            for (Object[] assign : list_assignment) {
                assignEntity = new VListAssignment();
                assignEntity.setId((Integer) assign[0]);            //id
                assignEntity.setIdasp((Integer) assign[1]);         //idasp
                assignEntity.setNames(assign[2].toString());        //names
                assignEntity.setLastname(assign[3].toString());     //lastname
                assignEntity.setStages(assign[4].toString());       //stages
                assignEntity.setPlace(assign[5].toString());        //places
                assignEntity.setDescriptions(assign[6].toString()); //descriptions               
                assignEntity.setIdgr((Integer) assign[7]);          //idgr
                assignEntity.setTeamGroup(assign[8].toString());    //team_group
                assignEntity.setDatefrom((Date) assign[9]);         //datefrom
                assignEntity.setDateto((Date) assign[10]);          //dateto               
                assignEntity.setDateassignment((Date) assign[11]);  //dateassignment
                assignEntity.setRemarks(assign[12].toString());     //remarks
                assignEntity.setStatus((Boolean) assign[13]);       //status
                listAssigment.add(assignEntity);
                System.out.println("Id: "+assign[0].toString()+"   IdAsp: "+assign[1].toString()+" name: "+assign[2].toString()+" place: "+assign[5].toString() );

            }

        } catch (Exception e) {
            listAssigment = null;
            System.out.println("ErrorJoin: " + e.getMessage());
        }
        return (List<VListAssignment> )listAssigment;

    }
}
