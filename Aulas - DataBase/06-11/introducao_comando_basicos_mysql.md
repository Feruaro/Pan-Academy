## Introdução ao MySQL:

* criar schema

`create schema panacademy;`

* indicar qual schema queremos usar

`use panacademy;`

* criar tabelas

create table categoria_filmes (
	id int unsigned not null auto_increment,
	nome varchar(50),
	classificacao enum('0', '12', '16', '18') not null,
	
	unique key(nome),
	primary key (id)
);

* inserir dados na tabela

`insert into categoria_filmes (nome, classificacao) values ("Ação", "12");`
insert into 
	categoria_filmes (nome, classificacao) 
values 
	("Infantil", "0"),
	("Fic. Científica", "12"),
	("Aventura", "0"),
	("Comédia", "12"),
	("Terror", "18");

* selecionar dados na tabela   

`select * from categoria_filmes;`

`select NOME from categoria_filmes;`

`select nome as "Nome da Categoria" from categoria_filmes;`   //apelido para coluna

`select * from categorias_filmes where classificacao = '12';`

`select id, concat(nome, " ", classificacao) as nome_classificacao from categorias_filmes;`

`delete from categorias_filmes where id = 100;`

`select sum(id) as total from categorias_filmes;`     // sum = somar 

`select avg(id) as total from categorias_filmes;`     // avg = média

`select * from categorias_filmes order by id desc;`

`select count(*), classificacao, nome from categorias_filmes group by classificacao order by nome ;`

`select count(*), classificacao, group_concat("  ", nome) from categorias_filmes group by classificacao order by nome;`
* renomear nome tabela 

`rename table categoria_filmes to categorias_filmes;`

* deletar tabela

`drop table categorias_filmes;`



