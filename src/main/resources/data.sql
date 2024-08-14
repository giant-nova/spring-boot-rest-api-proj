insert into user_details(id, birth_date, name)
values(10001, current_date(), 'Thomas');

insert into user_details(id, birth_date, name)
values(10002, current_date(), 'Grace');

insert into user_details(id, birth_date, name)
values(10003, current_date(), 'Polly');

insert into user_details(id, birth_date, name)
values(10004, current_date(), 'Arthur');

insert into post(id, description, user_id)
values(20001, 'Learn AWS', 10001);
insert into post(id, description, user_id)
values(20002, 'Learn SpringBoot', 10001);
insert into post(id, description, user_id)
values(20003, 'Learn Google Cloud', 10002);
insert into post(id, description, user_id)
values(20004, 'Learn Unity', 10002);