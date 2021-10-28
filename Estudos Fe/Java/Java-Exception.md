## Vamos falar um pouquinho sobre Java - Exception :coffee: :

* Excessão é um evento que interrompe o fluxo normal do processamento de uma classe;

* O uso correto de excessões torno o progrma mais robusco e confiável;

* Com o tratamento de excessões, um progrma pode continuar executando depois de lidar com um problema;

* Importante: Incorpore sua estratégia de tratamento de excessões no sistema desde o princípio do processo do projeto;

* Pode ser difícil incluir um tratamento de excessões eficiente depos que um sistema já foi implementado;

  ​

### Casos:

---------

* **Error**: Usada pela JVM que serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar;
* **Unchecked (Runtime)**: Exceptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor. Geralmente são excessões de lógica;
* **Checked Exception**: Exceptions que DEVEM ser evitados e tratados pelo desenvolvedor para o progama funcionar. São obrigatórias o tratamento;