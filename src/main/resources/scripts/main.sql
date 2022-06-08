
 -- liquibase formatted sql

-- changeset sergei:1

CREATE TABLE userCat

(
    id            SERIAL PRIMARY KEY,
    chatId        INT,
    catsOwnerName TEXT,
    pet TEXT,
    date timestamp
);

CREATE TABLE userDog

(
    id            SERIAL PRIMARY KEY,
    chatId        INT,
    dogsOwnerName TEXT,
    pet TEXT,
    date timestamp
);
