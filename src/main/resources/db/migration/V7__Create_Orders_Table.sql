CREATE TABLE orders (
    id BIGINT PRIMARY KEY,
    id_client BIGINT NOT NULL,
    created_at TIMESTAMP DEFAULT LOCALTIMESTAMP NOT NULL,
    total_value NUMERIC NOT NULL,
    FOREIGN KEY (id_client) REFERENCES clients(id)
)