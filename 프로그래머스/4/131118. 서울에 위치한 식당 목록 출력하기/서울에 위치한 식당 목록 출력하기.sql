-- 코드를 입력하세요
SELECT   A1.REST_ID
   ,     A1.REST_NAME
   ,     A1.FOOD_TYPE
   ,     A1.FAVORITES
   ,     A1.ADDRESS
   ,     A2.REVIEW_SCORE
FROM     REST_INFO A1
LEFT OUTER
JOIN     (SELECT REST_ID
             ,   ROUND(AVG(REVIEW_SCORE),2) AS REVIEW_SCORE 
          FROM   REST_REVIEW
          GROUP BY REST_ID) A2
ON       A1.REST_ID = A2.REST_ID
WHERE    LEFT(ADDRESS,2) = '서울'
AND      A2.REST_ID IS NOT NULL
ORDER BY A2.REVIEW_SCORE DESC, A1.FAVORITES DESC
