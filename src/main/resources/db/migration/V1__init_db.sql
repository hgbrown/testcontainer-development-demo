CREATE SEQUENCE IF NOT EXISTS person_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE person
(
    id   BIGINT DEFAULT nextval('person_id_seq') NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT pk_person PRIMARY KEY (id)
);

INSERT INTO person (name) VALUES
('Amanda'),
('Bob'),
('Cindy')
;
