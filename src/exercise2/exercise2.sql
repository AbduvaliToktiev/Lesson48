create table "Lesson49".cars(
                                id serial unique primary key,
                                auto_number varchar not null
);

create table "Lesson49".cars_information(
                                            id serial unique,
                                            cars_id int references "Lesson49".cars(id),
                                            year_of_issue int not null,
                                            model varchar not null,
                                            price int not null,
                                            color varchar not null
);

insert into "Lesson49".cars(auto_number) values ('7767 SSS');
insert into "Lesson49".cars(auto_number) values ('01 806 ASD');
insert into "Lesson49".cars(auto_number) values ('2000 AD');
insert into "Lesson49".cars(auto_number) values ('08 208 AB');
insert into "Lesson49".cars(auto_number) values ('J 5697 AR');

insert into "Lesson49".cars_information(cars_id, year_of_issue, model, price, color) values (1, 2008, 'Land Cruiser', 20000, 'Black');
insert into "Lesson49".cars_information(cars_id, year_of_issue, model, price, color) values (2, 2012, 'E 500', 23000, 'Black');
insert into "Lesson49".cars_information(cars_id, year_of_issue, model, price, color) values (3, 2020, 'Ravon', 18000, 'White');
insert into "Lesson49".cars_information(cars_id, year_of_issue, model, price, color) values (4, 2020, 'Camry 70', 40000, 'White');
insert into "Lesson49".cars_information(cars_id, year_of_issue, model, price, color) values (5, 2008, 'M 4', 12000, 'Grey');
insert into "Lesson49".cars_information(cars_id, year_of_issue, model, price, color) values (4, 2011, 'Camry 2.4', 14000, 'Brown');
insert into "Lesson49".cars_information(cars_id, year_of_issue, model, price, color) values (2, 2015, 'Brabus', 25000, 'Black');


select ci.id, * from "Lesson49".cars c
                         inner join "Lesson49".cars_information ci on c.id = ci.cars_id;
