CREATE TABLE users(
    id SERIAL PRIMARY KEY,
    username VARCHAR(64) NOT NULL,
    password VARCHAR(256) NOT NULL,
    email VARCHAR(256) NOT NULL,
    role VARCHAR(16) NOT NULL
);