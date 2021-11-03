## Inserção de documentos - atividade MongoDB:

* **Objeto 1:**

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

* **Objeto 2:**

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

* **Objeto 3:**

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

* **Objeto 4:**

{

    "_id" : ObjectId("6182fc9f3b3f04ddd3847cbb"),
    "funcionaria" : {
        "nome" : "Fernanda Silva",
        "codigo" : 2
    },
    "cliente" : {
        "nome" : "Maria Ivani",
        "cpf" : "365894256-56",
        "telefone" : "(51) 98965-2589",
        "endereco" : "Rua Treze, 524"
    },
    "produto_1" : {
        "nome" : "Cílios postiço",
        "codigo" : 84,
        "descricao" : "Cílios postiço tamanho 2",
        "quantidade" : 3,
        "valor_unitario" : 15.9
    },
    "produto_2" : {
        "nome" : "Cola para cílios postiço",
        "codigo" : 89,
        "descricao" : "Cola para cílios postiço líquida",
        "quantidade" : 1,
        "valor_unitario" : 25.5
    },
    "produto_3" : {
        "nome" : "Rímel",
        "codigo" : 35,
        "descricao" : "Rímel com aplicador curva",
        "quantidade" : 1,
        "valor_unitario" : 38.9
    },
    "produto_4" : {
        "nome" : "Delineador",
        "codigo" : 28,
        "descricao" : "Delineador preto caneta",
        "quantidade" : 2,
        "valor_unitario" : 17.49
    },
    "pagamento" : {
        "valor_total" : 147.08,
        "metodo" : "cartão de crédito",
        "quantidade_parcela" : 3,
        "valor_parcela" : 49.03
    },
    "data" : "ISODate('2021-11-03 15:56:00.000Z')"
}

* **Objeto 5:**

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
}