CREATE TABLE products (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    id_brand BIGINT NOT NULL,
    name VARCHAR (100) NOT NULL,
    price NUMERIC NOT NULL ,
    STOCK INTEGER NOT NULL ,
    FOREIGN KEY (id_brand) REFERENCES brands(id)
);