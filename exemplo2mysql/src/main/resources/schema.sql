drop table if exists cliente;

create table cliente (
    id_cliente BIGINT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(225) NULL,
    renda DOUBLE NULL,
    PRIMARY KEY (id_cliente));
