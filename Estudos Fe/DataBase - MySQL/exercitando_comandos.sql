/* 
1) Criar uma tabela de dados no MySQL para clientes de uma empresa de telecomunicações.
Esses clientes devem ser gerenciados pelos campos de CPF, Nome, Data de Nascimento,
Endereço, CEP, Bairro, Cidade e UF
*/

create schema estudosfe;

use estudosfe;

create table clientes_enderecos ( 
	id int unsigned not null auto_increment primary key,
    endereco varchar(50),
    cep varchar(8),
    bairro varchar(20),
    cidade varchar(20),
    uf varchar(2)
);

create table clientes (
	id int unsigned not null auto_increment primary key,
    cpf varchar(11) not null unique key,
    nome varchar(50) not null,
    data_nascimento varchar(10) not null,
    id_endereco int unsigned not null,
	constraint fk_CliEnd foreign key (id_endereco) references clientes_enderecos (id)
);

-- 2) Após criar a tabela acima especificada adicionar um campo para armazenar a data da última compra;

alter table clientes add data_compra date;

-- 3) Inserir na tabela Clientes três clientes;

insert into 
	clientes_enderecos (endereco, cep, bairro, cidade, uf)
values
	("Rua Antônio Numes", "88045963", "Palmeiras", "Londrina", "PR"),
    ("Rua Palmeias Novas", "88078923", "Leblon", "Rio de Janeiro", "RJ"),
    ("Rua Palmeias Novas", "88048917", "Copacabana", "Rio de Janeiro", "RJ");

select * from clientes_enderecos;

insert into
	clientes (cpf, nome, data_nascimento, id_endereco)
values
	("04496332780", "João da Silva", "25/11/1969", 1),
    ("05485031490", "Ana Regina Fagundes", "21/09/1996", 2),
    ("03350314905", "Fernando Soares", "05/03/1990", 3);

select * from clientes;

-- 4) Selecionar todos os clientes que residam na cidade do Rio de Janeiro.

select nome
from clientes_enderecos, clientes
where cidade = "Rio de Janeiro";













