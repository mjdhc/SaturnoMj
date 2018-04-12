/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.ejb;

import ec.gob.mj.saturno.entities.MjUsuarioT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MjUsuarioTFacadeLocal {

    void create(MjUsuarioT mjUsuarioT);

    void edit(MjUsuarioT mjUsuarioT);

    void remove(MjUsuarioT mjUsuarioT);

    MjUsuarioT find(Object id);

    List<MjUsuarioT> findAll();

    List<MjUsuarioT> findRange(int[] range);

    int count();
    
}
