/* Write your PL/SQL query statement below */
SELECT s.USER_ID, ROUND(AVG(
    CASE
        WHEN c.action = 'confirmed' THEN 1.00
        ELSE 0.00
    END
), 2) CONFIRMATION_RATE
FROM SIGNUPS s
LEFT JOIN CONFIRMATIONS c
ON s.USER_ID = c.USER_ID
GROUP BY s.USER_ID