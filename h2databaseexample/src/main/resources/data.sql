insert into funcionario(id_funcionario, nome, salario, rg)
    values(null, 'Eduardo Gladzik', 2000.50, 123123123);

insert into funcionario(id_funcionario, nome, salario, rg)
    values(null, 'Julia Silva', 2000.50, 123123123);

insert into clientes(id_clientes, nome, data_de_nascimento, rg, cpf)
    values(null, 'Gladzik Eduardo', '2004/01/31', 123123123, 123321123);

insert into clientes(id_clientes, nome, data_de_nascimento, rg, cpf)
    values(null, 'Silva Julia', '2003/10/24', 123123123, 123321123);

update funcionario set salario = 3000.50 where id_funcionario = 1;