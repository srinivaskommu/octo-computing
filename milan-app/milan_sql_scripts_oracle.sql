drop table customer;
drop table VISIT;
drop table ADDRESS;


CREATE TABLE CUSTOMER
(
CUSTOMER_ID NUMBER, 
LAST_NAAE varchar(255),
FIRST_NAME varchar(255),
IS_MEMBER VARCHAR2 (1),
MEMBER_TYPE varchar(255),
CONSTRAINT pk_CUSTOMER_ID PRIMARY KEY (CUSTOMER_ID)

)
CREATE SEQUENCE MILAN_customers_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;


CREATE TABLE ADDRESS
(
ADDRESS_ID number,
CUSTOMER_ID number,
CITY_NAME varchar(255),
STREET_NAME varchar(255),
STATE varchar(12),
COUNTRY  varchar(12),
ZIP_CODE varchar(10),
PRIMARY KEY (ADDRESS_ID,CUSTOMER_ID),
CONSTRAINT address_customer  FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
)

CREATE SEQUENCE MILAN_ADDRESS_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;


CREATE TABLE VISIT
(
VISIT_ID number,
CUSTOMER_ID number,
VISIT_DESCRIPTION varchar(255),
VISIT_DATE TIMESTAMP,
SERVICES_EXPENCE NUMBER(9,2),
PRODUCTS_EXPENCE NUMBER(9,2),
PRIMARY KEY (CUSTOMER_ID,VISIT_ID),
CONSTRAINT visit_customer  FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
)


CREATE SEQUENCE MILAN_VISIT_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
