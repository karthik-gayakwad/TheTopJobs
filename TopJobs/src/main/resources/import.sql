insert into Employer(id,s_Email,s_First_Name,s_Name,s_Gender,sDOB,s_Company,s_Company_Size,s_Phone,s_Password) values (EMPLOYER_SEQ.nextval,'teli.pooja@gmail.com','pooja','teli','female','14/01/1996','sony','2000','9875674737','pooja');

insert into Qualification(id,degree,major,school,university,start_year,end_year,cgpa) values (QUALIFICATION_SEQ.nextval,'BE','ComputerScience','Convent','BVB','14/01/2014','14/01/2018',8);

insert into Work_Experience(id,job_title,company_name,city,state,country,start_date,end_date,description) values (EXPERIENCE_SEQ.nextval,'Finance','Sony','Bangalore','Karnataka','India','14/01/2014','14/01/2018','aaaaaaaaaaaaaaaa');

insert into Post(id,job_category,job_title,company,city,state,country,pin,job_type,salary,summary,duties,skills,benefits, experience, education) values (POST_SEQ.nextval,'Finance','Manager','Sony','Bangalore','Karnataka','India','560013','full-time',40000,'aaaaaaaa','aaaaaaaaaaa','aaaaaaaaa','aaaaaaaaa',3,'PG');

