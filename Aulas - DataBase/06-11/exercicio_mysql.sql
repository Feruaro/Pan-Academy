/* Criar uma tabela de Estados com:
 - id, --> Id deve ser a PK - OK
 - nome, --> nome campo único - OK
 - sigla(utilizar ENUM), - OK
 - região utilizar ENUM (), - OK
 - população.
 */

use panacademy;

create table estados_brasileiros (
	id int unsigned not null auto_increment,
    nome varchar(50),
    sigla enum("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RR", "RO", "RJ", "RN", "RS", "SC", "SP", "SE", "TO") not null,
    regiao enum("Norte", "Nordeste", "Centro-Oeste", "Sudeste", "Sul") not null,
    populacao double,
    
    unique key (nome),
    primary key (id)
);

select * from estados_brasileiros;

/* 
- Inserir 10 estados (dois de cada região)
- Listar estados ordenando por sigla
- Encontrar a população total de cada região
- Encontrar a média da população por região 
- Agrupar estados por região
*/

-- Inserir 10 estados (dois de cada região)

insert into 
	estados_brasileiros (nome, sigla, regiao, populacao) 
values 
	("Rio Grande do Sul", "RS", "Sul", 11290000),
    ("Santa Catarina", "SC", "Sul", 7165000),
    ("São Paulo", "SP", "Sudeste", 44040000),
    ("Rio de Janeiro", "RJ", "Sudeste", 6748000),
    ("Mato Grosso", "MT", "Centro-Oeste", 3224000),
    ("Mato Grosso do Sul", "MS", "Centro-Oeste", 2620000),
    ("Amazonas", "AM", "Norte", 3874000),
    ("Acre", "AC", "Norte", 790101),
    ("Alagoas", "AL", "Nordeste", 3322000),
    ("Pernambuco", "PE", "Nordeste", 9278000);
    
-- Listar estados ordenando por sigla
    
select nome, sigla
from estados_brasileiros
order by sigla;

-- Encontrar a população total de cada região
 
select 
	regiao, sum(populacao) as total_populacao_regiao
from estados_brasileiros
group by regiao;

-- Encontrar a média da população por região 

select 
	regiao, avg(populacao) as total_populacao_regiao
from estados_brasileiros
group by regiao;

-- Agrupar estados por região

select 
	regiao, group_concat("  ", nome) as nomes_estados
from estados_brasileiros
group by regiao;



