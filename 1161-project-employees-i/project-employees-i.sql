select 
    p.project_id, 
    coalesce(round(sum(ifnull(e.experience_years, 0)) / nullif(count(e.experience_years), 0), 2), 0) AS average_years
from 
    Project p
left join 
    Employee e ON p.employee_id = e.employee_id
group by
    p.project_id;
