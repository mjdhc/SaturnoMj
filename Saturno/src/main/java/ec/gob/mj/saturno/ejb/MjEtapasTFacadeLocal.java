/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjEtapasT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MjEtapasTFacadeLocal {

    void create(MjEtapasT mjEtapasT);

    void edit(MjEtapasT mjEtapasT);

    void remove(MjEtapasT mjEtapasT);

    MjEtapasT find(Object id);

    List<MjEtapasT> findAll();

    List<MjEtapasT> findRange(int[] range);

    int count();
    
}
