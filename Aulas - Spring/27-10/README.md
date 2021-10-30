## Exercícios Java - Spring:



* Nesta aula iniciamos um projeto de API REST para estudarmos na prática e em grupo sobre Spring e Java, para a Aplicação client utilizei o Insomnia;

* Configuramos o arquivo application.properties;

* Construímos a classe Usuario e a UsuarioRepository;

* Implementamos o método de leitura (read) nas classes UsuarioService e UsuarioController, assim quando pesquisamos no navegador *localhost:8080/usuarios* temos a exibição da lista de usuários e quando pesquisados por *localhost:8080/{id}* podemos buscar pelo id que desejamos;

  ​


#### Utilizamos as seguintes dependências:

------

* H2 Database SQL;

* Spring Data JPA SQL;

* Validation I/O;

* Spring Web;

* Spring Boot DevTools;

  ​

#### Separamos nos seguintes pacotes:

------------

* controllers;

* models;

* repositories;

* services;

  ​

#### Códigos:

------------

* Códigos da [API](https://github.com/Feruaro/Pan-Academy-Spring/tree/main/Aulas/27-10/api/src/main/java/br/com/pan/academy/api);