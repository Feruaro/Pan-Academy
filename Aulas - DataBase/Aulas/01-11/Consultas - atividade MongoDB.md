## Consultas - atividade MongoDB:

#### Consulta com projeção:

---------

* **Consultar o valor total de todos os objetos:**

  ​

> `db.getCollection('Vendas').find({}, {"pagamento.valor_total" : 1, _id : 1})`



![consulta com projeção](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\consulta_projeção_1.jpg)



* **Consultar a data de todos os objetos:**

  ​

> `db.getCollection('Vendas').find({}, {"data" : 1, _id : 0})`



![consulta com projeção](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\consulta_projeção_2.jpg)



####Consulta utilizando combinação entre os seletores:

----------

* **Consultar vendas da funcionária "Fernanda Silva" e de valor total maior ou igual a R$ 100,00:** 

  ​

> `db.getCollection('Vendas').find({ "funcionaria.nome" : "Fernanda Silva" , "pagamento.valor_total" : {$gte : 100} })`



![consultas utilizando and](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\consulta_and.jpg)



* **Consultar vendas de cartão de crédito e em 1x ou parcelado e mais de 1x:**

  ​

> `db.getCollection('Vendas').find({ $or: [{"pagamento.metodo" : "cartão de crédito" , "pagamento.quantidade_parcelas" : 1}, {"pagamento.metodo" : "cartão de crédito" , "pagamento.quantidade_parcelas" : {$gt : 1}} ]})`



![consultas utilizando and](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\consulta_or_e_and.jpg)



#### Consulta paginada e ordenada (utilizar ignorar , limitar e classificar ):

---------

* **Ignorar / pular 2 registros:**

  ​

> `db.getCollection('Vendas').find({}).skip(2)`



![consulta com projeção](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\consulta_limit.jpg)



* **Limitar a no máximo 3 consultas:**

  ​

> `db.getCollection('Vendas').find({}).limit(3)`



![consulta com projeção](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\consulta_skip.jpg)



* **Classificar / ordenar pela data da venda da primeira para a última:**

  ​

> `db.getCollection('Vendas').find({}).sort({"data" : 1})`



* **Classificar / ordenar pelo nome da funcionária de A-Z:**

  ​

> `db.getCollection('Vendas').find({}).sort({"data" : 1})`



![consulta com projeção](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\consulta_ordenar.jpg)



----------

