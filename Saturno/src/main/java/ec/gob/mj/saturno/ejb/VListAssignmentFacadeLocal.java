/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjLugarT;
import ec.gob.mj.saturno.entities.VListAssignment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface VListAssignmentFacadeLocal {

    void create(VListAssignment vListAssignment);

    void edit(VListAssignment vListAssignment);

    void remove(VListAssignment vListAssignment);

    VListAssignment find(Object id);

    List<VListAssignment> findAll();

    List<VListAssignment> findRange(int[] range);

    int count();
    
    List<VListAssignment>  findListAssignments();    
    List<VListAssignment>  findListAssignmentsWithParamater(int idGroup);
    List<String> listPlaces();
    
}
