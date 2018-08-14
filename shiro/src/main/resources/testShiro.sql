insert into user_t(user_name,user_password) values("test","123456");

insert into t_role(role_name,role_rank)values("管理者",1);

insert into user_role(user_id,role_id) values(1,1);

insert into menu(menu_name,menu_url) values("用户角色管理","");

insert into menu(menu_name,menu_url,parent_id) values("用户管理","/user.htm",1);

insert into func(func_name,func_code,func_url)values("添加用户","create","/users");

insert into menu_func(menu_id,func_id)values(2,1);

insert into role_menu(role_id,menu_id) values(1,1);

insert into role_menu(role_id,menu_id) values(1,2);