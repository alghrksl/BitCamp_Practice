-- (5) 박지성이구매한도서의출판사수

 SELECT COUNT(DISTINCT PUBLISHER) AS 출판사카운트
    FROM BOOK B , (SELECT bookid
                   FROM orders o, customer b
                   WHERE b.custid = o.custid  
                   and o.custid = 1 ) k
WHERE B.BOOKID = k.bookid;


-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격의 차이


SELECT b.bookname , k.saleprice , b.price , b.price - k.saleprice as 차이
    FROM BOOK B , (SELECT bookid, saleprice
                   FROM orders o, customer b
                   WHERE b.custid = o.custid  
                   and o.custid = 1 ) k
WHERE B.BOOKID = k.bookid;

-- (7) 박지성이 구매하지 않은 도서의 이름


SELECT
b.bookname
FROM 
book b
where not EXISTS ( SELECT bookname 
                   FROM orders o, customer b
                   WHERE b.custid = o.custid 
                   and b.bookid = o.bookid 
                   and o.custid = 1 ) ;

-- (8) 주문하지 않은 고객의 이름(부속질의사용)

SELECT
    name
FROM customer c
WHERE not EXISTS ( SELECT
                   DISTINCT o.custid
                   FROM orders o WHERE c.custid = o.custid);
                   
-- (9) 주문금액의 총액과 주문의 평균금액

SELECT
    avg(saleprice) as 평균금액, SUM(saleprice) as  총액
FROM orders;

-- (10) 고객의 이름과 고객 별 구매액
SELECT (SELECT
    c.name
FROM customer c
WHERE o.custid = c.custid
) , sum(o.saleprice)
FROM orders o
GROUP BY o.custid;


-- (11) 고객의 이름과 고객이 구매한 도서 목록

SELECT name , bookname
 FROM customer NATURAL JOIN book NATURAL JOIN orders;
 
 -- (12) 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문
 
SELECT *
FROM BOOK NATURAL JOIN ORDERS
WHERE PRICE - SALEPRICE = (SELECT MAX(PRICE-SALEPRICE)
                               FROM BOOK NATURAL JOIN ORDERS);
 
 -- (13) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름

 SELECT NAME,AVG(SALEPRICE),(SELECT AVG(SALEPRICE)
                             FROM ORDERS)
    FROM CUSTOMER NATURAL JOIN ORDERS
   GROUP BY NAME
   HAVING AVG(SALEPRICE) > (SELECT AVG(SALEPRICE)
                             FROM ORDERS);
 

 -- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름

SELECT NAME
    FROM CUSTOMER NATURAL JOIN BOOK NATURAL JOIN ORDERS
    WHERE PUBLISHER IN (  SELECT b.publisher
    FROM BOOK B , (SELECT bookid
                   FROM orders o, customer b
                   WHERE b.custid = o.custid  
                   and o.custid = 1 ) k
WHERE B.BOOKID = k.bookid)
          AND NAME != '박지성';

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

     SELECT NAME
    FROM CUSTOMER NATURAL JOIN BOOK NATURAL JOIN ORDERS
    GROUP BY NAME
    HAVING COUNT(DISTINCT PUBLISHER) >= 2;
