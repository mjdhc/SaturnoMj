/*
Navicat PGSQL Data Transfer

Source Server         : Prue
Source Server Version : 90608
Source Host           : 192.168.100.16:5432
Source Database       : saturno
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90608
File Encoding         : 65001

Date: 2018-04-13 18:08:36
*/


-- ----------------------------
-- Sequence structure for sec_mj_asignacion
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_asignacion";
CREATE SEQUENCE "public"."sec_mj_asignacion"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_asp
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_asp";
CREATE SEQUENCE "public"."sec_mj_asp"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 12
 CACHE 1;
SELECT setval('"public"."sec_mj_asp"', 12, true);

-- ----------------------------
-- Sequence structure for sec_mj_centro
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_centro";
CREATE SEQUENCE "public"."sec_mj_centro"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 27
 CACHE 1;
SELECT setval('"public"."sec_mj_centro"', 27, true);

-- ----------------------------
-- Sequence structure for sec_mj_configuracentro
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_configuracentro";
CREATE SEQUENCE "public"."sec_mj_configuracentro"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;
SELECT setval('"public"."sec_mj_configuracentro"', 4, true);

-- ----------------------------
-- Sequence structure for sec_mj_etapas
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_etapas";
CREATE SEQUENCE "public"."sec_mj_etapas"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 8
 CACHE 1;
SELECT setval('"public"."sec_mj_etapas"', 8, true);

-- ----------------------------
-- Sequence structure for sec_mj_genero
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_genero";
CREATE SEQUENCE "public"."sec_mj_genero"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 5
 CACHE 1;
SELECT setval('"public"."sec_mj_genero"', 5, true);

-- ----------------------------
-- Sequence structure for sec_mj_grupo
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_grupo";
CREATE SEQUENCE "public"."sec_mj_grupo"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 7
 CACHE 1;
SELECT setval('"public"."sec_mj_grupo"', 7, true);

-- ----------------------------
-- Sequence structure for sec_mj_historico
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_historico";
CREATE SEQUENCE "public"."sec_mj_historico"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_horariocentro
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_horariocentro";
CREATE SEQUENCE "public"."sec_mj_horariocentro"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 5
 CACHE 1;
SELECT setval('"public"."sec_mj_horariocentro"', 5, true);

-- ----------------------------
-- Sequence structure for sec_mj_horarios
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_horarios";
CREATE SEQUENCE "public"."sec_mj_horarios"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 5
 CACHE 1;
SELECT setval('"public"."sec_mj_horarios"', 5, true);

-- ----------------------------
-- Sequence structure for sec_mj_justifica
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_justifica";
CREATE SEQUENCE "public"."sec_mj_justifica"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_logs
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_logs";
CREATE SEQUENCE "public"."sec_mj_logs"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_lugar
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_lugar";
CREATE SEQUENCE "public"."sec_mj_lugar"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 8
 CACHE 1;
SELECT setval('"public"."sec_mj_lugar"', 8, true);

-- ----------------------------
-- Sequence structure for sec_mj_motivfalta
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_motivfalta";
CREATE SEQUENCE "public"."sec_mj_motivfalta"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_motivreasigna
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_motivreasigna";
CREATE SEQUENCE "public"."sec_mj_motivreasigna"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_opciones
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_opciones";
CREATE SEQUENCE "public"."sec_mj_opciones"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_reasignacion
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_reasignacion";
CREATE SEQUENCE "public"."sec_mj_reasignacion"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_rol
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_rol";
CREATE SEQUENCE "public"."sec_mj_rol"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;
SELECT setval('"public"."sec_mj_rol"', 4, true);

-- ----------------------------
-- Sequence structure for sec_mj_rolopciones
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_rolopciones";
CREATE SEQUENCE "public"."sec_mj_rolopciones"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 4
 CACHE 1;

-- ----------------------------
-- Sequence structure for sec_mj_usuario
-- ----------------------------
DROP SEQUENCE "public"."sec_mj_usuario";
CREATE SEQUENCE "public"."sec_mj_usuario"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 5
 CACHE 1;
SELECT setval('"public"."sec_mj_usuario"', 5, true);

-- ----------------------------
-- Table structure for mj_asignacion_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_asignacion_t";
CREATE TABLE "public"."mj_asignacion_t" (
"idasignacion" int4 DEFAULT nextval('sec_mj_asignacion'::regclass) NOT NULL,
"idasp" int4,
"idlugar" int4,
"fechainicio" timestamp(6),
"fechafin" timestamp(6),
"fechaasignacion" timestamp(6),
"observaciones" varchar(5000) COLLATE "default",
"estadoasignacion" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_asignacion_t" IS 'datos de la asignacion automatica de turnos';
COMMENT ON COLUMN "public"."mj_asignacion_t"."idasignacion" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_asignacion_t"."fechainicio" IS 'fecha de inicio de guardia';
COMMENT ON COLUMN "public"."mj_asignacion_t"."fechafin" IS 'fecha de fin de guardia';
COMMENT ON COLUMN "public"."mj_asignacion_t"."fechaasignacion" IS 'fecha de sistema en el que se realizo la reparticion';
COMMENT ON COLUMN "public"."mj_asignacion_t"."observaciones" IS 'observaciones de reparticion';
COMMENT ON COLUMN "public"."mj_asignacion_t"."estadoasignacion" IS 'identificador para asignacion';

-- ----------------------------
-- Records of mj_asignacion_t
-- ----------------------------
INSERT INTO "public"."mj_asignacion_t" VALUES ('1', '1', '1', '2018-04-13 15:15:22', '2018-04-14 15:15:26', '2018-04-13 15:15:30', 'Usuario Willian Cueva designado Turno', 't');

-- ----------------------------
-- Table structure for mj_asp_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_asp_t";
CREATE TABLE "public"."mj_asp_t" (
"idasp" int4 DEFAULT nextval('sec_mj_asp'::regclass) NOT NULL,
"idgrupo" int4,
"idcentro" int4,
"idgenero" int4,
"nombreasp" varchar(60) COLLATE "default",
"apellidoasp" varchar(60) COLLATE "default",
"estadoasp" bool,
"cedulaasp" varchar(10) COLLATE "default",
"correoasp" varchar(60) COLLATE "default",
"fechaingreso" timestamp(6),
"fotoasp" bytea
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_asp_t" IS 'datos del Agente de Seguridad Penitenciaria (ASP)';
COMMENT ON COLUMN "public"."mj_asp_t"."idasp" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_asp_t"."estadoasp" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';
COMMENT ON COLUMN "public"."mj_asp_t"."fechaingreso" IS 'fecha de registro ( ingreso)';

-- ----------------------------
-- Records of mj_asp_t
-- ----------------------------
INSERT INTO "public"."mj_asp_t" VALUES ('1', '4', '26', '4', 'Willian', 'Cueva', 't', '1303753618', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('4', '4', '26', '4', 'Vicente', 'Taco', 't', '1600226722', null, '2018-04-11 12:02:15.692785', null);
INSERT INTO "public"."mj_asp_t" VALUES ('5', '4', '26', '4', 'Pablo', 'Lozada', 't', '1303753618', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('6', '5', '26', '4', 'Omar', 'Factos', 't', '1706172648', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('7', '4', '26', '4', 'Gerson', 'Chicaiza', 't', '1713627071', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('8', '5', '26', '4', 'Darwin', 'Doicela', 't', '1103037048', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('9', '4', '26', '5', 'Ada', 'Sisa', 't', '1711402980', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('10', '5', '26', '5', 'Andrea', 'Toapanta', 't', '1709262933', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('11', '4', '26', '5', 'Irina', 'Tobar', 't', '1307353662', null, '2018-04-11 12:04:25.892956', null);
INSERT INTO "public"."mj_asp_t" VALUES ('12', '5', '26', '5', 'Alba', 'Toaquiza', 't', '1104015779', null, '2018-04-11 12:04:25.892956', null);

-- ----------------------------
-- Table structure for mj_centro_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_centro_t";
CREATE TABLE "public"."mj_centro_t" (
"idcentro" int4 DEFAULT nextval('sec_mj_centro'::regclass) NOT NULL,
"nombrecentro" varchar(60) COLLATE "default",
"desccentro" varchar(100) COLLATE "default",
"estadocentro" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_centro_t" IS 'Datos de los centros de reclusion social';
COMMENT ON COLUMN "public"."mj_centro_t"."idcentro" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_centro_t"."estadocentro" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_centro_t
-- ----------------------------
INSERT INTO "public"."mj_centro_t" VALUES ('26', 'eeeeeeeeee', 'eeeeeee', 't');
INSERT INTO "public"."mj_centro_t" VALUES ('27', 'yyy', 'yyy', 't');

-- ----------------------------
-- Table structure for mj_configuracentro
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_configuracentro";
CREATE TABLE "public"."mj_configuracentro" (
"idconfig" int4 DEFAULT nextval('sec_mj_configuracentro'::regclass) NOT NULL,
"idcentro" int4,
"periodo" int4,
"numaspausentes" int4,
"fechaguarda" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_configuracentro" IS 'Datos generales de configuracion de un centro de rehabilitacion';
COMMENT ON COLUMN "public"."mj_configuracentro"."idconfig" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_configuracentro"."periodo" IS 'numero de dias que durará la reparticion de puestos';
COMMENT ON COLUMN "public"."mj_configuracentro"."numaspausentes" IS 'numero de asp ausentes ya sea por audiencias, hospitales, etc';
COMMENT ON COLUMN "public"."mj_configuracentro"."fechaguarda" IS 'fecha de sistema en la que se guarda la configuracion del centro';

-- ----------------------------
-- Records of mj_configuracentro
-- ----------------------------
INSERT INTO "public"."mj_configuracentro" VALUES ('4', '26', '1', '2', '2018-04-11 10:13:19.603372');

-- ----------------------------
-- Table structure for mj_etapas_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_etapas_t";
CREATE TABLE "public"."mj_etapas_t" (
"idetapas" int4 DEFAULT nextval('sec_mj_etapas'::regclass) NOT NULL,
"etapas" varchar(50) COLLATE "default",
"estadoetapa" bool,
"idcentro" int4
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_etapas_t" IS 'datos de las distintas etapas que tiene un CRS';
COMMENT ON COLUMN "public"."mj_etapas_t"."idetapas" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_etapas_t"."etapas" IS 'etapa minima. etapa mediana, etapa maxima';
COMMENT ON COLUMN "public"."mj_etapas_t"."estadoetapa" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_etapas_t
-- ----------------------------
INSERT INTO "public"."mj_etapas_t" VALUES ('4', 'Minima', 't', '26');
INSERT INTO "public"."mj_etapas_t" VALUES ('5', 'Mediana', 't', '26');
INSERT INTO "public"."mj_etapas_t" VALUES ('6', 'Maxima', 't', '26');
INSERT INTO "public"."mj_etapas_t" VALUES ('7', 'Femino', 't', '26');

-- ----------------------------
-- Table structure for mj_genero_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_genero_t";
CREATE TABLE "public"."mj_genero_t" (
"idgenero" int4 DEFAULT nextval('sec_mj_genero'::regclass) NOT NULL,
"genero" varchar(20) COLLATE "default",
"estadogenero" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_genero_t" IS 'Datos de genero para registro de ASP';
COMMENT ON COLUMN "public"."mj_genero_t"."idgenero" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_genero_t"."genero" IS 'Detalle de genero (Masculino, femenino)';
COMMENT ON COLUMN "public"."mj_genero_t"."estadogenero" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_genero_t
-- ----------------------------
INSERT INTO "public"."mj_genero_t" VALUES ('4', 'Masculino', 't');
INSERT INTO "public"."mj_genero_t" VALUES ('5', 'Femenino', 't');

-- ----------------------------
-- Table structure for mj_grupo_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_grupo_t";
CREATE TABLE "public"."mj_grupo_t" (
"idgrupo" int4 DEFAULT nextval('sec_mj_grupo'::regclass) NOT NULL,
"grupo" varchar(50) COLLATE "default",
"estadogrupo" bool,
"tipo" text COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_grupo_t" IS 'Detalle de grupo al que pertenecera un ASP ';
COMMENT ON COLUMN "public"."mj_grupo_t"."idgrupo" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_grupo_t"."grupo" IS 'Campo de grupo para los ASP (grupo1, grupo2, etc)';
COMMENT ON COLUMN "public"."mj_grupo_t"."estadogrupo" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';
COMMENT ON COLUMN "public"."mj_grupo_t"."tipo" IS 'tipo de subgrupo al que pertenece un ASP';

-- ----------------------------
-- Records of mj_grupo_t
-- ----------------------------
INSERT INTO "public"."mj_grupo_t" VALUES ('4', 'Grupo 1', 't', 'A');
INSERT INTO "public"."mj_grupo_t" VALUES ('5', 'Grupo 2', 't', 'B');
INSERT INTO "public"."mj_grupo_t" VALUES ('6', 'Grupo 1', 't', 'B');
INSERT INTO "public"."mj_grupo_t" VALUES ('7', 'Grupo 2', 't', 'A');

-- ----------------------------
-- Table structure for mj_historico_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_historico_t";
CREATE TABLE "public"."mj_historico_t" (
"idhistorico" int4 DEFAULT nextval('sec_mj_historico'::regclass) NOT NULL,
"idasp" int4,
"idlugar" int4,
"idlugarnuevo" int4,
"estadohistorico" bool,
"fechainicio" timestamp(6),
"fechafin" timestamp(6),
"reasignacion" varchar(2) COLLATE "default",
"observaciones" varchar(5000) COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_historico_t" IS 'datos generales de asignacion y reasignacion de turnos';
COMMENT ON COLUMN "public"."mj_historico_t"."idhistorico" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_historico_t"."idlugar" IS 'lugar de asignacion de un ASP';
COMMENT ON COLUMN "public"."mj_historico_t"."idlugarnuevo" IS 'lugar de reasignacion de un ASP';
COMMENT ON COLUMN "public"."mj_historico_t"."estadohistorico" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';
COMMENT ON COLUMN "public"."mj_historico_t"."reasignacion" IS 'Variable para identificar una reasignacion (R reasignacion)';

-- ----------------------------
-- Records of mj_historico_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_horariocentro_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_horariocentro_t";
CREATE TABLE "public"."mj_horariocentro_t" (
"idhorariocentro" int4 DEFAULT nextval('sec_mj_horariocentro'::regclass) NOT NULL,
"idhorarios" int4,
"idconfig" int4
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_horariocentro_t" IS 'Tabla de rompimiento';
COMMENT ON COLUMN "public"."mj_horariocentro_t"."idhorariocentro" IS 'Identificador de tabla';

-- ----------------------------
-- Records of mj_horariocentro_t
-- ----------------------------
INSERT INTO "public"."mj_horariocentro_t" VALUES ('4', '4', '4');
INSERT INTO "public"."mj_horariocentro_t" VALUES ('5', '5', '4');

-- ----------------------------
-- Table structure for mj_horarios_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_horarios_t";
CREATE TABLE "public"."mj_horarios_t" (
"idhorarios" int4 DEFAULT nextval('sec_mj_horarios'::regclass) NOT NULL,
"horario" varchar(20) COLLATE "default",
"horainicio" time(6),
"horafin" time(6),
"numhoras" int4,
"estadohorario" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_horarios_t" IS 'Datos de los distintos horarios que pueden tener los centros';
COMMENT ON COLUMN "public"."mj_horarios_t"."idhorarios" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_horarios_t"."horario" IS 'Nombre del horarios (horario 1, horario 2. etc)';
COMMENT ON COLUMN "public"."mj_horarios_t"."horainicio" IS 'Hora de inicio del horario';
COMMENT ON COLUMN "public"."mj_horarios_t"."horafin" IS 'Hora de fin del horario';
COMMENT ON COLUMN "public"."mj_horarios_t"."numhoras" IS 'Detalle de numero de horas que tiene el horario';
COMMENT ON COLUMN "public"."mj_horarios_t"."estadohorario" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_horarios_t
-- ----------------------------
INSERT INTO "public"."mj_horarios_t" VALUES ('4', 'horario 1', '07:00:00', '07:00:00', '24', 't');
INSERT INTO "public"."mj_horarios_t" VALUES ('5', 'horario 2', '06:30:00', '05:30:00', '36', 't');

-- ----------------------------
-- Table structure for mj_justifica_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_justifica_t";
CREATE TABLE "public"."mj_justifica_t" (
"idjustifica" int4 DEFAULT nextval('sec_mj_justifica'::regclass) NOT NULL,
"idasp" int4,
"idmotivofalta" int4,
"idusuario" int4,
"fechainicio" timestamp(6),
"fechafin" timestamp(6),
"fechaguarda" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_justifica_t" IS 'Tabla para guardar datos de la justificacion de una falta';
COMMENT ON COLUMN "public"."mj_justifica_t"."idjustifica" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_justifica_t"."fechainicio" IS 'Fecha de inicio de ausencia';
COMMENT ON COLUMN "public"."mj_justifica_t"."fechafin" IS 'Fecha de fin de ausencia';
COMMENT ON COLUMN "public"."mj_justifica_t"."fechaguarda" IS 'Fecha de guardado de registro';

-- ----------------------------
-- Records of mj_justifica_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_logs_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_logs_t";
CREATE TABLE "public"."mj_logs_t" (
"idlog" int4 DEFAULT nextval('sec_mj_logs'::regclass) NOT NULL,
"idusuario" int4,
"idopciones" int4,
"accion" varchar(60) COLLATE "default",
"campoanterior" varchar(60) COLLATE "default",
"camponuevo" varchar(60) COLLATE "default",
"fechacambio" timestamp(6)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_logs_t" IS 'datos de acciones realizadas en el sistema';
COMMENT ON COLUMN "public"."mj_logs_t"."idlog" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_logs_t"."accion" IS 'detalle de accion (eliminar, modificar, guardar, etc)';
COMMENT ON COLUMN "public"."mj_logs_t"."campoanterior" IS 'campo anterior al cambio';
COMMENT ON COLUMN "public"."mj_logs_t"."camponuevo" IS 'campo de cambio';

-- ----------------------------
-- Records of mj_logs_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_lugar_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_lugar_t";
CREATE TABLE "public"."mj_lugar_t" (
"idlugar" int4 DEFAULT nextval('sec_mj_lugar'::regclass) NOT NULL,
"idetapas" int4,
"lugar" varchar(20) COLLATE "default",
"descripcion" varchar(100) COLLATE "default",
"minasp" int4,
"maxasp" int4,
"personal" int4,
"estadolugar" bool,
"idhorarios" int4
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_lugar_t" IS 'datos de los distintos lugares en los que se asignará un ASP';
COMMENT ON COLUMN "public"."mj_lugar_t"."idlugar" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_lugar_t"."lugar" IS 'lugar donde se asignara un ASP (Botonera1, A1A, A1B,etc)';
COMMENT ON COLUMN "public"."mj_lugar_t"."descripcion" IS 'descripcion general del lugar ';
COMMENT ON COLUMN "public"."mj_lugar_t"."minasp" IS 'número minimo de ASP que pueden estar asignados a ese lugar';
COMMENT ON COLUMN "public"."mj_lugar_t"."maxasp" IS 'número máximo  de ASP que pueden estar asignados a ese lugar';
COMMENT ON COLUMN "public"."mj_lugar_t"."personal" IS 'especificacion de si el sitio permite únicamente ASP de genero femenino o ASP de género masculino o es indiferente el genero del ASP';
COMMENT ON COLUMN "public"."mj_lugar_t"."estadolugar" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_lugar_t
-- ----------------------------
INSERT INTO "public"."mj_lugar_t" VALUES ('1', '7', 'Lugar1', 'Descripcion1', '1', '1', '2', 't', '5');
INSERT INTO "public"."mj_lugar_t" VALUES ('4', '4', 'A1A', 'Ala 1 A', '1', '2', '1', 't', '4');
INSERT INTO "public"."mj_lugar_t" VALUES ('5', '4', 'A1B', 'Ala 1 B', '1', '1', '2', 't', '4');
INSERT INTO "public"."mj_lugar_t" VALUES ('6', '4', 'A2A', 'Ala 2 A', '1', '1', '3', 't', '4');
INSERT INTO "public"."mj_lugar_t" VALUES ('7', '7', 'Tomatito', 'tomatito', '1', '1', '2', 't', '5');
INSERT INTO "public"."mj_lugar_t" VALUES ('8', '7', 'Lactancia', 'Lactancia', '1', '1', '2', 't', '5');

-- ----------------------------
-- Table structure for mj_motivfalta_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_motivfalta_t";
CREATE TABLE "public"."mj_motivfalta_t" (
"idmotivofalta" int4 DEFAULT nextval('sec_mj_motivfalta'::regclass) NOT NULL,
"motivofalta" varchar(30) COLLATE "default",
"estadofalta" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_motivfalta_t" IS 'Detalle de motivos de falta';
COMMENT ON COLUMN "public"."mj_motivfalta_t"."idmotivofalta" IS 'Identificador de tablav';
COMMENT ON COLUMN "public"."mj_motivfalta_t"."motivofalta" IS 'Detalle de motivos de falta ( enfermedad, vacaciones, etc)';
COMMENT ON COLUMN "public"."mj_motivfalta_t"."estadofalta" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_motivfalta_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_motivreasigna_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_motivreasigna_t";
CREATE TABLE "public"."mj_motivreasigna_t" (
"idmotivoreasigna" int4 DEFAULT nextval('sec_mj_motivreasigna'::regclass) NOT NULL,
"motivoreasigna" varchar(30) COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_motivreasigna_t" IS 'datos de los distintos motivos para reasignar';
COMMENT ON COLUMN "public"."mj_motivreasigna_t"."idmotivoreasigna" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_motivreasigna_t"."motivoreasigna" IS 'lista de motivos de reasignacion de un lista (amenaza, falta)';

-- ----------------------------
-- Records of mj_motivreasigna_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_opciones_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_opciones_t";
CREATE TABLE "public"."mj_opciones_t" (
"idopciones" int4 DEFAULT nextval('sec_mj_opciones'::regclass) NOT NULL,
"opciones" varchar(200) COLLATE "default",
"estadoopciones" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "public"."mj_opciones_t"."idopciones" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_opciones_t"."estadoopciones" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_opciones_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_reasignacion_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_reasignacion_t";
CREATE TABLE "public"."mj_reasignacion_t" (
"idreasigna" int4 DEFAULT nextval('sec_mj_reasignacion'::regclass) NOT NULL,
"idasignacion" int4,
"idlugar" int4,
"idmotivoreasigna" int4,
"idusuario" int4,
"fechainicio" timestamp(6),
"fechafin" timestamp(6),
"fechareasigna" timestamp(6),
"aprobado" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_reasignacion_t" IS 'datos de la reasignacion de turnos por parte de un usuario';
COMMENT ON COLUMN "public"."mj_reasignacion_t"."idreasigna" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_reasignacion_t"."fechareasigna" IS 'fecha de sistema en la que se realiza la reasignacion';
COMMENT ON COLUMN "public"."mj_reasignacion_t"."aprobado" IS 'estado en el que se encuentra la reasignacion, aprobado: true o negado: false';

-- ----------------------------
-- Records of mj_reasignacion_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_rol_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_rol_t";
CREATE TABLE "public"."mj_rol_t" (
"idrol" int4 DEFAULT nextval('sec_mj_rol'::regclass) NOT NULL,
"rol" varchar(50) COLLATE "default",
"estadorol" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_rol_t" IS 'datos de los distintos roles que tendran los usuarios del sistema';
COMMENT ON COLUMN "public"."mj_rol_t"."idrol" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_rol_t"."rol" IS 'roles de los usuarios del sistema (Administrador, Supervisor, Director, etc)';
COMMENT ON COLUMN "public"."mj_rol_t"."estadorol" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_rol_t
-- ----------------------------
INSERT INTO "public"."mj_rol_t" VALUES ('4', 'Administrador Funcional', 't');

-- ----------------------------
-- Table structure for mj_rolopciones_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_rolopciones_t";
CREATE TABLE "public"."mj_rolopciones_t" (
"idrolopciones" int4 DEFAULT nextval('sec_mj_rolopciones'::regclass) NOT NULL,
"idrol" int4,
"idopciones" int4
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "public"."mj_rolopciones_t"."idrolopciones" IS 'Identificador de tabla';

-- ----------------------------
-- Records of mj_rolopciones_t
-- ----------------------------

-- ----------------------------
-- Table structure for mj_usuario_t
-- ----------------------------
DROP TABLE IF EXISTS "public"."mj_usuario_t";
CREATE TABLE "public"."mj_usuario_t" (
"idusuario" int4 DEFAULT nextval('sec_mj_usuario'::regclass) NOT NULL,
"idcentro" int4,
"idrol" int4,
"nombreusuario" varchar(60) COLLATE "default",
"apellidousuario" varchar(60) COLLATE "default",
"usuario" varchar(15) COLLATE "default",
"clave" varchar(60) COLLATE "default",
"estadousuario" bool
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."mj_usuario_t" IS 'datos de los usuarios que acceden al sistema para las distintas configuraciones';
COMMENT ON COLUMN "public"."mj_usuario_t"."idusuario" IS 'Identificador de tabla';
COMMENT ON COLUMN "public"."mj_usuario_t"."usuario" IS 'usuario de acceso al sistema';
COMMENT ON COLUMN "public"."mj_usuario_t"."clave" IS 'clave de acceso al sistema';
COMMENT ON COLUMN "public"."mj_usuario_t"."estadousuario" IS 'utilizado para el estado del campo(true: activo , false: desactivo)';

-- ----------------------------
-- Records of mj_usuario_t
-- ----------------------------
INSERT INTO "public"."mj_usuario_t" VALUES ('4', '26', '4', 'Fermin', 'Suárez', 'suarezf', '12345', 't');
INSERT INTO "public"."mj_usuario_t" VALUES ('5', '26', '4', 'Galo', 'Durán', 'durang', '12345', 't');

-- ----------------------------
-- View structure for configuracioncentros
-- ----------------------------
CREATE OR REPLACE VIEW "public"."configuracioncentros" AS 
 SELECT DISTINCT a.idcentro,
    a.nombrecentro,
    b.periodo,
    b.numaspausentes,
    d.idhorarios,
    d.horario,
    d.horainicio,
    d.horafin,
    d.numhoras
   FROM (((mj_centro_t a
     LEFT JOIN mj_configuracentro b ON ((a.idcentro = b.idcentro)))
     LEFT JOIN mj_horariocentro_t c ON ((b.idconfig = c.idconfig)))
     LEFT JOIN mj_horarios_t d ON ((d.idhorarios = c.idhorarios)))
  WHERE ((a.estadocentro IS TRUE) AND (d.estadohorario IS TRUE));

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table mj_asignacion_t
-- ----------------------------
ALTER TABLE "public"."mj_asignacion_t" ADD PRIMARY KEY ("idasignacion");

-- ----------------------------
-- Primary Key structure for table mj_asp_t
-- ----------------------------
ALTER TABLE "public"."mj_asp_t" ADD PRIMARY KEY ("idasp");

-- ----------------------------
-- Primary Key structure for table mj_centro_t
-- ----------------------------
ALTER TABLE "public"."mj_centro_t" ADD PRIMARY KEY ("idcentro");

-- ----------------------------
-- Primary Key structure for table mj_configuracentro
-- ----------------------------
ALTER TABLE "public"."mj_configuracentro" ADD PRIMARY KEY ("idconfig");

-- ----------------------------
-- Primary Key structure for table mj_etapas_t
-- ----------------------------
ALTER TABLE "public"."mj_etapas_t" ADD PRIMARY KEY ("idetapas");

-- ----------------------------
-- Primary Key structure for table mj_genero_t
-- ----------------------------
ALTER TABLE "public"."mj_genero_t" ADD PRIMARY KEY ("idgenero");

-- ----------------------------
-- Primary Key structure for table mj_grupo_t
-- ----------------------------
ALTER TABLE "public"."mj_grupo_t" ADD PRIMARY KEY ("idgrupo");

-- ----------------------------
-- Primary Key structure for table mj_historico_t
-- ----------------------------
ALTER TABLE "public"."mj_historico_t" ADD PRIMARY KEY ("idhistorico");

-- ----------------------------
-- Primary Key structure for table mj_horariocentro_t
-- ----------------------------
ALTER TABLE "public"."mj_horariocentro_t" ADD PRIMARY KEY ("idhorariocentro");

-- ----------------------------
-- Primary Key structure for table mj_horarios_t
-- ----------------------------
ALTER TABLE "public"."mj_horarios_t" ADD PRIMARY KEY ("idhorarios");

-- ----------------------------
-- Primary Key structure for table mj_justifica_t
-- ----------------------------
ALTER TABLE "public"."mj_justifica_t" ADD PRIMARY KEY ("idjustifica");

-- ----------------------------
-- Primary Key structure for table mj_logs_t
-- ----------------------------
ALTER TABLE "public"."mj_logs_t" ADD PRIMARY KEY ("idlog");

-- ----------------------------
-- Primary Key structure for table mj_lugar_t
-- ----------------------------
ALTER TABLE "public"."mj_lugar_t" ADD PRIMARY KEY ("idlugar");

-- ----------------------------
-- Primary Key structure for table mj_motivfalta_t
-- ----------------------------
ALTER TABLE "public"."mj_motivfalta_t" ADD PRIMARY KEY ("idmotivofalta");

-- ----------------------------
-- Primary Key structure for table mj_motivreasigna_t
-- ----------------------------
ALTER TABLE "public"."mj_motivreasigna_t" ADD PRIMARY KEY ("idmotivoreasigna");

-- ----------------------------
-- Primary Key structure for table mj_opciones_t
-- ----------------------------
ALTER TABLE "public"."mj_opciones_t" ADD PRIMARY KEY ("idopciones");

-- ----------------------------
-- Primary Key structure for table mj_reasignacion_t
-- ----------------------------
ALTER TABLE "public"."mj_reasignacion_t" ADD PRIMARY KEY ("idreasigna");

-- ----------------------------
-- Primary Key structure for table mj_rol_t
-- ----------------------------
ALTER TABLE "public"."mj_rol_t" ADD PRIMARY KEY ("idrol");

-- ----------------------------
-- Primary Key structure for table mj_rolopciones_t
-- ----------------------------
ALTER TABLE "public"."mj_rolopciones_t" ADD PRIMARY KEY ("idrolopciones");

-- ----------------------------
-- Primary Key structure for table mj_usuario_t
-- ----------------------------
ALTER TABLE "public"."mj_usuario_t" ADD PRIMARY KEY ("idusuario");

-- ----------------------------
-- Foreign Key structure for table "public"."mj_asignacion_t"
-- ----------------------------
ALTER TABLE "public"."mj_asignacion_t" ADD FOREIGN KEY ("idlugar") REFERENCES "public"."mj_lugar_t" ("idlugar") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_asignacion_t" ADD FOREIGN KEY ("idasp") REFERENCES "public"."mj_asp_t" ("idasp") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_asp_t"
-- ----------------------------
ALTER TABLE "public"."mj_asp_t" ADD FOREIGN KEY ("idcentro") REFERENCES "public"."mj_centro_t" ("idcentro") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_asp_t" ADD FOREIGN KEY ("idgenero") REFERENCES "public"."mj_genero_t" ("idgenero") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_configuracentro"
-- ----------------------------
ALTER TABLE "public"."mj_configuracentro" ADD FOREIGN KEY ("idcentro") REFERENCES "public"."mj_centro_t" ("idcentro") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_etapas_t"
-- ----------------------------
ALTER TABLE "public"."mj_etapas_t" ADD FOREIGN KEY ("idcentro") REFERENCES "public"."mj_centro_t" ("idcentro") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_historico_t"
-- ----------------------------
ALTER TABLE "public"."mj_historico_t" ADD FOREIGN KEY ("idlugar") REFERENCES "public"."mj_lugar_t" ("idlugar") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_historico_t" ADD FOREIGN KEY ("idlugar") REFERENCES "public"."mj_lugar_t" ("idlugar") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_historico_t" ADD FOREIGN KEY ("idasp") REFERENCES "public"."mj_asp_t" ("idasp") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_horariocentro_t"
-- ----------------------------
ALTER TABLE "public"."mj_horariocentro_t" ADD FOREIGN KEY ("idhorarios") REFERENCES "public"."mj_horarios_t" ("idhorarios") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_horariocentro_t" ADD FOREIGN KEY ("idconfig") REFERENCES "public"."mj_configuracentro" ("idconfig") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_justifica_t"
-- ----------------------------
ALTER TABLE "public"."mj_justifica_t" ADD FOREIGN KEY ("idasp") REFERENCES "public"."mj_asp_t" ("idasp") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_justifica_t" ADD FOREIGN KEY ("idusuario") REFERENCES "public"."mj_usuario_t" ("idusuario") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_justifica_t" ADD FOREIGN KEY ("idmotivofalta") REFERENCES "public"."mj_motivfalta_t" ("idmotivofalta") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_logs_t"
-- ----------------------------
ALTER TABLE "public"."mj_logs_t" ADD FOREIGN KEY ("idusuario") REFERENCES "public"."mj_usuario_t" ("idusuario") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_logs_t" ADD FOREIGN KEY ("idopciones") REFERENCES "public"."mj_opciones_t" ("idopciones") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_lugar_t"
-- ----------------------------
ALTER TABLE "public"."mj_lugar_t" ADD FOREIGN KEY ("idhorarios") REFERENCES "public"."mj_horarios_t" ("idhorarios") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_lugar_t" ADD FOREIGN KEY ("idetapas") REFERENCES "public"."mj_etapas_t" ("idetapas") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_reasignacion_t"
-- ----------------------------
ALTER TABLE "public"."mj_reasignacion_t" ADD FOREIGN KEY ("idmotivoreasigna") REFERENCES "public"."mj_motivreasigna_t" ("idmotivoreasigna") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_reasignacion_t" ADD FOREIGN KEY ("idasignacion") REFERENCES "public"."mj_asignacion_t" ("idasignacion") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_reasignacion_t" ADD FOREIGN KEY ("idlugar") REFERENCES "public"."mj_lugar_t" ("idlugar") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_reasignacion_t" ADD FOREIGN KEY ("idusuario") REFERENCES "public"."mj_usuario_t" ("idusuario") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_rolopciones_t"
-- ----------------------------
ALTER TABLE "public"."mj_rolopciones_t" ADD FOREIGN KEY ("idopciones") REFERENCES "public"."mj_opciones_t" ("idopciones") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_rolopciones_t" ADD FOREIGN KEY ("idrol") REFERENCES "public"."mj_rol_t" ("idrol") ON DELETE RESTRICT ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mj_usuario_t"
-- ----------------------------
ALTER TABLE "public"."mj_usuario_t" ADD FOREIGN KEY ("idcentro") REFERENCES "public"."mj_centro_t" ("idcentro") ON DELETE RESTRICT ON UPDATE NO ACTION;
ALTER TABLE "public"."mj_usuario_t" ADD FOREIGN KEY ("idrol") REFERENCES "public"."mj_rol_t" ("idrol") ON DELETE RESTRICT ON UPDATE NO ACTION;
