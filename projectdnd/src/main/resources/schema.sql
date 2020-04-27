drop table if exists clientes;
drop table if exists funcionario;
drop table if exists spells;

create table spells(
    id_spell bigint auto_increment not null,
    name varchar(100) not null,
    range int not null,
    duration varchar(100) not null,
    spell_level int not null,
    classes varchar(30) not null,
    casting varchar(50) not null,
    primary key(id_spell));