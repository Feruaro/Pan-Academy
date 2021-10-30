## Vamos falar um pouquinho sobre Java - Exception :coffee: :

* Excessão é um evento que interrompe o fluxo normal do processamento de uma classe;

* O uso correto de excessões torno o progrma mais robusco e confiável;

* Com o tratamento de excessões, um progrma pode continuar executando depois de lidar com um problema;

* Importante: Incorpore sua estratégia de tratamento de excessões no sistema desde o princípio do processo do projeto;

* Pode ser difícil incluir um tratamento de excessões eficiente depos que um sistema já foi implementado;

  ​

### Error:

---------

* Não tem como tratar como uma exceção, não são checados pelo compilador (eventos irrecuperáveis);

* Usada pela JVM que serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar;

* Documentação [Class Error](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Error.html);

  ​

### Exception:

-------------

* Unchecked (Runtime):

  * Exceptions que **podem** ser evitados se forem tratados e analisados pelo desenvolvedor;
  * Exceções não checadas pelo compilador;
  * Geralmente são excessões de lógica;
  * Documentação [Class RuntimeException](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/RuntimeException.html);

* Checked Exception:

  * Exceptions que **devem** ser evitados e tratados pelo desenvolvedor para o progama funcionar. São obrigatórias o tratamento;

  * Condições excepcionais checadas pelo compilador (eventos recuparáveis);

  * Documentação [Class Exception](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html)

    ​

### Imagens Hierarquia Exceptions:

------------------



![exception-hierarchy-1](https://github.com/Feruaro/Pan-Academy-Java/blob/main/Estudos%20Fe/imagens/exception-hierarchy-1.png)



![java-exception-handling-class-hierarchy-diagram](https://github.com/Feruaro/Pan-Academy-Java/blob/main/Estudos%20Fe/imagens/java-exception-handling-class-hierarchy-diagram.jpg)



### Tratamento:

-----------------------

* **try, catch, finally:** cada uma dessas palavras, juntas, definem blocos para tratamento de exceções;

* **throws:** declara que um método pode lançar uma ou várias exceções;

* **throw:** lança explicitamente uma exception;

  ​



### Referências:

------------

* https://github.com/cami-la/exceptions-java

* https://web.digitalinnovation.one/course/tratamento-de-excecoes-em-java/learning/6fad4964-b716-4a93-910c-8fb6175a3a1d?back=/browse

  ​

### Certificado:

-----------

* [Certificado]()