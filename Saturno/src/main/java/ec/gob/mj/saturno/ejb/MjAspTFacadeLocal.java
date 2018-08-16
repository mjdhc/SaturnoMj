/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjAspT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MjAspTFacadeLocal {

    void create(MjAspT mjAspT);

    void edit(MjAspT mjAspT);

    void remove(MjAspT mjAspT);

    MjAspT find(Object id);

    List<MjAspT> findAll();

    List<MjAspT> findRange(int[] range);

    int count();
    
}
