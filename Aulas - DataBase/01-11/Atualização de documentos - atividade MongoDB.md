## Atualização de documentos - atividade MongoDB:

#### Atualização 1:

---------------

* Renomear o campo da cliente Andréia Cardoso:

  * produto_3  ➜  produto_4

    ​

{

```
"_id" : ObjectId("6182fdeb3b3f04ddd3847cd9"),
"funcionaria" : {
    "nome" : "Fernanda Silva",
    "codigo" : 2
},
"cliente" : {
    "nome" : "Andréia Cardoso",
    "cpf" : "258369147-25",
    "telefone" : "(51) 98945-2365",
    "endereco" : "Rua Vinte e Um, 301"
},
"produto_1" : {
    "nome" : "Paleta de sombras",
    "codigo" : 115,
    "descricao" : "Paleta de cores nudes e brilhantes",
    "quantidade" : 1,
    "valor_unitario" : 72.8
},
"produto_2" : {
    "nome" : "Iluminador",
    "codigo" : 68,
    "descricao" : "Iluminador em pó",
    "quantidade" : 1,
    "valor_unitario" : 29.8
},
"produto_3" : {
    "nome" : "Corretivo",
    "codigo" : 33,
    "descricao" : "Corretivo em bastão de tom 3",
    "quantidade" : 1,
    "valor_unitario" : 25.9
},
"produto_3" : {
    "nome" : "Pó compacto",
    "codigo" : 40,
    "descricao" : "Pó compacto translucido",
    "quantidade" : 1,
    "valor_unitario" : 35.49
},
"pagamento" : {
    "valor_total" : 163.99,
    "metodo" : "dinheiro",
    "valor_pago" : 165.0,
    "troco" : 1.01
},
"data" : "ISODate('2021-11-03 16:30:00.000Z')"
```

}



* **Comando:**

  ​

> `db.getCollection('Vendas').update({_id : ObjectId("6182fdeb3b3f04ddd3847cd9")}, {$rename: {"produto_3" : "produto_4"}})`



{

    "_id" : ObjectId("6182fdeb3b3f04ddd3847cd9"),
    "funcionaria" : {
        "nome" : "Fernanda Silva",
        "codigo" : 2
    },
    "cliente" : {
        "nome" : "Andréia Cardoso",
        "cpf" : "258369147-25",
        "telefone" : "(51) 98945-2365",
        "endereco" : "Rua Vinte e Um, 301"
    },
    "produto_1" : {
        "nome" : "Paleta de sombras",
        "codigo" : 115,
        "descricao" : "Paleta de cores nudes e brilhantes",
        "quantidade" : 1,
        "valor_unitario" : 72.8
    },
    "produto_2" : {
        "nome" : "Iluminador",
        "codigo" : 68,
        "descricao" : "Iluminador em pó",
        "quantidade" : 1,
        "valor_unitario" : 29.8
    },
    "produto_3" : {
        "nome" : "Pó compacto",
        "codigo" : 40,
        "descricao" : "Pó compacto translucido",
        "quantidade" : 1,
        "valor_unitario" : 35.49
    },
    "pagamento" : {
        "valor_total" : 163.99,
        "metodo" : "dinheiro",
        "valor_pago" : 165.0,
        "troco" : 1.01
    },
    "data" : "ISODate('2021-11-03 16:30:00.000Z')",
    "produto_4" : {
        "nome" : "Corretivo",
        "codigo" : 33,
        "descricao" : "Corretivo em bastão de tom 3",
        "quantidade" : 1,
        "valor_unitario" : 25.9
    }
}



#### Atualização 2:

------------

* Atualizar o telefone da cliente Jenifer Souza:

  * "telefone" : "(51) 98459-3589"  ➜   "telefone" : "(51) 77777-7777"

    ​

{

    "_id" : ObjectId("6182fa5b3b3f04ddd3847c85"),
    "funcionaria" : {
        "nome" : "Fernanda Silva",
        "codigo" : 2
    },
    "cliente" : {
        "nome" : "Jenifer Souza",
        "cpf" : "987654321-11",
        "telefone" : "(51) 98459-3589",
        "endereco" : "Rua Santa Isabel, 259"
    },
    "produto_1" : {
        "nome" : "Água micelar",
        "codigo" : 101,
        "descricao" : "Água micelar 7 em 1",
        "quantidade" : 2,
        "valor_unitario" : 15.5
    },
    "produto_2" : {
        "nome" : "Rímel",
        "codigo" : 30,
        "descricao" : "Rímel com aplicador alongador",
        "quantidade" : 1,
        "valor_unitario" : 39.8
    },
    "pagamento" : {
        "valor_total" : 70.8,
        "metodo" : "pix",
        "valor_pago" : 70.8
    },
    "data" : "ISODate('2021-11-03 14:25:00.000Z')"
}

* **Comando:**

  ​

> `db.getCollection('Vendas').update({_id : ObjectId("6182fa5b3b3f04ddd3847c85")}, {$set: {"cliente.telefone" : "(51) 77777-7777"}})`



{

    "_id" : ObjectId("6182fa5b3b3f04ddd3847c85"),
    "funcionaria" : {
        "nome" : "Fernanda Silva",
        "codigo" : 2
    },
    "cliente" : {
        "nome" : "Jenifer Souza",
        "cpf" : "987654321-11",
        "telefone" : "(51) 77777-7777",
        "endereco" : "Rua Santa Isabel, 259"
    },
    "produto_1" : {
        "nome" : "Água micelar",
        "codigo" : 101,
        "descricao" : "Água micelar 7 em 1",
        "quantidade" : 2,
        "valor_unitario" : 15.5
    },
    "produto_2" : {
        "nome" : "Rímel",
        "codigo" : 30,
        "descricao" : "Rímel com aplicador alongador",
        "quantidade" : 1,
        "valor_unitario" : 39.8
    },
    "pagamento" : {
        "valor_total" : 70.8,
        "metodo" : "pix",
        "valor_pago" : 70.8
    },
    "data" : "ISODate('2021-11-03 14:25:00.000Z')",
    "telefone" : "(51) 77777-7777"
}



#### Atualização 3:

--------

* Remover o produto_4 da cliente Ana Clara:

  ​

{

    "_id" : ObjectId("6182fb5a3b3f04ddd3847c9d"),
    "funcionaria" : {
        "nome" : "Júlia Borges",
        "codigo" : 1
    },
    "cliente" : {
        "nome" : "Ana Clara",
        "cpf" : "256348195-25",
        "telefone" : "(51) 98456-1548",
        "endereco" : "Rua São José, 15"
    },
    "produto_1" : {
        "nome" : "Batom",
        "codigo" : 58,
        "descricao" : "Batom cor rosa escuro",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_2" : {
        "nome" : "Batom",
        "codigo" : 50,
        "descricao" : "Batom cor vermelho escuro",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_3" : {
        "nome" : "Batom",
        "codigo" : 53,
        "descricao" : "Batom cor bordô",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_4" : {
        "nome" : "Batom",
        "codigo" : 46,
        "descricao" : "Batom cor nude escuro",
        "quantidade" : 2,
        "valor_unitario" : 22.9
    },
    "pagamento" : {
        "valor_total" : 102.0,
        "metodo" : "cartão de crédito",
        "quantidade_parcela" : 2,
        "valor_parcela" : 51.0
    },
    "data" : "ISODate('2021-11-03 15:15:00.000Z')"
}



* **Comando:**

  ​

> `db.getCollection('Vendas').update({_id : ObjectId("6182fb5a3b3f04ddd3847c9d")}, {$unset: {"produto_4" : "produto_4"}})`



{

    "_id" : ObjectId("6182fb5a3b3f04ddd3847c9d"),
    "funcionaria" : {
        "nome" : "Júlia Borges",
        "codigo" : 1
    },
    "cliente" : {
        "nome" : "Ana Clara",
        "cpf" : "256348195-25",
        "telefone" : "(51) 98456-1548",
        "endereco" : "Rua São José, 15"
    },
    "produto_1" : {
        "nome" : "Batom",
        "codigo" : 58,
        "descricao" : "Batom cor rosa escuro",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_2" : {
        "nome" : "Batom",
        "codigo" : 50,
        "descricao" : "Batom cor vermelho escuro",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_3" : {
        "nome" : "Batom",
        "codigo" : 53,
        "descricao" : "Batom cor bordô",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "pagamento" : {
        "valor_total" : 102.0,
        "metodo" : "cartão de crédito",
        "quantidade_parcela" : 2,
        "valor_parcela" : 51.0
    },
    "data" : "ISODate('2021-11-03 15:15:00.000Z')"
}

* Atualizar os campos da mesma cliente:

  * valor_total: 102.00  ➜  79.1 (102.00 - 22.9)

  * valor_parcela: 51.00  ➜  39.55

    ​

> `db.getCollection('Vendas').update({_id : ObjectId("6182fb5a3b3f04ddd3847c9d")}, {$set: {"pagamento.valor_total" : 79.10, "pagamento.valor_parcela" : 39.55}})`



{

    "_id" : ObjectId("6182fb5a3b3f04ddd3847c9d"),
    "funcionaria" : {
        "nome" : "Júlia Borges",
        "codigo" : 1
    },
    "cliente" : {
        "nome" : "Ana Clara",
        "cpf" : "256348195-25",
        "telefone" : "(51) 98456-1548",
        "endereco" : "Rua São José, 15"
    },
    "produto_1" : {
        "nome" : "Batom",
        "codigo" : 58,
        "descricao" : "Batom cor rosa escuro",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_2" : {
        "nome" : "Batom",
        "codigo" : 50,
        "descricao" : "Batom cor vermelho escuro",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_3" : {
        "nome" : "Batom",
        "codigo" : 53,
        "descricao" : "Batom cor bordô",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "pagamento" : {
        "valor_total" : 79.1,
        "metodo" : "cartão de crédito",
        "quantidade_parcela" : 2,
        "valor_parcela" : 39.55
    },
    "data" : "ISODate('2021-11-03 15:15:00.000Z')"
}