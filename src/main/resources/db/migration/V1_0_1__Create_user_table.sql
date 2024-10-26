
CREATE SEQUENCE user_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS users (
    id              INT8 PRIMARY KEY DEFAULT nextval('user_id_seq'),
    name            VARCHAR(255) NOT NULL,
    email           VARCHAR(255) NOT NULL UNIQUE,
    password        VARCHAR(255) NOT NULL,
    phone           VARCHAR(20),
    role            VARCHAR(30) NOT NULL,
    address         TEXT
);
