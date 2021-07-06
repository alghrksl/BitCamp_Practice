create table dept01
as
SELECT
    *
FROM 
dept
where 1=0;

INSERT INTO dept01 VALUES (10,'개발팀','서울');

INSERT INTO DEPT01 VALUES (20,'밥묵자','배아파');

desc dept01;

SELECT *
FROM dept01;


DROP TABLE DEPT02;

CREATE TABLE DEPT02 AS
SELECT
    *
FROM DEPT WHERE 1=0;
SELECT
    *
FROM DEPT02;

INSERT INTO DEPT02
SELECT
    *
FROM DEPT;

SELECT
    *
FROM DEPT02;



-- UPDATE
CREATE TABLE DEPT03 AS
SELECT
    *
FROM DEPT;

SELECT
    *
FROM DEPT03;

UPDATE DEPT03 SET LOC = 'SEOUL';

SELECT
    *
FROM DEPT03;

UPDATE DEPT03 SET LOC = 'BUSAN',DNAME = 'DEV' WHERE deptno = 10 ;

--  UPUDATE02

DROP table emp01;

CREATE TABLE EMP01
AS SELECT
    *
FROM EMP;
SELECT
    *
FROM EMP01;

ROLLBACK
-- 모든 사원의 부서번호를 30번으로 수정하쟈

UPDATE EMP01 SET EMPNO = 30;
UPDATE EMP01 SET sal = sal * 1.1;
UPDATE EMP01 SET hiredate = sysdate;

-- 조건에 따라 수정해보쟈
UPDATE EMP01 SET deptno = '30' WHERE deptno = '10';
UPDATE EMP01 SET deptno = '30' WHERE deptno = '10';
UPDATE EMP01 SET HIREDATE = SYSDATE WHERE substr(hiredate, 1 ,2) = '80' ;


-- 스콧사원의 부서번호를 20번으로 직급은 매니저로 한번에 바꿔보쟈
UPDATE EMP01 SET DEPTNO = '20', JOB = 'MANAGER' WHERE ENAME = 'SCOTT'


-- 서브쿼리를 이용해 데이터를 수정하는 법을 알아보지말쟈

CREATE TABLE DEPT01
AS SELECT
    *
FROM DEPT;

SELECT * FROM DEPT01;

SELECT
    *
FROM DEPT01 WHERE deptno=10; 