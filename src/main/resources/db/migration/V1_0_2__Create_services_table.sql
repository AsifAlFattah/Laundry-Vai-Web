
CREATE SEQUENCE service_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS services (
    id              INT8 PRIMARY KEY DEFAULT nextval('service_id_seq'),
    name            VARCHAR(255) NOT NULL,
    description     TEXT,
    price           DECIMAL(10, 2) NOT NULL,
    availability    BOOLEAN NOT NULL
);

