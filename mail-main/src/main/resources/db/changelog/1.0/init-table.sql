CREATE SCHEMA IF NOT EXISTS main;

-- auto-generated definition
create table IF NOT EXISTS main.attribute
(
    id          integer generated always as identity
        constraint attribute_pk
            primary key,
    name        varchar,
    description varchar,
    corel_key   integer
);

alter table main.attribute
    owner to postgres;
