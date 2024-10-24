
CREATE SEQUENCE order_service_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS order_service (
    id              INT8 PRIMARY KEY DEFAULT nextval('order_service_id_seq'),
    order_id        INT8 NOT NULL,
    service_id      INT8 NOT NULL,
    quantity        INT NOT NULL,
    price           DECIMAL(10, 2) NOT NULL
);

ALTER TABLE order_service
    ADD CONSTRAINT fk_order_id
        FOREIGN KEY (order_id)
            REFERENCES orders (id);

ALTER TABLE order_service
    ADD CONSTRAINT fk_service_id
        FOREIGN KEY (service_id)
            REFERENCES services (id);

