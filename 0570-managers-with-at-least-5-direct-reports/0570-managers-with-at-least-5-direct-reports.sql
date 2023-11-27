# Write your MySQL query statement below

# one way by using nested query

# SELECT name from Employee where id in(SELECT managerId
# FROM Employee
# WHERE managerId IS NOT NULL
# GROUP BY managerId
# HAVING COUNT(*) >= 5);

# 2nd way by using joins

select e2.name from employee e inner join employee e2 on e.managerId = e2.id group by e.managerId having count(e.id)>=5;


