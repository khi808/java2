select * from emp;

select * from emp e, dept d
	where e.deptno = d.deptno and e.deptno = 10;
	
create sequence emp_seq2
start with 9101
increment by 1
nocycle
;

select * from test1;

drop table test1;

select * from user_tables;

create table savepoint(id varchar2(10), total number(10));
select * from savepoint;
insert into savepoint values('sh1011',200);
insert into savepoint values('sh1022',600);
insert into savepoint values('sh1033',1200);
insert into savepoint values('sh1044',2000);
