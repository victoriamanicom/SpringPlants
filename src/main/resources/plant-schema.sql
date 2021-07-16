drop table if exists plant CASCADE;

create table plant
(
	id integer PRIMARY KEY AUTO_INCREMENT, 
	is_succulent boolean not null, 
	leaf_colour varchar(255), 
	plant_name varchar(255), 
	pot_size integer not null
);