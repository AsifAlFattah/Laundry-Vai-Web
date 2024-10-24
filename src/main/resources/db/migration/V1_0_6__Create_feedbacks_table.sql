
CREATE SEQUENCE feedback_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS feedbacks (
    id              INT8 PRIMARY KEY DEFAULT nextval('feedback_id_seq'),
    user_id         INT8 NOT NULL,
    order_id        INT8 NOT NULL,
    rating          FLOAT NOT NULL,
    comments        TEXT NOT NULL,
    created_at      TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE feedbacks
    ADD CONSTRAINT fk_user_id
        FOREIGN KEY (user_id)
            REFERENCES users (id);

ALTER TABLE feedbacks
    ADD CONSTRAINT fk_order_id
        FOREIGN KEY (order_id)
            REFERENCES orders (id);

