/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "v_list_assignment")
@NamedQueries({
    @NamedQuery(name = "VListAssignment.findAll", query = "SELECT v FROM VListAssignment v")
    , @NamedQuery(name = "VListAssignment.findByNames", query = "SELECT v FROM VListAssignment v WHERE v.names = :names")
    , @NamedQuery(name = "VListAssignment.findByLastname", query = "SELECT v FROM VListAssignment v WHERE v.lastname = :lastname")
    , @NamedQuery(name = "VListAssignment.findByStages", query = "SELECT v FROM VListAssignment v WHERE v.stages = :stages")
    , @NamedQuery(name = "VListAssignment.findByPlace", query = "SELECT v FROM VListAssignment v WHERE v.place = :place")
    , @NamedQuery(name = "VListAssignment.findByDescriptions", query = "SELECT v FROM VListAssignment v WHERE v.descriptions = :descriptions")})
public class VListAssignment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 60)
    @Column(name = "names")
    private String names;
    @Size(max = 60)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 50)
    @Column(name = "stages")
    private String stages;
    @Size(max = 20)
    @Column(name = "place")
    private String place;
    @Size(max = 100)
    @Column(name = "descriptions")
    private String descriptions;
    @Id
    private Long id;

    public VListAssignment() {
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStages() {
        return stages;
    }

    public void setStages(String stages) {
        this.stages = stages;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
