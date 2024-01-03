select project_id, ROUND(AVG(experience_years),2) average_years
from Project
join Employee on Project.employee_id = Employee.employee_id
group by project_id;