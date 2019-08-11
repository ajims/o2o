use o2o;
create table tb_wechat_auth (
 wechat_auth_id int(10) not null auto_increment,
 user_id int(10) not null,
 open_id varchar(1024) not null,
 create_time datetime default null,
 primary key (wechat_auth_id),
constraint fk_wechatauth_profile foreign key(user_id) references tb_person_info(user_id)
)engine=InnoDB auto_increment =1 default charset =utf8

