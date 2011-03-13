

-- Generated by Relational Schema Center on Wed Mar 31 16:11:50 CEST 2010 for Microsoft SQL Server 2000

   

CREATE TABLE TODO
  (ID INT NOT NULL,
   TODONAME VARCHAR(250) NULL,
   STARTTIME DATETIME NULL,
   ENDTIME DATETIME NULL,
   COMMENT1 VARCHAR(250) NULL,
   PERSON_USERNAME VARCHAR(250) NULL,
   CATEGORY_ID INT NULL);

ALTER TABLE TODO
  ADD CONSTRAINT PK_TODO PRIMARY KEY (ID);

CREATE TABLE CATEGORY
  (ID INT NOT NULL,
   CATEGORYNAME VARCHAR(250) NULL);

ALTER TABLE CATEGORY
  ADD CONSTRAINT PK_CATEGORY PRIMARY KEY (ID);

CREATE TABLE PERSON
  (USERNAME VARCHAR(250) NOT NULL,
   PASSWORD VARCHAR(250) NULL,
   FIRSTNAME VARCHAR(250) NULL,
   LASTNAME VARCHAR(250) NULL,
   EMAILADDRESS VARCHAR(250) NULL);

ALTER TABLE PERSON
  ADD CONSTRAINT PK_PERSON PRIMARY KEY (USERNAME);