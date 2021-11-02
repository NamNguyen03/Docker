use master

create database docker_mydb_1

go

use docker_mydb_1

go

create table users(
	id int identity(1,1) primary key,
	[name] nvarchar(max),
	birth_year int
)

insert users( [name], birth_year)
values ('Nam', 1999), (N'Toản', 1991), (N'Tèo', 2005), ('Jonh',1988)

