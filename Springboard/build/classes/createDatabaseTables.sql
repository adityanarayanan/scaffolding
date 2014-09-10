create table if not exists appusers (
	id bigint(10) not null auto_increment primary key,
	email varchar(50) not null,
	password varchar(50) not null
) engine=innodb;

create table if not exists devices (
	id bigint(10) not null auto_increment primary key,
	unique_id varchar(50) not null,
	type varchar(50) not null,
	owner_id bigint(10) not null,
	foreign key (owner_id) references appusers(id) on delete cascade on update cascade
) engine=innodb;

