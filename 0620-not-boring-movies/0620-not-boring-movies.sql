# Write your MySQL query statement below
select * from Cinema where (id%2 = 1 AND description != "boring") order by rating DESC; 