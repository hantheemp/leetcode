/* Write your PL/SQL query statement below */
  SELECT EMPLOYEE_ID,
         (CASE
              WHEN NAME NOT LIKE 'M%' AND MOD (EMPLOYEE_ID, 2) = 1 THEN SALARY
              ELSE 0
          END)    BONUS
    FROM EMPLOYEES
ORDER BY EMPLOYEE_ID ASC