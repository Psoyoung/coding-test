-- 코드를 입력하세요
SELECT   A.HOUR
   ,     CASE WHEN B.COUNT IS NULL 
              THEN 0 ELSE B.COUNT END AS COUNT
FROM(    SELECT   LEVEL-1 AS HOUR
         FROM     DUAL CONNECT BY LEVEL <= 24 
) A
LEFT OUTER
JOIN(
SELECT  TO_CHAR(DATETIME,'FMHH24') AS HOUR
    ,   COUNT(*) AS COUNT
FROM    ANIMAL_OUTS
GROUP BY TO_CHAR(DATETIME,'FMHH24')
) B
ON A.HOUR = B.HOUR
ORDER BY A.HOUR