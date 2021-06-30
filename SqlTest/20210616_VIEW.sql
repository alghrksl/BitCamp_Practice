-- 20210616

-- VIEW 

-- 자주 사용되는 30번 부서에 사원들의 사번과 이름 부서번호을 뷰로 출력해보쟈

-- CREATE VIEW
CREATE OR REPLACE VIEW EMP_VIEW30
AS
SELECT
    EMPNO, ENAME, DEPTNO
FROM EMP 
WHERE DEPTNO = 30; 

-- SELECT VIEW
SELECT
    *
FROM EMP_VIEW30;

-- VIEW DROP
DROP VIEW EMP_VIEW30;

--INLINE VIEW로 TOP3 구하기
SELECT ROWNUM, ENAME, HIREDATE
    FROM (SELECT
        *
    FROM emp ORDER BY emp.ename)
WHERE  ROWNUM < 6;

-- 시퀀스

CREATE SEQUENCE pi_idx_pk;
SELECT
    pi_idx_pk.nextval
FROM dual;

SELECT
    pi_idx_pk.currval
FROM dual;
