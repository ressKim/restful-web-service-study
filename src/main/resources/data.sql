insert into user values (90001, sysdate(), 'user1', 'test', '123456-1111111');
insert into user values (90002, sysdate(), 'user2', 'test', '223456-1111111');
insert into user values (90003, sysdate(), 'user3', 'test', '323456-1111111');

insert into post
values (10001, 'my first post', 90001);
insert into post
values (10002, 'my first post', 90001);
