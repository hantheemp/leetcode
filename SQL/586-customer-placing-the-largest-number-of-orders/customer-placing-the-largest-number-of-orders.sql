/* Write your PL/SQL query statement below */
  SELECT CUSTOMER_NUMBER
    FROM ORDERS
GROUP BY CUSTOMER_NUMBER
  HAVING COUNT (CUSTOMER_NUMBER) = (  SELECT MAX (COUNT (CUSTOMER_NUMBER))
                                        FROM ORDERS
                                    GROUP BY CUSTOMER_NUMBER);