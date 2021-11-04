

## Consultas - atividade MongoDB:



### Consulta com projeção:

--------

* Consultar o "valor_total" de todos os documentos e mostrar os "_id":

  ​

> `db.getCollection('Vendas').find({}, {"pagamento.valor_total" : 1, "_id": 1})`
>

![consulta com projeção - valor total](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_projecao_1.jpg)

* Consultar o método de pagamento de cada venda e sem mostrar os "_id":

  ​

> `db.getCollection('Vendas').find({}, {"pagamento.metodo" : 1, "_id": 0})`

![consulta com projeção - metodo de pagamento](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_projecao_2.jpg)

### Consulta utilizando combinação entre os seletores:

----

* Consultar vendas da funcionaria "Fernanda Silva" e na data de "2021-11-03":

  ​


>  `db.getCollection('Vendas').find({"funcionaria.nome" : "Fernanda Silva", "data" : {$lte : "ISODate('2021-11-03 18:30:00.000Z')"}})`

![consulta combinação and](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_and.jpg)

* Consultar vendas com o método "dinheiro" ou "pix":

  ​

> `db.getCollection('Vendas').find({$or : [{"pagamento.metodo" : "dinheiro"}, {"pagamento.metodo" : "pix"}] })`

![consulta combinação or](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_or.jpg)


### Consulta paginada e ordenada:

--------------

* **Ignorar / pular 2 documentos:**

  ​

> `db.getCollection('Vendas').find({}).skip(2)`
>

![consulta ignorando 2 documentos](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_skip.jpg)

* **Limitar até no máximo 3 documentos:**

  ​

> `db.getCollection('Vendas').find({}).limit(3)`
>

![consulta limitando até 3 documentos](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_limit.jpg)

* **Classificar / ordenar em ordem alfabética (A - Z) as funcionárias :**

  ​

> `db.getCollection('Vendas').find().sort({"funcionaria.nome" : 1})`

![consulta com ordenação - funcionárias](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_ordenacao_func.jpg)

* **Classificar / ordenar em ordem alfabética (A - Z) as clientes :**

  ​

> `db.getCollection('Vendas').find().sort({"cliente.nome" : 1})`

![consulta com ordenação - clientes](https://github.com/Feruaro/Pan-Academy/blob/main/Aulas%20-%20DataBase/01-11/imagens/consulta_ordenacao_cliente.jpg)



-----------

