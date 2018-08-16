/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjCentroT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MjCentroTFacadeLocal {

    void create(MjCentroT mjCentroT);

    void edit(MjCentroT mjCentroT);

    void remove(MjCentroT mjCentroT);

    MjCentroT find(Object id);

    List<MjCentroT> findAll();

    List<MjCentroT> findRange(int[] range);

    int count();
    
}
