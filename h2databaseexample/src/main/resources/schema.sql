drop table if exists funcionario;
drop table if exists clientes;

create table funcionario(
    id_funcionario bigint auto_increment,
    nome varchar(100) not null,
    salario double not null,
    rg int not null,
    primary key(id_funcionario));

create table clientes(
    id_clientes bigint auto_increment,
    nome varchar(100) not null,
    data_de_nascimento varchar(10) not null,
    rg int not null,
    cpf int not null,
    primary key(id_clientes));