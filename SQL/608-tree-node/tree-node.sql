/* Write your PL/SQL query statement below */
SELECT ID,
(
    CASE 
    WHEN P_ID IS NULL THEN 'Root'
    WHEN ID IN (
        SELECT P_ID
        FROM TREE
    ) THEN 'Inner'
    WHEN ID NOT IN (
        SELECT nvl(P_ID, 0)
        FROM TREE
    ) THEN 'Leaf'
    END
) TYPE
FROM TREE;