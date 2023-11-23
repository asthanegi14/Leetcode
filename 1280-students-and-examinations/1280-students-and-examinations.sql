# Write your MySQL query statement below
select stu.student_id, stu.student_name, sub.subject_name, count(e.student_id) as attended_exams 
from students stu 
cross join subjects sub 
left join examinations e on sub.subject_name = e.subject_name AND stu.student_id = e.student_id
group by stu.student_name, stu.student_id, sub.subject_name
order by stu.student_id, sub.subject_name;