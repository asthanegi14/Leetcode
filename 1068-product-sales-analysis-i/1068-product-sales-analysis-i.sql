# Write your MySQL query statement below
select p.product_name, s.year, s.price from Sales s 
left join Product p on p.product_id = s.product_id 
order by s.year;