drop table if exists cards;

create table card (
   id identity primary key,
   title varchar(30),
   description varchar(256)
 );
