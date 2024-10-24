
CREATE SEQUENCE order_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS orders (
    id              INT8 PRIMARY KEY DEFAULT nextval('order_id_seq'),
    user_id         INT8 NOT NULL,
    order_status    VARCHAR(30) NOT NULL,
    total_price     FLOAT NOT NULL,
    created_at      TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at      TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE orders
    ADD CONSTRAINT fk_user_id
        FOREIGN KEY (user_id)
            REFERENCES users (id);


