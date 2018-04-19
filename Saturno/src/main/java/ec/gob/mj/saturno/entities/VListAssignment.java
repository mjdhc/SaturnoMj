/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.mj.saturno.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "v_list_assignment")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "findByIdGroupProcedure",
            procedureName = "show_assigments",
            resultClasses = {VListAssignment.class},
            parameters = {
                @StoredProcedureParameter(
                        name = "idgroup",
                        type = Integer.class,
                        mode = ParameterMode.IN)})
})
@NamedQueries({
    @NamedQuery(name = "VListAssignment.findAll", query = "SELECT v FROM VListAssignment v")
    , @NamedQuery(name = "VListAssignment.findById", query = "SELECT v FROM VListAssignment v WHERE v.id = :id")
    , @NamedQuery(name = "VListAssignment.findByNames", query = "SELECT v FROM VListAssignment v WHERE v.names = :names")
    , @NamedQuery(name = "VListAssignment.findByLastname", query = "SELECT v FROM VListAssignment v WHERE v.lastname = :lastname")
    , @NamedQuery(name = "VListAssignment.findByStages", query = "SELECT v FROM VListAssignment v WHERE v.stages = :stages")
    , @NamedQuery(name = "VListAssignment.findByPlace", query = "SELECT v FROM VListAssignment v WHERE v.place = :place")
    , @NamedQuery(name = "VListAssignment.findByDescriptions", query = "SELECT v FROM VListAssignment v WHERE v.descriptions = :descriptions")
    , @NamedQuery(name = "VListAssignment.findByIdgr", query = "SELECT v FROM VListAssignment v WHERE v.idgr = :idgr")
    , @NamedQuery(name = "VListAssignment.findByTeamGroup", query = "SELECT v FROM VListAssignment v WHERE v.teamGroup = :teamGroup")
    , @NamedQuery(name = "VListAssignment.findByDatefrom", query = "SELECT v FROM VListAssignment v WHERE v.datefrom = :datefrom")
    , @NamedQuery(name = "VListAssignment.findByDateto", query = "SELECT v FROM VListAssignment v WHERE v.dateto = :dateto")})
public class VListAssignment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private Integer id;
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
    @Column(name = "idgr")
    private Integer idgr;
    @Size(max = 50)
    @Column(name = "team_group")
    private String teamGroup;
    @Column(name = "datefrom")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datefrom;
    @Column(name = "dateto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateto;

    public VListAssignment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getIdgr() {
        return idgr;
    }

    public void setIdgr(Integer idgr) {
        this.idgr = idgr;
    }

    public String getTeamGroup() {
        return teamGroup;
    }

    public void setTeamGroup(String teamGroup) {
        this.teamGroup = teamGroup;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDateto() {
        return dateto;
    }

    public void setDateto(Date dateto) {
        this.dateto = dateto;
    }
    
}
