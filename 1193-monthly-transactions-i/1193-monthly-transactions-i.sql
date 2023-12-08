# Write your MySQL query statement below
select DATE_FORMAT(trans_date, '%Y-%m') as month,
country, 
count(id) as trans_count,
count(if(state="approved",1, null)) as approved_count,
sum(amount) as trans_total_amount,
sum(if(state="approved", amount, 0)) as approved_total_amount 
from Transactions 
group by DATE_FORMAT(trans_date, '%Y-%m'), country;