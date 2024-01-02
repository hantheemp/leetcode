# Write your MySQL query statement below
select distinct A1.machine_id, round(sum(A2.timestamp - A1.timestamp)/ count(A1.machine_id), 3) processing_time
from Activity A1
join Activity A2 where A1.machine_id = A2.machine_id
and A1.process_id = A2.process_id
and A2.activity_type = 'end'
and A1.activity_type = 'start'
group by A1.machine_id