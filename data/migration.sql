create database if not exists registration;
use registration;

create table if not exists person(
    id bigint not null auto_increment,
    name varchar(255) not null,
    surname varchar(255) not null,

    primary key(id)
);
