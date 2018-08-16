/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjLugarT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MjLugarTFacadeLocal {

    void create(MjLugarT mjLugarT);

    void edit(MjLugarT mjLugarT);

    void remove(MjLugarT mjLugarT);

    MjLugarT find(Object id);

    List<MjLugarT> findAll();

    List<MjLugarT> findRange(int[] range);

    int count();
    
}
