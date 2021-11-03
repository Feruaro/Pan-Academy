## Inserção de documentos - atividade MongoDB:

#### Loja de maquiagens:

-------

* Funcionária:	
  * nome
  * código


* Cliente:

  * nome
  * CPF
  * telefone
  * endereço

* Produto:

  * nome
  * código
  * descrição
  * quantidade
  * valor unitário

* Pagamento

  * Valor total

  * Metodo de pagamento:

    * Pix:

      * valor pago

    * Dinheiro:

      * valor pago
      * troco

    * Cartão:

      * quantidade de parcelas
      * valor das parcelas

      ​

#### JSON- inserção:

---------

* Objeto 1:

{

    "_id" : ObjectId("6182bd323b3f04ddd38475bb"),
    "funcionaria" : {
        "nome" : "Júlia Borges",
        "codigo" : 1
    },
    "cliente" : {
        "nome" : "Adriana dos Santos",
        "cpf" : "123456789-10",
        "telefone" : "(51) 99999-9999",
        "endereco" : "Rua Principal, 123"
    },
    "produto_1" : {
        "nome" : "Base",
        "codigo" : 15,
        "descricao" : "Base líquida de tom 2 com aplicador",
        "quantidade" : 1,
        "valor_unitario" : 57.8
    },
    "produto_2" : {
        "nome" : "Corretivo",
        "codigo" : 32,
        "descricao" : "Corretivo em bastão de tom 2",
        "quantidade" : 1,
        "valor_unitario" : 25.9
    },
    "produto_3" : {
        "nome" : "Batom",
        "codigo" : 56,
        "descricao" : "Batom cor rosa claro",
        "quantidade" : 2,
        "valor_unitario" : 22.9
    },
    "pagamento" : {
        "valor_total" : 129.5,
        "metodo" : "dinheiro",
        "valor_pago" : 130.0,
        "troco" : 0.5
    },
    "data" : "ISODate('2021-11-03 13:46:00.000Z')"
}

* Objeto 2:

{

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
}

* Objeto 3:

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
}

* Objeto 4:

{

    "_id" : ObjectId("6182c66c3b3f04ddd38476a8"),
    "funcionaria" : {
        "nome" : "Fernanda Silva",
        "codigo" : 2
    },
    "cliente" : {
        "nome" : "Andréia Cardoso",
        "cpf" : "333555666-55",
        "telefone" : "(51) 98963-9845",
        "endereco" : "Rua Nove, 13"
    },
    "produto_1" : {
        "nome" : "Paleta sombras",
        "codigo" : 85,
        "descricao" : "Paleta de cores nudes e brilhosas",
        "quantidade" : 1,
        "valor_unitario" : 56.8
    },
    "produto_2" : {
        "nome" : "Iluminador",
        "codigo" : 70,
        "descricao" : "Iluminador em pó",
        "quantidade" : 1,
        "valor_unitario" : 45.5
    },
    "produto_3" : {
        "nome" : "Pó compacto",
        "codigo" : 78,
        "descricao" : "Pó compacto translucido",
        "quantidade" : 1,
        "valor_unitario" : 39.8
    },
    "pagamento" : {
        "valor_total" : 142.1,
        "metodo" : "dinheiro",
        "valor_pago" : 150.0,
        "troco" : 7.9
    },
    "data" : "ISODate('2021-11-03 15:15:00.000Z')"
}

* Objeto 5:

{

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
}



