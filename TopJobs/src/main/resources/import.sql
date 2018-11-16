create table Qualification1 (
	 degree      VARCHAR2(30) NOT NULL,
	 major      VARCHAR2(30) NOT NULL,
	  school      VARCHAR2(50) ,
	   university      VARCHAR2(15) ,
	   start_year      VARCHAR2(50) ,
	   end_year      VARCHAR2(50) ,
	   cgpa      number ,
	   employer_id number NOT NULL,
	   PRIMARY KEY (degree, major, employer_id),
	   FOREIGN KEY (employer_id) REFERENCES Employer(employer_id)
);

create table work_experience1 (
	 
	 job_title      VARCHAR2(30) NOT NULL,
	  company_name      VARCHAR2(50) ,
	   city      VARCHAR2(15) ,
	   state      VARCHAR2(50) ,
	   country      VARCHAR2(50),
     start_date      VARCHAR2(50) NOT NULL ,
	   end_date      VARCHAR2(50) NOT NULL ,
	   description      VARCHAR2(50) ,
	   employer_id number NOT NULL,
	   PRIMARY KEY (employer_id,start_date,end_date),
	   FOREIGN KEY (employer_id) REFERENCES Employer(employer_id)
);


insert into Company(company_id, s_Company,s_Company_Size) values (COMPANY_SEQ.nextval,'Sony','1000')
insert into Company(company_id, s_Company,s_Company_Size) values (COMPANY_SEQ.nextval,'Microsoft','900')
insert into Company(company_id, s_Company,s_Company_Size) values (COMPANY_SEQ.nextval,'IBM','3000')
insert into Company(company_id, s_Company,s_Company_Size) values (COMPANY_SEQ.nextval,'RobertBosch','2000')
insert into Company(company_id, s_Company,s_Company_Size) values (COMPANY_SEQ.nextval,'Oracle','7000')

insert into Employer(employer_id,company_id,s_Email,s_First_Name,s_Name,s_Gender,sDOB,s_Phone,s_Password) values (EMPLOYER_SEQ.nextval,1,'teli.pooja@gmail.com','Pooja','Teli','Female','14/01/1996','9875674737','pooja');
insert into Employer(employer_id,company_id,s_Email,s_First_Name,s_Name,s_Gender,sDOB,s_Phone,s_Password) values (EMPLOYER_SEQ.nextval,2,'raamsharma@gmail.com','Raam','Sharma','Male','14/05/1986','6574847737','raam');
insert into Employer(employer_id,company_id,s_Email,s_First_Name,s_Name,s_Gender,sDOB,s_Phone,s_Password) values (EMPLOYER_SEQ.nextval,2,'shreepatil@gmail.com','Shree','Patil','female','19/03/2000','7282674897','shree');
insert into Employer(employer_id,company_id,s_Email,s_First_Name,s_Name,s_Gender,sDOB,s_Phone,s_Password) values (EMPLOYER_SEQ.nextval,3,'anushakiran@gmail.com','anusha','Kiran','female','24/03/1993','8837674733','anusha');
insert into Employer(employer_id,company_id,s_Email,s_First_Name,s_Name,s_Gender,sDOB,s_Phone,s_Password) values (EMPLOYER_SEQ.nextval,4,'shivamprasad@gmail.com','Shivam','Prasad','Male','11/11/1995','8374827389','shivam');

select * from Employer;

insert into Qualification(qualification_id,employer_id,degree,major,school,university,start_year,end_year,cgpa) values (QUALIFICATION_SEQ.nextval,1,'BE','ComputerScience','Convent','BVB','14/01/2014','14/01/2018',8);
insert into Qualification(qualification_id,employer_id,degree,major,school,university,start_year,end_year,cgpa) values (QUALIFICATION_SEQ.nextval,1,'BE','ComputerScience','Convent','BVB','14/01/2014','14/01/2018',8);
insert into Qualification(qualification_id,employer_id,degree,major,school,university,start_year,end_year,cgpa) values (QUALIFICATION_SEQ.nextval,1,'BE','ComputerScience','Convent','BVB','14/01/2014','14/01/2018',8);

insert into Qualification1(employer_id,degree,major,school,university,start_year,end_year,cgpa) values (1,'BE','ComputerScience','Convent','BVB','14/01/2014','14/01/2018',8);
insert into Qualification1(employer_id,degree,major,school,university,start_year,end_year,cgpa) values (2,'BA','PoliticalScience','Convent','KLE','30/01/2013','24/01/2016',9);
insert into Qualification1(employer_id,degree,major,school,university,start_year,end_year,cgpa) values (3,'BE','InformationScience','Convent','Ramaiah','14/02/2012','04/01/2016',9);
insert into Qualification1(employer_id,degree,major,school,university,start_year,end_year,cgpa) values (3,'MBA','Finance','Convent','GIIM','14/01/2014','14/01/2017',7);
insert into Qualification1(employer_id,degree,major,school,university,start_year,end_year,cgpa) values (5,'BBA','Marketing','Convent','BIBM','12/11/2013','12/11/2016',7.7);

insert into Work_Experience1(employer_id,job_title,company_name,city,state,country,start_date,end_date,description) values (4,'Finance','Sony','Bangalore','Karnataka','India','14/01/2014','14/01/2018','aaaaaaaaaaaaaaaa');
insert into Work_Experience1(employer_id,job_title,company_name,city,state,country,start_date,end_date,description) values (2,'Marketing','Accenture','Bangalore','Karnataka','India','14/01/2014','14/01/2018','aaaaaaaaaaaaaaaa');
insert into Work_Experience1(employer_id,job_title,company_name,city,state,country,start_date,end_date,description) values (3,'Sales','IBM','Bangalore','Karnataka','India','14/01/2014','14/01/2018','aaaaaaaaaaaaaaaa');
insert into Work_Experience1(employer_id,job_title,company_name,city,state,country,start_date,end_date,description) values (5,'Engineering','Cisco','Bangalore','Karnataka','India','14/01/2014','14/01/2018','aaaaaaaaaaaaaaaa');
insert into Work_Experience1(employer_id,job_title,company_name,city,state,country,start_date,end_date,description) values (1,'Finance','Sony','Bangalore','Karnataka','India','14/01/2014','14/01/2018','aaaaaaaaaaaaaaaa');
insert into Work_Experience1(employer_id,job_title,company_name,city,state,country,start_date,end_date,description) values (1,'Finance','Sony','Bangalore','Karnataka','India','14/01/2014','14/01/2018','aaaaaaaaaaaaaaaa');

insert into Post(post_id,employer_id,company_id,job_category,job_title,city,state,country,pin,job_type,salary,summary,duties,skills,benefits, experience, education) values (POST_SEQ.nextval,1,1,'Finance','Manager','Bangalore','Karnataka','India','560013','full-time',40000,'aaaaaaaa','aaaaaaaaaaa','aaaaaaaaa','aaaaaaaaa',3,'PG');
insert into Post(post_id,employer_id,company_id,job_category,job_title,city,state,country,pin,job_type,salary,summary,duties,skills,benefits, experience, education) values (POST_SEQ.nextval,5,4,'Sales','HR','Bangalore','Karnataka','India','560013','half-time',40000,'aaaaaaaa','aaaaaaaaaaa','aaaaaaaaa','aaaaaaaaa',0,'UG');
insert into Post(post_id,employer_id,company_id,job_category,job_title,city,state,country,pin,job_type,salary,summary,duties,skills,benefits, experience, education) values (POST_SEQ.nextval,4,3,'Finance','Manager','Bangalore','Karnataka','India','560013','full-time',40000,'aaaaaaaa','aaaaaaaaaaa','aaaaaaaaa','aaaaaaaaa',2,'UG');
insert into Post(post_id,employer_id,company_id,job_category,job_title,city,state,country,pin,job_type,salary,summary,duties,skills,benefits, experience, education) values (POST_SEQ.nextval,4,3,'Marketing','Developer','Bangalore','Karnataka','India','560013','full-time',40000,'aaaaaaaa','aaaaaaaaaaa','aaaaaaaaa','aaaaaaaaa',6,'PG');
insert into Post(post_id,employer_id,company_id,job_category,job_title,city,state,country,pin,job_type,salary,summary,duties,skills,benefits, experience, education) values (POST_SEQ.nextval,3,2,'Engineering','Tester','Bangalore','Karnataka','India','560013','full-time',40000,'aaaaaaaa','aaaaaaaaaaa','aaaaaaaaa','aaaaaaaaa',1,'PG');

