show databases;
create database if not exists SmartSpeaker;
use SmartSpeaker;
show tables;
create table if not exists reservation(date date, name varchar(20), role varchar(20));
desc reservation;
insert into reservation values(20201025, 'walter', 'TM');
select * from reservation;
create table if not exists user(id int AUTO_INCREMENT primary key, username varchar(20), name varchar(50), org_ID varchar(20), role_ID varchar(20), email varchar(50), wechat varchar(20));
desc user;
select * from user;