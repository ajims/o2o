create table tb_product_category(
product_category_id int(11) not null auto_increment,
product_category_name varchar(100) not null,
priority int(2) default 0,
create_time datetime default null,
shop_id int(20) not null default 0,
primary key(product_category_id),
 constraint fk_procate_shop foreign key(shop_id) references tb_shop(shop_id)
)engine=InnoDB auto_increment =1 default charset =utf8