
--DROP TABLE TL_ROPA;
--DROP TABLE TL_CLIMA;
--DROP TABLE TL_CIUDAD;
--DROP TABLE TL_OCASION;
--DROP TABLE TL_ACCOUNT;
--DROP TABLE TL_CUENTA;

--ALTER USER HR ACCOUNT UNLOKED;
--ALTER USER HR IDENTIFIED BY HR;

CREATE TABLE TL_ROPA 
(
  ID_ROPA INT 
, ROPA VARCHAR(50) 
, CONSTRAINT TL_ROPA_PK PRIMARY KEY 
  (
    ID_ROPA 
  )
);



CREATE TABLE TL_CLIMA 
(
  ID_CLIMA NUMBER(*, 0) NOT NULL 
, CLIMA VARCHAR2(50 BYTE) 
, CONSTRAINT TL_CLIMA_PK PRIMARY KEY 
  (
    ID_CLIMA 
  )
 );
 
 CREATE TABLE TL_CIUDAD
 (
   ID_CIUDAD NUMERIC(8, 0) NOT NULL 
,  DESCRIPCION VARCHAR2(50 BYTE) 
, CONSTRAINT TL_CIUDAD_PK PRIMARY KEY 
  (
    ID_CIUDAD 
  )
 );
 
 CREATE TABLE TL_OCASION
 (
 	ID_OCASION NUMERIC(8,0) NOT NULL
 	,DESCRIPCION VARCHAR2(50)
 	, CONSTRAINT TL_OCASION_PK PRIMARY KEY 
  	(
    	ID_OCASION 
  	)
 );

  CREATE SEQUENCE TL_CUENTA_SQ
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 99999999
	START WITH 1;

 
  CREATE TABLE TL_CUENTA
  (
 	ID_CUENTA NUMERIC(8,0) NOT NULL
 	,NOMBRE VARCHAR2(50)
 	,APELLIDOS VARCHAR2(50)
 	,USERNAME VARCHAR2(20)
 	,MAIL VARCHAR2(20)
 	,PASSWORD VARCHAR2(20)
 	,FECHA_NACIMIENTO TIMESTAMP
 	, CONSTRAINT TL_CUENTA_PK PRIMARY KEY 
  	(
    	ID_CUENTA 
  	)
 );
 
insert into tl_clima values (1,'Caluroso');
insert into tl_clima values (2,'Nublado');
insert into tl_clima values (3,'Lluvioso');
insert into tl_ropa values (1,'Pantalon blanco');
insert into tl_ropa values (2,'Pantalon negro');
insert into tl_ropa values (3,'Blusa manga corta');
insert into tl_ropa values (4,'Chaqueta roja');
insert into tl_ropa values (5,'Paraguas negro');

insert into TL_CIUDAD values (1,'Bogotá');
insert into TL_CIUDAD values (2,'Cali');
insert into TL_CIUDAD values (3,'Medellín');
insert into TL_CIUDAD values (4,'Barranquilla');
insert into TL_CIUDAD values (5,'Bucaramanga');

insert into TL_OCASION values (1,'Trabajo en oficina');
insert into TL_OCASION values (2,'Cena de negocios');
insert into TL_OCASION values (3,'Noche de copas');
insert into TL_OCASION values (4,'Práctica de deportes');
insert into TL_OCASION values (5,'Reunión ejecutiva');
insert into TL_OCASION values (6,'Cena con Amigos');
insert into TL_OCASION values (7,'Día de compras');
insert into TL_OCASION values (8,'Fiesta elegante');

commit;