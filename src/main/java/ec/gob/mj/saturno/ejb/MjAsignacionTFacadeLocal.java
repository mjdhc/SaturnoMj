/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjAsignacionT;
import ec.gob.mj.saturno.entities.VListAssignment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MjAsignacionTFacadeLocal {

    void create(MjAsignacionT mjAsignacionT);

    void edit(MjAsignacionT mjAsignacionT);

    void remove(MjAsignacionT mjAsignacionT);

    MjAsignacionT find(Object id);

    List<MjAsignacionT> findAll();

    List<MjAsignacionT> findRange(int[] range);

    int count();

    Boolean updateRowRegistres(MjAsignacionT assign);

}
