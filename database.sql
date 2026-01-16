CREATE DATABASE reservationdb;
USE reservationdb;

CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

INSERT INTO users VALUES ('admin', 'admin123');

CREATE TABLE reservations (
    pnr INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    train_no VARCHAR(10),
    train_name VARCHAR(50),
    class_type VARCHAR(20),
    journey_date VARCHAR(20),
    source VARCHAR(30),
    destination VARCHAR(30)
);
