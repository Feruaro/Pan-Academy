package collections;

import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		//árvores binárias
		//a leitura é performática, mas a modificação dispara uma nova ordenação e pode interferir na performance;
		//permite a reordenação através de comparators;
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");	//adicionando os elem | ordenação em árvore, nós
		treeCapitais.add("Florianópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);  //[Belo Horizonte, Curitiba, Florianópolis, Porto Alegre, Rio Janeiro, São Paulo]
		
		System.out.println(treeCapitais.first()); //Belo Horizonte, retorna o primeiro elem, do topo da arvore	
		System.out.println(treeCapitais.last());  //São Paulo, retorna o último elem
		
		System.out.println(treeCapitais.lower("Florianópolis")); //Curitiba, retorna o primeiro elem abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.higher("Florianópolis")); //Porto Alegre, retorna o primeiro elem acima na árvore da capital parametrizada
		
		System.out.println(treeCapitais.pollFirst()); //Belo Horizonte, retorna o primeiro elem e depois o remove;
		System.out.println(treeCapitais.pollLast()); //São Paulo, retorna o último elem e depois o remove;

		System.out.println(treeCapitais);  //[Curitiba, Florianópolis, Porto Alegre, Rio Janeiro]
		
		//Execícios de fixação:
		
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
		
		System.out.println(numeros.isEmpty()); //false, não está vazio
		
		numeros.clear(); //limpa todos os elem
				
	}

}
