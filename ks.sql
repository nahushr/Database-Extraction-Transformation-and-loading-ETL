create table employee
(
eid int,
ename varchar2(20),
esalary int,
ephone int,
ebdate date,
ecity varchar2(10),
edept_name varchar2(10),
edept_no int,
egender varchar2(1)
);

insert into employee values(11,'kohli',5600,789456,'12-aug-1989','mumbai','bsc.it',5,'M');
select * from employee;
truncate table employee;

insert into employee values(11,'kohli',5600,789456,'12-aug-1989','mumbai','bsc.it',5,'M');
insert into employee values(12,'dhoni',5680,989456,'13-aug-1989','ranchi','bsc.micro',6,'F');
insert into employee values(13,'sachin',5400,754456,'22-jul-1989','mumbai','bsc.patho',7,'F');
insert into employee values(14,'rohit',5560,788756,'12-apr-1990','bihar','bsc.maths',8,'M');
insert into employee values(15,'rahane',5620,788456,'12-may-1996','delhi','bsc.fina',9,'M');
insert into employee values(16,'ishant',5210,778456,'12-feb-1989','chennai','bsc.it',5,'M');
insert into employee values(17,'yadav',5654,788756,'12-jan-1945','bengaluru','bsc.comm',10,'F');
insert into employee values(18,'s.yadav',5540,879456,'12-jan-1956','kolkata','bsc.acc',11,'M');
insert into employee values(19,'m.yadav',5560,549456,'12-nov-1965','chenna','bsc.bank',12,'M');
insert into employee values(20,'pathan',5065,787456,'12-dec-1989','mumbai','bsc.it',5,'F');
