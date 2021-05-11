-- 2021-05-10
-- food 접속


-- 식품정보 테이블 생성
CREATE TABLE tbl_foods (
    f_code	    CHAR(7)		    PRIMARY KEY,
    f_name	    nVarCHAR2(125)	NOT NULL	,
    f_year	    NUMBER	        NOT NULL	,
    f_ccode	    CHAR(6)	        NOT NULL	,
    f_icode	    CHAR(4)	        NOT NULL	,
    f_offer	    NUMBER	        NOT NULL	,
    f_total	    NUMBER	        NOT NULL	,
    f_kcal	    NUMBER	        NOT NULL	,
    f_protein	NUMBER		,
    f_fat	    NUMBER		,
    f_car	    NUMBER		,
    f_sugar	    NUMBER		
);

-- 제조사 정보 테이블
CREATE TABLE tbl_company (
    c_code	CHAR(6)		PRIMARY KEY,
    c_name	nVarCHAR2(125)	NOT NULL	
);

CREATE TABLE tbl_items(
    i_code	CHAR(4)		    PRIMARY KEY	,
    i_name	nVarCHAR2(20)	NOT NULL		
);

DELETE FROM tbl_company
WHERE 1=1 ;

DROP TABLE tbl_company;


SELECT COUNT(*) FROM tbl_foods;
SELECT COUNT(*) FROM tbl_company;
SELECT COUNT(*) FROM tbl_items;


ALTER TABLE tbl_foods
ADD CONSTRAINT fk_ccode
FOREIGN KEY(f_ccode)
REFERENCES tbl_company(c_code);

ALTER TABLE tbl_foods
ADD CONSTRAINT fk_icode
FOREIGN KEY(f_icode)
REFERENCES tbl_items(i_code);


CREATE VIEW view_식품정보 AS
(
SELECT ff.f_code AS 식품코드,
        ff.f_name AS 식품명,
        ff.f_year AS 출시연도,
        ff.f_ccode AS 제조사코드,
        fc.c_name AS 제조사명,
        ff.f_icode AS 분류코드,
        fi.i_name AS 분류명,
        ff.f_offer AS 일회제공량,
        ff.f_total AS 총내용량,
        ff.f_kcal AS 에너지,
        ff.f_protein AS 단백질,
        ff.f_fat AS 지방,
        ff.f_car AS 탄수화물,
        ff.f_sugar AS 총당류
FROM tbl_foods FF
    LEFT JOIN tbl_company FC
        ON f_ccode = c_code
    LEFT JOIN tbl_items FI
        ON f_icode = i_code
);


SELECT * FROM "VIEW_식품정보";



CREATE TABLE tbl_myfoods (
    mf_seq	NUMBER		    PRIMARY KEY,
    mf_date	VarCHAR2(10)	NOT NULL	,
    mf_code	CHAR(7)	        NOT NULL	,
    mf_eat	NUMBER	        NOT NULL	
);


-- sequence 객체
CREATE SEQUENCE seq_myFoods
START WITH 1
INCREMENT BY 1 ;



CREATE VIEW view_일일섭취량 AS
(
SELECT mf.mf_seq   AS 일련번호,
        mf.mf_date   AS 날짜,
        mf.mf_code AS 식품코드,
        ff.f_name AS 식품명,
        mf.mf_eat AS 섭취량,
        (ff.f_kcal * mf.mf_eat) AS 칼로리,
        (ff.f_protein * mf.mf_eat) AS 단백질,
        (ff.f_fat * mf.mf_eat) AS 지방,
        (ff.f_car * mf.mf_eat) AS 탄수화물,
        (ff.f_sugar * mf.mf_eat) AS 총당류
FROM tbl_myfoods MF
    LEFT JOIN tbl_foods FF
        ON mf.mf_code = ff.f_code
);

DROP VIEW view_일일섭취량 ;


INSERT INTO tbl_myfoods(mf_seq, mf_date, mf_code, mf_eat )
VALUES(seq_myFoods.nextval, '2021-05-10', 'PD00007', 1);

INSERT INTO tbl_myfoods(mf_seq, mf_date, mf_code, mf_eat )
VALUES(seq_myFoods.nextval, '2021-05-10', 'PD00010', 2);

INSERT INTO tbl_myfoods(mf_seq, mf_date, mf_code, mf_eat )
VALUES(seq_myFoods.nextval, '2021-05-10', 'PD00025', 3);

INSERT INTO tbl_myfoods(mf_seq, mf_date, mf_code, mf_eat )
VALUES(seq_myFoods.nextval, '2021-05-10', 'PD00001', 5);


SELECT *
FROM "VIEW_일일섭취량" 
ORDER BY "날짜";



SELECT * FROM view_식품정보
WHERE 식품명 Like '%' || '샌드' || '%' ;


SELECT * FROM view_일일섭취량
WHERE 날짜 BETWEEN '2021-04-20' AND '2021-05-10'
ORDER BY 날짜;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        