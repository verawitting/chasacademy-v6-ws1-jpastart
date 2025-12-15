create table teacher(
	id serial primary key,
	name varchar(100) not null,
	email varchar(100) not null
);

create table student(
    id serial primary key,
    name varchar(100) not null,
    email varchar(100) not null
);

create table course(
    id serial primary key,
    title varchar(100) not null,
    course_code varchar(10) not null,
    --teacher_id int not null references teacher(id)
);
