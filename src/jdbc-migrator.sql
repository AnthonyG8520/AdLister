CREATE DATABASE IF NOT EXISTS adlister_db;

CREATE TABLE users(
    id int unsigned NOT NULL AUTO_INCREMENT,
    username varchar(20) DEFAULT NULL,
    email varchar(30) DEFAULT NULL,
    password varchar(15) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE ads(
    id INT UNSIGNED AUTO_INCREMENT,
    user_id INT UNSIGNED,
    title VARCHAR(40), description TEXT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);