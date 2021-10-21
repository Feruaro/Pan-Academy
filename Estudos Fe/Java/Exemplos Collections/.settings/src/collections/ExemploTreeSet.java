package collections;

import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		//�rvores bin�rias
		//a leitura � perform�tica, mas a modifica��o dispara uma nova ordena��o e pode interferir na performance;
		//permite a reordena��o atrav�s de comparators;
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");	//adicionando os elem | ordena��o em �rvore, n�s
		treeCapitais.add("Florian�polis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);  //[Belo Horizonte, Curitiba, Florian�polis, Porto Alegre, Rio Janeiro, S�o Paulo]
		
		System.out.println(treeCapitais.first()); //Belo Horizonte, retorna o primeiro elem, do topo da arvore	
		System.out.println(treeCapitais.last());  //S�o Paulo, retorna o �ltimo elem
		
		System.out.println(treeCapitais.lower("Florian�polis")); //Curitiba, retorna o primeiro elem abaixo na �rvore da capital parametrizada
		System.out.println(treeCapitais.higher("Florian�polis")); //Porto Alegre, retorna o primeiro elem acima na �rvore da capital parametrizada
		
		System.out.println(treeCapitais.pollFirst()); //Belo Horizonte, retorna o primeiro elem e depois o remove;
		System.out.println(treeCapitais.pollLast()); //S�o Paulo, retorna o �ltimo elem e depois o remove;

		System.out.println(treeCapitais);  //[Curitiba, Florian�polis, Porto Alegre, Rio Janeiro]
		
		//Exec�cios de fixa��o:
		
		TreeSet<Integer> numeros = new TreeSet<>();
		
		numeros.add(3);			//adicionar elem
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		for(Integer i : numeros) {   //3
			System.out.println(i);   //20
			                         //44
			                         //88			                         
		}
		
		//numeros.remove(3);
		numeros.pollFirst();	//remover o primeiro elem
		System.out.println(numeros); //[20, 44, 88]
		
		numeros.add(23); //adicionar novo elem
		System.out.println(numeros);  //[20, 23, 44, 88]
		
		System.out.println(numeros.size()); //4, retorna tam
		
		System.out.println(numeros.isEmpty()); //false, n�o est� vazio
		
		numeros.clear(); //limpa todos os elem
				
	}

}
