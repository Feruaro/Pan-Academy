## Vamos falar um pouquinho sobre Java :coffee: :

* Neste momento vamos falar sobre Collections;

* Facilitar a manipulação de arrays nativos de java;

* Interface java.util.Collection;

* List, Queue, Set: herdam da interface Collections e implementam seus métodos;

  ​

### List:

----------

* Interface java.util.List: garante uma ordem de inserção;

  * **ArrayList:**

    * java.util.ArrayList   |   Exemplos com [ArrayList]();
    * mesma funcionalidade dos arrays nativamente, mas de forma dinâmica;
    * Permite adição, atualização, leitura e remoção sem regras adicionais;
    * Permite ordenação através de comparators;

  * **Vector:**

    * java.util.Vector   |   Exemplos com o [Vector]();

    * Mesmas funções que o ArrayList;

      ​

### Queue:

-------------

* implementação java.util.Queue

  * java.util.LinkedList   |   Exemplos com [LinkedList]();
  * LinkedList implementa a interface Deque que extends a Queue;

* Garante ordem de inserção;

* Permite adição, leitura e remoção considerando uma regra básica de uma fila: (FIFO) - primeiro que entra, primeiro que sai;

* Não permite mudança de ordenação;

* Para atualizar: remover o elemento e depois de atualizá-lo, adicionar novamente, e ele terá uma nova posição na lista;

* Métodos:

  * **poll()** --> retorna e remove o primeiro da fila | se vazia retorna null;
  * **peek()** --> retorna e NÃO remove o primeiro da fila | se vazia retorna null;
  * **element()** --> retorna e NÃO remove o primeiro da fila | se vazia retorna uma expection;

  ​

### Set:

------------------------

* implementação java.util.Set

  * java.util.HashSet  |  Exemplos com [HashSet]();
  * java.util.TreeSet    |  Exemplos com [TreeSet]();
  * java.util.LinkedHashSet  |  Exemplos com [LinkedHashSet]();

* Por padrão, não garante ordem e nem reordenação;

* Não permite itens repetidos;

* Não possui indexação, não permite busca por um elemento específico;

* Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura, apenas navegação;

* Criada para trabalhar com grande conjuntos de dados e para performance, então trabalhar com ordenação de dados não permite isso. Então é utilizada para grandes conjuntos de volumes e performance, sem necessidade de ordem;

  ​

  ![Set](https://github.com/Feruaro/Pan-Academy-Java/blob/main/Estudos%20Fe/imagens/set.jpg)

  ​

### Map:

----------------

* Não herda de Collections;
* implementação java.util.Map
  * java.util.HashMap   |   Exemplos de [HashMap]();
  * java.util.TreeMap     |   Exemplos de [TreeHash]();
  * java.util.HashTable  |   Exemplos de [HashTable]();
* Entrada de chave e valor;
* Permite valores repetidos, mas não permite repetição de chave;
* Permite adição, busca por chave ou valor, atualização, remoção e navegação;
* Pode ser ordenada;