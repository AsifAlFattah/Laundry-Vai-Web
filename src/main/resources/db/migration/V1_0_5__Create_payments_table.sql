
CREATE SEQUENCE payment_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS payments (
    id              INT8 PRIMARY KEY DEFAULT nextval('payment_id_seq'),
    order_id        INT8 NOT NULL,
    amount          FLOAT NOT NULL,
    payment_status  VARCHAR(30) NOT NULL,
    payment_date    TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE payments
    ADD CONSTRAINT fk_order_id
        FOREIGN KEY (order_id)
            REFERENCES orders (id);

