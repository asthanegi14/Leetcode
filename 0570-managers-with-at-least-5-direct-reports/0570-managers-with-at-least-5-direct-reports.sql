# Write your MySQL query statement below
SELECT name from Employee where id in(SELECT managerId
FROM Employee
WHERE managerId IS NOT NULL
GROUP BY managerId
HAVING COUNT(*) >= 5);
