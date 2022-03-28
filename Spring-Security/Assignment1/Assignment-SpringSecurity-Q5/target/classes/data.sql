Insert into users(username, password, enabled) values('user','pass','true');
Insert into users(username, password, enabled) values('admin','pass','true');


Insert into authorities(username, authority) values('user','ROLE_USER');
Insert into authorities(username, authority) values('admin','ROLE_ADMIN');
