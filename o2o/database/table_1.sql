use o2o;
create table tb_area (
area_id int(2) NOT NULL AUTO_INCREMENT,
area_name varchar(200) not null,
priority int(2) not null default 0,
create_time datetime DEFAULT NULL,
last_edit_time datetime default null,
primary key(area_id),
unique key UK_AREA(area_name)
) engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;