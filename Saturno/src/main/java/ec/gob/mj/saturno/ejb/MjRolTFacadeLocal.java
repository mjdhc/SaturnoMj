/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjRolT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MjRolTFacadeLocal {

    void create(MjRolT mjRolT);

    void edit(MjRolT mjRolT);

    void remove(MjRolT mjRolT);

    MjRolT find(Object id);

    List<MjRolT> findAll();

    List<MjRolT> findRange(int[] range);

    int count();
    
}
