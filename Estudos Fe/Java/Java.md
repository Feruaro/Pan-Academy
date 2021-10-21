## Vamos falar um pouquinho sobre JAVA :coffee: :



* Compilada;

* Interpretada;

* Fortemente tipada;

* Linguagem de alto nível

* Executada em uma máquina virtual - JVM (Java Virtual Machine);

  ​

**Source file (.java)  -> compilação - Javac  ->  ByteCodes (.class)  ->  interpretação - JVM **



* é uma máquina virtual responsável pela tradução dos ByteCodes oriundos do compilador Javac (Java Compiler) em código de máquina de cada sistema operacional.

* Características:

  * Execução de pilhas;

  * Gerenciamento de memória;

  * Gerenciamento de threads;

  * Otimização de código (Compilação JIT - Just In Time - Feature);

  * Garbage Collector (GC): responsável pela limpeza da memória (memória suja);

    ​


* **Java x outras linguagens também compiladas:**

  * outras linguagem compilam diretamente para o sistema operacional, ou seja, se você quiser executar um código no Windows e depois no Linux, deverá compilar para ambos; 

  * Javac compila o código em ByteCodes, que é interpretado pela JVM, ou seja, só é precisa compilar para a JVM e ela que se encarrega do sistema operacional;

    ​

* **JRE x JDK:**

  * JRE - Java Runtime Environment: responsável por executar os programas em Java;

  * JDK - Java Development Kit: utilitários que permite o desenvolvimento de programas em Java. Já possui a JVM para executar os programas;

    ​

* **Plataformas:**

  * Java SE - Java Standard Edition: contém todas as especificações do Java;

  * Java EE - Java Enterprise Edition: contém todas as especificações do SE e um número de programas úteis para qe executem em servidores. *Em 2019 foi renomeado para Jakarta EE*;

  * Java ME - Java Micro Edition: contém especificações para desenvolvedores de programas para dispositovos pequenos;

    ​

* **Java Version Manager:**

  * Controle de versão do Java;

  * [Jabba](https://github.com/shyiko/jabba) : possui versão para Mac, Linux e Windows 10. No README.md tem todos os comandos necessários para instalar e executar;

    ​

* **Javadoc:**

  * é uma ferramento para documentação no formato HTML que se baseia nos comentários (tags) do código-fonte;

  * Os comentários precisam conter tags para que a documentação fique legível;

  * Informações sobre [Doc Comments](https://www.oracle.com/br/technical-resources/articles/java/javadoc-tool.html#tag);

    ​

| Tag         | Descrição                                |
| ----------- | ---------------------------------------- |
| @autor      | Documenta o nome do autor / desenvolvedor. |
| @version    | Documenta  o número da versão de uma classe ou um método. |
| @param      | Documenta a definição do(s) parâmetro(s) do método |
| @return     | Documenta o valor de retorno (não ser usada para construtores e do tipo void) |
| @exception  | Documenta uma exceção lançada por um método. |
| @throws     | Documenta uma exceção lançada por um método. |
| @see        | Documenta uma associação a outro método ou classe. |
| @since      | Documenta quando o método foi adiocionado a classe. |
| @serial     | Documenta os valores aceitáveis e a descrição dos campos serializados. |
| @deprecated | Documenta o método como *deprecated*.    |

