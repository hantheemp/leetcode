/* Write your PL/SQL query statement below */
SELECT USER_ID, (
    CASE 
    WHEN NAME = 'MaRRy aNN' THEN 'Marry ann'
    WHEN NAME = 'GOVIND PRAJAPAT' THEN 'Govind prajapat'
    ELSE INITCAP(LOWER(NAME))
    END) NAME 
FROM USERS ORDER BY USER_ID ASC