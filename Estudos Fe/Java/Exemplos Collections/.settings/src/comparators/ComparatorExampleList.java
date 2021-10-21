package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleList {

	public static void main(String[] args) {
		
		//Comparator: recebe 2 argumentos, e ser� feita a compara��o entre elas
		//Comparable: recebe 1 argumento, implemetar dentro de uma clase de dominio, ou seja,
		//voc� compara a classe atual vs uma classe que ser� comparada
		
		//pode utilizar tanto os m�todos da classe Collections, quanto da pr�pria implementa��o de uma
		//lista e chamar os m�todos de ordena��o
		
		
		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Fernanda", 22));		
		estudantes.add(new Estudante("William", 28));
		estudantes.add(new Estudante("Patr�cia", 25));
		estudantes.add(new Estudante("Jenifer", 23));
		estudantes.add(new Estudante("Jonas", 26));
		estudantes.add(new Estudante("Ana Julia", 22));
		estudantes.add(new Estudante("Jonathan", 25));
		
		System.out.println("---- ordem de inser��o ----");
		System.out.println(estudantes);  //[Fernanda - 22, William - 28, Patr�cia - 25, Jenifer - 23, Jonas - 26, Ana Julia - 22, Jonathan - 25]
		
		                                 //caso resultado 0: vai ordenar pela ordem de inser��o
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade()); //ordena��o, com fun��o lambda		
		System.out.println("---- ordem natural das idades ----");
		System.out.println(estudantes);  //[Fernanda - 22, Ana Julia - 22, Jenifer - 23, Patr�cia - 25, Jonathan - 25, Jonas - 26, William - 28]
		
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade()); //ordena��o, com fun��o lambda		
		System.out.println("---- ordem reversa das idades ----");
		System.out.println(estudantes);  //[William - 28, Jonas - 26, Patr�cia - 25, Jonathan - 25, Jenifer - 23, Fernanda - 22, Ana Julia - 22]
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); //fun��o do comparator, em tempo de execu��o ele busca as idades dos estudantes e compara
		System.out.println("---- ordem natural das idades (m�todo reference)");
		System.out.println(estudantes);  //[Fernanda - 22, Ana Julia - 22, Jenifer - 23, Patr�cia - 25, Jonathan - 25, Jonas - 26, William - 28]
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed()); //fun��o do comparator, em tempo de execu��o ele busca as idades dos estudantes e compara
		System.out.println("---- ordem reversa das idades (m�todo reference)");
		System.out.println(estudantes);  //[William - 28, Jonas - 26, Patr�cia - 25, Jonathan - 25, Jenifer - 23, Fernanda - 22, Ana Julia - 22]
		
		Collections.sort(estudantes);    //s� pode passar como refer�ncia uma lista de objetos que implementa Comparable
		System.out.println("---- ordem natural das idades (interface comparable)");
		System.out.println(estudantes);  //[Fernanda - 22, Ana Julia - 22, Jenifer - 23, Patr�cia - 25, Jonathan - 25, Jonas - 26, William - 28]
		
		                                 //objeto da classe que implementa comparator
		Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator()); //nesse sorte n�o � precisa uma lista de objetos implementando Comparable ou Comparator;
		System.out.println("---- ordem reversa das idades (interface comparable)");
		System.out.println(estudantes);  //[William - 28, Jonas - 26, Patr�cia - 25, Jonathan - 25, Jenifer - 23, Fernanda - 22, Ana Julia - 22]
		
		
		
		
		
	}

}
