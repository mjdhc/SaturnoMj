/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.persistence.ejb;

import ec.gob.mj.saturno.persistence.entities.Centros;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface CentrosFacadeLocal {

    void create(Centros centros);

    void edit(Centros centros);

    void remove(Centros centros);

    Centros find(Object id);

    List<Centros> findAll();

    List<Centros> findRange(int[] range);

    int count();
    
}
