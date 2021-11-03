## Exclusão de documentos - atividade MongDB:

* Deletar o Objeto 2 (ObjectId("6182c2983b3f04ddd384763e")):

  ​

![antes de deletar o objeto 2](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\antes_deletar.jpg)



* **Comando:**

> `db.getCollection('Vendas').remove({_id : ObjectId("6182c2983b3f04ddd384763e")})`



![depois de deletar o objeto 2](F:\Documentos\FERNANDA\PAN\GITHUB\Pan-Academy\Aulas - DataBase\Aulas\01-11\imagens\depois_deletar.jpg)

