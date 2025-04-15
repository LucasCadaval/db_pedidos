CREATE TABLE clients (
     id BIGINT PRIMARY KEY AUTO_INCREMENT,
     name VARCHAR(100) NOT NULL,
     date_of_birth DATE NOT NULL,
     email VARCHAR(50) NOT NULL,
     cep VARCHAR(9) NOT NULL,
     address VARCHAR(100) NOT NULL
);