create database eurovision

-- Country Table
create table country (
	id smallserial primary key,
	code varchar(2) not null unique,
	name text not null unique 
)

-- Participant Table
create table participant (
	id serial primary key,
	country_id smallserial, 
	name text not null,
	song text not null,
	year smallint not null, 
	song_link text,
	language text,
	
	foreign key (country_id) references country(id)
)

-- Gala Table
create type gala_type as enum ('Semifinal', 'Final')

create table gala (
	id serial primary key,
	type gala_type not null, 
	date date not null
)

-- galaParticipant Table (relation)
create table galaParticipant (
	id serial primary key,
	gala_id serial, 
	participant_id serial, 
	points int,
	performanceOrder int,

	foreign key (gala_id) references gala(id),
	foreign key (participant_id) references participant(id)
)

-- User table 
create table user_ (
	id serial primary key, 
	name varchar(20) -- unique
)

-- Vote table
create table vote (
	id serial primary key, 
	participant_id serial not null,
	user_id serial not null,
	item_order int, 
	gala_id int, 
	date_vote timestamp,
	
	foreign key (participant_id) references participant(id),
	foreign key (user_id) references user_(id), 
	foreign key (gala_id) references gala(id)
)

-- User Favorites table
create table user_favorites (
	id serial primary key, 
	user_name varchar(20) unique, 
	user_country varchar (20)
)

-- Favorites table 
create table favorites (
	id serial primary key, 
	participant_id serial not null,
	user_id serial not null,
	
	foreign key (participant_id) references participant (id),
	foreign key (user_id) references user_favorites(id)

)



