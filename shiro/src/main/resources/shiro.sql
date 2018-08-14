<<<<<<< HEAD
/*==============================================================*/
/* DBMS name:      MySQL 5.0      hello                              */
/* Created on:     2018-7-28 09:41:48                           */
/*==============================================================*/


drop table if exists department;

drop table if exists func;

drop table if exists menu;

drop table if exists menu_func;

drop table if exists role_menu;

drop table if exists t_role;

drop table if exists user_menu;

drop table if exists user_role;

drop table if exists user_t;

/*==============================================================*/
/* Table: department                                            */
/*==============================================================*/
create table department
(
   department_id        bigint not null auto_increment,
   department_name      varchar(50),
   department_rank      smallint,
   parent_id            bigint,
   create_at            date,
   create_user          bigint,
   update_at            date,
   is_deleted           tinyint,
   primary key (department_id)
);

/*==============================================================*/
/* Table: func                                                  */
/*==============================================================*/
create table func
(
   func_id              bigint not null auto_increment,
   func_name            varchar(50),
   func_code            varchar(50),
   func_url             varchar(80),
   parent_id            bigint,
   is_deleted           tinyint,
   primary key (func_id)
);

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   menu_id              bigint not null auto_increment,
   menu_name            varchar(50),
   menu_url             varchar(100),
   parent_id            bigint,
   is_open              tinyint,
   primary key (menu_id)
);

/*==============================================================*/
/* Table: menu_func                                             */
/*==============================================================*/
create table menu_func
(
   menu_id              bigint,
   func_id              bigint
);

/*==============================================================*/
/* Table: role_menu                                             */
/*==============================================================*/
create table role_menu
(
   role_id              bigint,
   menu_id              bigint
);

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role
(
   role_id              bigint not null auto_increment,
   role_name            varchar(50),
   role_rank            tinyint,
   is_open              tinyint,
   primary key (role_id)
);

/*==============================================================*/
/* Table: user_menu                                             */
/*==============================================================*/
create table user_menu
(
   user_id              bigint,
   menu_id              bigint
);

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   user_id              bigint,
   role_id              bigint
);

/*==============================================================*/
/* Table: user_t                                                */
/*==============================================================*/
create table user_t
(
   user_id              bigint not null auto_increment,
   department_id        bigint,
   user_name            varchar(30),
   real_name            varchar(20),
   user_password        varchar(100),
   user_phone           varchar(20),
   user_remark          varchar(100),
   user_status          varchar(10),
   create_user          bigint,
   create_at            date,
   update_at            date,
   is_deleted           tinyint,
   primary key (user_id)
);

alter table menu_func add constraint FK_Reference_11 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table menu_func add constraint FK_Reference_12 foreign key (func_id)
      references func (func_id) on delete restrict on update restrict;

alter table role_menu add constraint FK_Reference_5 foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;

alter table role_menu add constraint FK_Reference_6 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table user_menu add constraint FK_Reference_8 foreign key (user_id)
      references user_t (user_id) on delete restrict on update restrict;

alter table user_menu add constraint FK_Reference_9 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_3 foreign key (user_id)
      references user_t (user_id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_4 foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;

alter table user_t add constraint FK_Reference_18 foreign key (department_id)
      references department (department_id) on delete restrict on update restrict;

=======
/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018-7-28 09:41:48                           */
/*==============================================================*/


drop table if exists department;

drop table if exists func;

drop table if exists menu;

drop table if exists menu_func;

drop table if exists role_menu;

drop table if exists t_role;

drop table if exists user_menu;

drop table if exists user_role;

drop table if exists user_t;

/*==============================================================*/
/* Table: department                                            */
/*==============================================================*/
create table department
(
   department_id        bigint not null auto_increment,
   department_name      varchar(50),
   department_rank      smallint,
   parent_id            bigint,
   create_at            date,
   create_user          bigint,
   update_at            date,
   is_deleted           tinyint,
   primary key (department_id)
);

/*==============================================================*/
/* Table: func                                                  */
/*==============================================================*/
create table func
(
   func_id              bigint not null auto_increment,
   func_name            varchar(50),
   func_code            varchar(50),
   func_url             varchar(80),
   parent_id            bigint,
   is_deleted           tinyint,
   primary key (func_id)
);

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   menu_id              bigint not null auto_increment,
   menu_name            varchar(50),
   menu_url             varchar(100),
   parent_id            bigint,
   is_open              tinyint,
   primary key (menu_id)
);

/*==============================================================*/
/* Table: menu_func                                             */
/*==============================================================*/
create table menu_func
(
   menu_id              bigint,
   func_id              bigint
);

/*==============================================================*/
/* Table: role_menu                                             */
/*==============================================================*/
create table role_menu
(
   role_id              bigint,
   menu_id              bigint
);

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role
(
   role_id              bigint not null auto_increment,
   role_name            varchar(50),
   role_rank            tinyint,
   is_open              tinyint,
   primary key (role_id)
);

/*==============================================================*/
/* Table: user_menu                                             */
/*==============================================================*/
create table user_menu
(
   user_id              bigint,
   menu_id              bigint
);

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   user_id              bigint,
   role_id              bigint
);

/*==============================================================*/
/* Table: user_t                                                */
/*==============================================================*/
create table user_t
(
   user_id              bigint not null auto_increment,
   department_id        bigint,
   user_name            varchar(30),
   real_name            varchar(20),
   user_password        varchar(100),
   user_phone           varchar(20),
   user_remark          varchar(100),
   user_status          varchar(10),
   create_user          bigint,
   create_at            date,
   update_at            date,
   is_deleted           tinyint,
   primary key (user_id)
);

alter table menu_func add constraint FK_Reference_11 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table menu_func add constraint FK_Reference_12 foreign key (func_id)
      references func (func_id) on delete restrict on update restrict;

alter table role_menu add constraint FK_Reference_5 foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;

alter table role_menu add constraint FK_Reference_6 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table user_menu add constraint FK_Reference_8 foreign key (user_id)
      references user_t (user_id) on delete restrict on update restrict;

alter table user_menu add constraint FK_Reference_9 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_3 foreign key (user_id)
      references user_t (user_id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_4 foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;

alter table user_t add constraint FK_Reference_18 foreign key (department_id)
      references department (department_id) on delete restrict on update restrict;

>>>>>>> origin/master
