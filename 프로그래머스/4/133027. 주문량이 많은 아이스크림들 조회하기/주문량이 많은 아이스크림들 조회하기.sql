-- 코드를 입력하세요
SELECT FH.FLAVOR
FROM   FIRST_HALF FH
JOIN   (SELECT FLAVOR
          ,    SUM(TOTAL_ORDER) AS TOTAL_ORDER
        FROM   JULY
        GROUP BY FLAVOR )JULY
ON     FH.FLAVOR = JULY.FLAVOR
GROUP BY FLAVOR
ORDER BY SUM(FH.TOTAL_ORDER + JULY.TOTAL_ORDER) DESC
LIMIT 3
