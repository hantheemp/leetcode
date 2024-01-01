# Write your MySQL query statement below
select distinct AUTHOR_ID 'id'
from VIEWS
where AUTHOR_ID = VIEWER_ID
order by AUTHOR_ID asc