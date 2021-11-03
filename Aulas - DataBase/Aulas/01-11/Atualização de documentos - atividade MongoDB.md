## Atualização de documentos - atividade MongoDB:

#### Atualização 1:

----------

* Renomear o nome do campo do Objet 5 : 

  * produto_3 (que está duplicado)  ➜  produto_4

    ​

{

```
"_id" : ObjectId("6182cb043b3f04ddd384772d"),
"funcionaria" : {
    "nome" : "Fernanda Silva",
    "codigo" : 2
},
"cliente" : {
    "nome" : "Maya",
    "cpf" : "523689452-56",
    "telefone" : "(51) 98456-5896",
    "endereco" : "Rua Treze, 147"
},
"produto_1" : {
    "nome" : "Cílios postiço",
    "codigo" : 94,
    "descricao" : "Cílios postiço número 3",
    "quantidade" : 3,
    "valor_unitario" : 15.5
},
"produto_2" : {
    "nome" : "Cola para cílios",
    "codigo" : 90,
    "descricao" : "Cola para cílios incolor",
    "quantidade" : 2,
    "valor_unitario" : 12.9
},
"produto_3" : {
    "nome" : "Rímel",
    "codigo" : 54,
    "descricao" : "Rímel com aplicador curvador",
    "quantidade" : 1,
    "valor_unitario" : 35.9
},
"produto_3" : {
    "nome" : "Delineador",
    "codigo" : 63,
    "descricao" : "Delineador preto em caneta",
    "quantidade" : 2,
    "valor_unitario" : 17.49
},
"pagamento" : {
    "valor_total" : 143.18,
    "metodo" : "cartão de crédito",
    "quantidade_parcelas" : 2,
    "valor_parcelas" : 71.59
},
"data" : "ISODate('2021-11-03 16:30:00.000Z')"
```

}



* **Comando:**

> `db.getCollection('Vendas').update({_id : ObjectId("6182cb043b3f04ddd384772d")}, {$rename: {"produto_3": "produto_4"}})` 



{

```
"_id" : ObjectId("6182cb043b3f04ddd384772d"),
"funcionaria" : {
    "nome" : "Fernanda Silva",
    "codigo" : 2
},
"cliente" : {
    "nome" : "Maya",
    "cpf" : "523689452-56",
    "telefone" : "(51) 98456-5896",
    "endereco" : "Rua Treze, 147"
},
"produto_1" : {
    "nome" : "Cílios postiço",
    "codigo" : 94,
    "descricao" : "Cílios postiço número 3",
    "quantidade" : 3,
    "valor_unitario" : 15.5
},
"produto_2" : {
    "nome" : "Cola para cílios",
    "codigo" : 90,
    "descricao" : "Cola para cílios incolor",
    "quantidade" : 2,
    "valor_unitario" : 12.9
},
"produto_3" : {
    "nome" : "Delineador",
    "codigo" : 63,
    "descricao" : "Delineador preto em caneta",
    "quantidade" : 2,
    "valor_unitario" : 17.49
},
"pagamento" : {
    "valor_total" : 143.18,
    "metodo" : "cartão de crédito",
    "quantidade_parcelas" : 2,
    "valor_parcelas" : 71.59
},
"data" : "ISODate('2021-11-03 16:30:00.000Z')",
"produto_4" : {
    "nome" : "Rímel",
    "codigo" : 54,
    "descricao" : "Rímel com aplicador curvador",
    "quantidade" : 1,
    "valor_unitario" : 35.9
}
```
}



#### Atualização 2:

-----------

* Atualizar o número de telefone do Objeto 2: 

  * "telefone" : "(51) 98465-1254"  ➜  "telefone" : "(51) 77777-7777"

    ​

{

```
"_id" : ObjectId("6182c2983b3f04ddd384763e"),
"funcionaria" : {
    "nome" : "Fernanda Silva",
    "codigo" : 2
},
"cliente" : {
    "nome" : "Jenifer Souza",
    "cpf" : "987654321-11",
    "telefone" : "(51) 98465-1254",
    "endereco" : "Rua Snta Isabel, 256"
},
"produto_1" : {
    "nome" : "Água micelar",
    "codigo" : 26,
    "descricao" : "Água micelar 7 em 1",
    "quantidade" : 2,
    "valor_unitario" : 15.5
},
"produto_2" : {
    "nome" : "Rímel",
    "codigo" : 56,
    "descricao" : "Rímel com aplicador alongamento",
    "quantidade" : 1,
    "valor_unitario" : 39.8
},
"pagamento" : {
    "valor_total" : 70.8,
    "metodo" : "pix",
    "valor_pago" : 70.8
},
"data" : "ISODate('2021-11-03 14:25:00.000Z')"
```

}

* **Comando:**

> `db.getCollection('Vendas').update({_id : ObjectId("6182c2983b3f04ddd384763e")}, {$set: {"cliente.telefone": "(51) 77777-7777"}})` 



{

    "_id" : ObjectId("6182c2983b3f04ddd384763e"),
    "funcionaria" : {
        "nome" : "Fernanda Silva",
        "codigo" : 2
    },
    "cliente" : {
        "nome" : "Jenifer Souza",
        "cpf" : "987654321-11",
        "telefone" : "(51) 77777-7777",
        "endereco" : "Rua Snta Isabel, 256"
    },
    "produto_1" : {
        "nome" : "Água micelar",
        "codigo" : 26,
        "descricao" : "Água micelar 7 em 1",
        "quantidade" : 2,
        "valor_unitario" : 15.5
    },
    "produto_2" : {
        "nome" : "Rímel",
        "codigo" : 56,
        "descricao" : "Rímel com aplicador alongamento",
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



#### Atualização 3:

--------------

* Remover o campo do Objeto 3:

  * produto_4

    ​

{

```
"_id" : ObjectId("6182c4f13b3f04ddd3847688"),
"funcionaria" : {
    "nome" : "Júlia Borges",
    "codigo" : 1
},
"cliente" : {
    "nome" : "Ana Clara",
    "cpf" : "254365894-25",
    "telefone" : "(51) 98956-1542",
    "endereco" : "Rua São José, 56"
},
"produto_1" : {
    "nome" : "Batom",
    "codigo" : 50,
    "descricao" : "Batom de cor vermelho",
    "quantidade" : 1,
    "valor_unitario" : 30.9
},
"produto_2" : {
    "nome" : "Batom",
    "codigo" : 52,
    "descricao" : "Batom de cor brodô",
    "quantidade" : 1,
    "valor_unitario" : 30.9
},
"produto_3" : {
    "nome" : "Batom",
    "codigo" : 45,
    "descricao" : "Batom cor nude escuro",
    "quantidade" : 1,
    "valor_unitario" : 30.9
},
"produto_4" : {
    "nome" : "Pincel",
    "codigo" : 101,
    "descricao" : "Pincel para aplicar base",
    "quantidade" : 1,
    "valor_unitario" : 10.8
},
"pagamento" : {
    "valor_total" : 103.5,
    "metodo" : "cartão de crédito",
    "quantidade_parcelas" : 3,
    "valor_parcela" : 34.5
},
"data" : "ISODate('2021-11-03 14:52:00.000Z')"
```

}



> **Comando:**
>
> `db.getCollection('Vendas').update({_id : ObjectId("6182c4f13b3f04ddd3847688")}, {$unset:{"produto_4": "produto_4"}})`



{

    "_id" : ObjectId("6182c4f13b3f04ddd3847688"),
    "funcionaria" : {
        "nome" : "Júlia Borges",
        "codigo" : 1
    },
    "cliente" : {
        "nome" : "Ana Clara",
        "cpf" : "254365894-25",
        "telefone" : "(51) 98956-1542",
        "endereco" : "Rua São José, 56"
    },
    "produto_1" : {
        "nome" : "Batom",
        "codigo" : 50,
        "descricao" : "Batom de cor vermelho",
        "quantidade" : 1,
        "valor_unitario" : 30.9
    },
    "produto_2" : {
        "nome" : "Batom",
        "codigo" : 52,
        "descricao" : "Batom de cor brodô",
        "quantidade" : 1,
        "valor_unitario" : 30.9
    },
    "produto_3" : {
        "nome" : "Pincel",
        "codigo" : 101,
        "descricao" : "Pincel para aplicar base",
        "quantidade" : 1,
        "valor_unitario" : 10.8
    },
    "pagamento" : {
        "valor_total" : 103.5,
        "metodo" : "cartão de crédito",
        "quantidade_parcelas" : 3,
        "valor_parcela" : 34.5
    },
    "data" : "ISODate('2021-11-03 14:52:00.000Z')"
}



* Atualizar os valores do Objeto 3:

  * valor_total: 103.50  ➜  92.70 (103.50 - 10.80)

  * valor_parcela: 34.50  ➜  30.90

    ​

* **Comando:**

> `db.getCollection('Vendas').update({_id : ObjectId("6182c4f13b3f04ddd3847688")}, {$set: {"pagamento.valor_total" : 92.70, "pagamento.valor_parcela" : 30.90}})`



{

    "_id" : ObjectId("6182c4f13b3f04ddd3847688"),
    "funcionaria" : {
        "nome" : "Júlia Borges",
        "codigo" : 1
    },
    "cliente" : {
        "nome" : "Ana Clara",
        "cpf" : "254365894-25",
        "telefone" : "(51) 98956-1542",
        "endereco" : "Rua São José, 56"
    },
    "produto_1" : {
        "nome" : "Batom",
        "codigo" : 50,
        "descricao" : "Batom de cor vermelho",
        "quantidade" : 1,
        "valor_unitario" : 30.9
    },
    "produto_2" : {
        "nome" : "Batom",
        "codigo" : 52,
        "descricao" : "Batom de cor brodô",
        "quantidade" : 1,
        "valor_unitario" : 30.9
    },
    "produto_3" : {
        "nome" : "Pincel",
        "codigo" : 101,
        "descricao" : "Pincel para aplicar base",
        "quantidade" : 1,
        "valor_unitario" : 10.8
    },
    "pagamento" : {
        "valor_total" : 92.7,
        "metodo" : "cartão de crédito",
        "quantidade_parcelas" : 3,
        "valor_parcela" : 30.9
    },
    "data" : "ISODate('2021-11-03 14:52:00.000Z')"
}