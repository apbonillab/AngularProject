--ALTER USER HR ACCOUNT UNLOCKED;
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

insert into tl_clima values (1,'Caluroso');
insert into tl_clima values (2,'Nublado');
insert into tl_clima values (3,'Lluvioso');
insert into tl_ropa values (1,'Pantalon blanco');
insert into tl_ropa values (2,'Pantalon negro');
insert into tl_ropa values (3,'Blusa manga corta');
insert into tl_ropa values (4,'Chaqueta roja');
insert into tl_ropa values (5,'Paraguas negro');

INSERT INTO "CUSTOMER" (ID, NAME, EMAIL, CREATED_DATE) VALUES(1, 'mkyong','111@yahoo.com', TO_DATE('2017-02-11', 'yyyy-mm-dd'));
INSERT INTO "CUSTOMER" (ID, NAME, EMAIL, CREATED_DATE) VALUES(2, 'yflow','222@yahoo.com', TO_DATE('2017-02-12', 'yyyy-mm-dd'));
INSERT INTO "CUSTOMER" (ID, NAME, EMAIL, CREATED_DATE) VALUES(3, 'zilap','333@yahoo.com', TO_DATE('2017-02-13', 'yyyy-mm-dd'));