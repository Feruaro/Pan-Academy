package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleList {

	public static void main(String[] args) {
		
		//Comparator: recebe 2 argumentos, e será feita a comparação entre elas
		//Comparable: recebe 1 argumento, implemetar dentro de uma clase de dominio, ou seja,
		//você compara a classe atual vs uma classe que será comparada
		
		//pode utilizar tanto os métodos da classe Collections, quanto da própria implementação de uma
		//lista e chamar os métodos de ordenação
		
		
		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Fernanda", 22));		
		estudantes.add(new Estudante("William", 28));
		estudantes.add(new Estudante("Patrícia", 25));
		estudantes.add(new Estudante("Jenifer", 23));
		estudantes.add(new Estudante("Jonas", 26));
		estudantes.add(new Estudante("Ana Julia", 22));
		estudantes.add(new Estudante("Jonathan", 25));
		
		System.out.println("---- ordem de inserção ----");
		System.out.println(estudantes);  //[Fernanda - 22, William - 28, Patrícia - 25, Jenifer - 23, Jonas - 26, Ana Julia - 22, Jonathan - 25]
		
		                                 //caso resultado 0: vai ordenar pela ordem de inserção
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade()); //ordenação, com função lambda		
		System.out.println("---- ordem natural das idades ----");
		System.out.println(estudantes);  //[Fernanda - 22, Ana Julia - 22, Jenifer - 23, Patrícia - 25, Jonathan - 25, Jonas - 26, William - 28]
		
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade()); //ordenação, com função lambda		
		System.out.println("---- ordem reversa das idades ----");
		System.out.println(estudantes);  //[William - 28, Jonas - 26, Patrícia - 25, Jonathan - 25, Jenifer - 23, Fernanda - 22, Ana Julia - 22]
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); //função do comparator, em tempo de execução ele busca as idades dos estudantes e compara
		System.out.println("---- ordem natural das idades (método reference)");
		System.out.println(estudantes);  //[Fernanda - 22, Ana Julia - 22, Jenifer - 23, Patrícia - 25, Jonathan - 25, Jonas - 26, William - 28]
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed()); //função do comparator, em tempo de execução ele busca as idades dos estudantes e compara
		System.out.println("---- ordem reversa das idades (método reference)");
		System.out.println(estudantes);  //[William - 28, Jonas - 26, Patrícia - 25, Jonathan - 25, Jenifer - 23, Fernanda - 22, Ana Julia - 22]
		
		Collections.sort(estudantes);    //só pode passar como referência uma lista de objetos que implementa Comparable
		System.out.println("---- ordem natural das idades (interface comparable)");
		System.out.println(estudantes);  //[Fernanda - 22, Ana Julia - 22, Jenifer - 23, Patrícia - 25, Jonathan - 25, Jonas - 26, William - 28]
		
		                                 //objeto da classe que implementa comparator
		Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator()); //nesse sorte não é precisa uma lista de objetos implementando Comparable ou Comparator;
		System.out.println("---- ordem reversa das idades (interface comparable)");
		System.out.println(estudantes);  //[William - 28, Jonas - 26, Patrícia - 25, Jonathan - 25, Jenifer - 23, Fernanda - 22, Ana Julia - 22]
		
		
		
		
		
	}

}
