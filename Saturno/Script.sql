drop view v_list_assignment

create VIEW v_list_assignment AS 
select  a.idasignacion as ID ,  asp.nombreasp as names , asp.apellidoasp as lastname,etp.etapas as stages  , l.lugar  as place, l.descripcion as descriptions, gr.idgrupo as idgr, gr.grupo as team_group, a.fechainicio as dateFrom, a.fechafin as dateTo, a.observaciones as remarks, a.estadoasignacion as status from mj_asignacion_t a
inner join mj_asp_t asp on a.idasp =asp.idasp
inner join mj_lugar_t l on a.idlugar =l.idlugar
inner join mj_etapas_t etp on  l.idetapas= etp.idetapas
inner join mj_grupo_t gr on asp.idgrupo=gr.idgrupo
order by  nombreasp asc

select *from v_list_assignment  
/***************************create function assignment *************************************************/

CREATE OR REPLACE FUNCTION assigmentGaurdianDetens(_checkedOptionAssign int)
returns table(ID  int, names varchar(60), lastname text,stages text  ,place text,descriptions text,idgr int, team_group text ) as
$func$
   select * from  v_list_assignment
    where   v_list_assignment.idgr = $1   
    
$func$ LANGUAGE sql;

select  assigmentGaurdianDetens(1);

/*******************************store procedude************************************************/
drop function show_assigments(integer);

CREATE OR REPLACE FUNCTION show_assigments (IN inflag int,OUT ID  int, OUT names varchar(60),OUT lastname varchar(60),OUT stages varchar(60)  , out place varchar(60),out descriptions varchar(60), out idgr int, OUT team_group varchar(60), out dateFrom timestamp, OUT dateTo timestamp ) 
returns setof record
AS $BODY$
BEGIN
	
	RETURN QUERY  select assig.ID , assig.names, assig.lastname ,assig.stages  ,assig.place,assig.descriptions,assig.idgr, assig.team_group, assig.datefrom, assig.dateto from  v_list_assignment assig   where   assig.idgr = $1;   
END; $BODY$  
LANGUAGE 'plpgsql';

select *from show_assigments(1);


--update mj_asignacion_t set  idasp=10, idlugar=4,fechainicio='2015-07-17 22:00:00+00',fechafin='2015-07-18 22:00:00+00',fechaasignacion='2015-07-17 22:00:00+00' ,observaciones='new remarks 2', estadoasignacion=true  where idasignacion=3;
update mj_asignacion_t set  idlugar=4,observaciones='new remarks 3', estadoasignacion=true  where idasignacion=3;

 


 	select  	current_timestamp::timestamp::date + interval '6 hour'

 	select current_timestamp 
 	 
	select to_char(current_timestamp, 'HH12:MI:SS')
	
select to_timestamp('05 Dec 2000', 'DD Mon YYYY')

select current_timestamp::timestamp::date;
