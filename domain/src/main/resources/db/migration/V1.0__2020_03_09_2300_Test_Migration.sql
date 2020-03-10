create table hibernate_sequence (next_val bigint);
insert into hibernate_sequence values ( 1 );
create table test (id integer not null, primary key (id));
