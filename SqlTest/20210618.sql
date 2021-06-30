-- 20210618

-- JDBC

SELECT
    *
FROM dept01;

INSERT INTO dept01 VALUES (10, 'DEV', 'SEOUL');

-- DEPT01 테이블에 DPPNO 에 입력할 일련 번호

CREATE SEQUENCE DEPT01_DEPTNO_SEQ
START WITH 20
INCREMENT BY 10;

DELETE FORM DEPT01 WHERE DEPTNI = 10;
