## Vamos falar um pouquinho sobre Java - Spring: 

* O que é o Spring? É uma plataforma com diversos recursos para construção de aplicativos **Java**, facilitando assim o desenvolvimento com módulos que facilitam a construção de softwares reduzindo o tempo de desenvolvimento;

* [Por que Spring?](https://spring.io/why-spring);

* [Projetos Spring](https://spring.io/projects);

  ​

### Spring Framework:

---------------

* Data Access / Integration:

  * JDBC;
  * ORM;
  * OXM;
  * JMS;
  * Transactions;

* Web:

  * WebSocket;
  * Servlet;
  * Web;
  * Portlet;

* AOP;

* Aspects;

* Intrumentations;

* Messaging;

* Core Container:

  * Beans;
  * Core;
  * Context;
  * SpEL;

* Test;

  ​

### Core Container:

---------

* Base do Spring, núcleo principal;
* Classes + Configuraçao   →   Spring Container    →   Sistema Configurado - **Pronto pro uso**
* O que é Inversão de Controle? É um princípio de design de programas de computadores onde a sequência (controle) de chamadas dos métodos é invertida em relação à programação tradicional, ou seja, ela não é determinada diretamente pelo programador;
* **Core:**
  * ​
* **Beans:**
  * Se trata de um objeto que é instanciado, montado e gerenciado por um container do Spring através de Inversão de Controle (IoC) e Injeção de Dependências (DI);
  * Clico de vida de um Bean:
    * Container é iniciado  →  Bean é instanciado  →  Dependências são injetadas  →  chama do método de inicialização  →  Bean é utilizado  →  Bean é descartado;  
  * Configurando Beans:
    * Arquivos XML;
    * Anotações;
  * Interfaces para configurar Beans:
    * BeanFactory;
    * ApplicationContext (contém funcionalidades do BeanFactory e suas próprias);
* **Context:**
  * Core e Beans  →  extends;
  * Internacionalização
  * ApplicationContext  →  implementação melhorada da BeanFactory;
* **Expression Language:**
  * Define através do xml ou anotações em tempo de execução, valores e comportamentos dos beans;