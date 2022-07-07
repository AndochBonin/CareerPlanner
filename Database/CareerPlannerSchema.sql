--drop schema CareerPlanner cascade;

create schema if not exists CareerPlanner;

--drop table if exists CareerPlanner.Students;
--drop table if exists CareerPlanner.Careers;
--drop table if exists CareerPlanner.Responses;

create table CareerPlanner.Students 
(

	student_id integer not null primary key,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	email_address varchar(40) not null,
	account_password varchar(40) not null
);

create table CareerPlanner.Careers 
(
	
	career_id integer not null primary key,
	career_name varchar(255) not null,
	description text not null,
	avg_salary integer not null
);

create table CareerPlanner.Responses 
(
	
	response_id integer not null primary key,
	response1 varchar(255) not null,
	response2 varchar(255) not null,
	response3 varchar(255) not null,
	response4 varchar(255) not null,
	response5 varchar(255) not null,
	response6 varchar(255) not null,
	response7 varchar(255) not null,
	response8 varchar(255) not null,
	response9 varchar(255) not null,
	response10 varchar(255) not null,
	student_id integer not null,
	foreign key (student_id) references CareerPlanner.Students(student_id)
);

delete from CareerPlanner.Careers;

insert into CareerPlanner.Careers 
values(1, 'Frontend', 
'Front end engineers plan, design, build, and implement the user interface systems of websites, 
software programs, and web-based applications.', 103830);

insert into CareerPlanner.Careers 
values(2, 'Backend', 
'Back End Engineers are responsible for curating the structure of server side information, 
primarily writing scripts and APIs to be used by front end and UX engineers', 117366 );

insert into CareerPlanner.Careers 
values(3, 'Full Stack', 'Full-stack engineers are computer programmers with proficiency in front and back-end systems. 
They design user interactions on websites and develop servers and databases for website functionality', 105186 );



