insert into HibernateWithMYSQL.product_table
(product_id, registered_at, last_update, price, prod_description, prod_name, product_cat, quantity, type) values
(100, '2000-12-12', '2000-12-12', 23, 'Rice brand', 'Daawat', 'Food', 2200, 'Grocery'),
(23, '2000-12-10', '2000-12-10', 450, 'Jaggery brand', 'RedTest', 'Sweet', 180, 'Grocery'),
(2, '2000-12-10', '2000-12-10', 223, 'Mung Dal', 'Kissan', 'Pulse', 10, 'Grocery'),
(3, '2000-12-10', '2000-12-10', 56, 'Soya Oil', 'Finary', 'Oil', 80, 'Grocery'),
(24, '2000-12-10', '2000-12-10', 780, 'kismis', 'Dry fruits', 'Topnotch', 70, 'DryFruits'),
(25, '2000-12-10', '2000-12-10', 579, 'Kaju', 'Dry Fruits', 'Topnotc', 180, 'Dryfruits')
--(6, '2000-12-10', '2000-12-10', 986, 'Kothim', 'Pala', 'veg', 170, 'Grocery'),
--(7, '2000-12-10', '2000-12-10', 90, 'chane', 'chne', 'pulse', 10, 'Grocery'),
--(8, '2000-12-10', '2000-12-10', 457, 'Patti', 'Chai', 'Tea', 30, 'Grocery'),
--(9, '2000-12-10', '2000-12-10', 982, 'Kesar', 'Kesar', 'Prime', 90, 'Luxury') //Comments
;


insert into HibernateWithMYSQL.departments (deptid, department_desc, department_name) values
(1, "this is first department", "Physics"),
(2, "This is the second", "Chemistry"),
(3, "This is the third", "Math")
;


insert into HibernateWithMYSQL.employees (empid, name, salary, contact, department_id) values
(1, "Aniket", 34545, 7834664, 1),
(2,"Rajesh", 876443, 43976374, 1),
(3,"Amey", 8984, 83687532, 2),
(4, "Shilpa", 847, 4837434,3)
;
