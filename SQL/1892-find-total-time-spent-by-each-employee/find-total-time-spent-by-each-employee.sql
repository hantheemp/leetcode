/* Write your PL/SQL query statement below */
  SELECT TO_CHAR (EVENT_DAY, 'YYYY-MM-DD')     DAY,
         EMP_ID,
         SUM (OUT_TIME - IN_TIME)              TOTAL_TIME
    FROM EMPLOYEES
GROUP BY TO_CHAR (EVENT_DAY, 'YYYY-MM-DD'), EMP_ID