delete from ITEM;
delete from USER_ROLES;
delete from USER;
delete from ROLES;

insert into item(item_uid, name, description, market,stock, price_tag, state) values (1, 'item 1', '', 'PT',20,30.0,'AVAILABLE');
insert into item(item_uid, name, description, market,stock, price_tag, state) values (2, 'item 2', '', 'PT',10,10.0,'AVAILABLE');
insert into item(item_uid, name, description, market,stock, price_tag, state) values (3, 'item 3', '', 'PT',100,5.0,'AVAILABLE');
insert into item(item_uid, name, description, market,stock, price_tag, state) values (4, 'item 4', '', 'PT',2,100.0,'AVAILABLE');
insert into item(item_uid, name, description, market,stock, price_tag, state) values (5, 'item 5', '', 'PT',20,2.5,'AVAILABLE');


insert into roles(id, name) VALUES(1,'ADMIN');
insert into roles(id, name) VALUES(2, 'CUSTOMER');
insert into roles(id, name) VALUES(3, 'MODERATOR');