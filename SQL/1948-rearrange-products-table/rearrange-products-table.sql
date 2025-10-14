/* Write your PL/SQL query statement below */
SELECT *
  FROM (SELECT PRODUCT_ID,
               (CASE WHEN STORE1 IS NOT NULL THEN 'store1' END)     STORE,
               STORE1                                               PRICE
          FROM PRODUCTS
        UNION
        SELECT PRODUCT_ID,
               (CASE WHEN STORE2 IS NOT NULL THEN 'store2' END)     STORE,
               STORE2                                               PRICE
          FROM PRODUCTS
        UNION
        SELECT PRODUCT_ID,
               (CASE WHEN STORE3 IS NOT NULL THEN 'store3' END)     STORE,
               STORE3                                               PRICE
          FROM PRODUCTS)
 WHERE (STORE IS NOT NULL AND PRICE IS NOT NULL);