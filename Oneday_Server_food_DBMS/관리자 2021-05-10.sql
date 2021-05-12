-- 2021.05.10.
-- 관리자 접속

CREATE TABLESPACE FoodDB
DATAFILE 'C:/oraclexe/data/foood.dbf'
SIZE 1M AUTOEXTEND ON NEXT 1K ;

CREATE USER food IDENTIFIED BY food
DEFAULT TABLESPACE FoodDB;

GRANT DBA TO food ;




CREATE TABLESPACE myFoodDB
DATAFILE 'C:/oraclexe/data/myFoodDB.dbf'
SIZE 1M AUTOEXTEND ON NEXT 1K ;

CREATE USER myfood IDENTIFIED BY myfood
DEFAULT TABLESPACE FoodDB;

GRANT DBA TO myfood ;
