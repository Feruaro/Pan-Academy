package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {

		Set<Double>	notasAlunos = new HashSet<>();	
		
		notasAlunos.add(5.8);	//adicionar valores | não garante a ordem 
		notasAlunos.add(9.3);
		notasAlunos.add(4.2);
		notasAlunos.add(9.8);
		notasAlunos.add(7.5);
		notasAlunos.add(6.4);
		notasAlunos.add(2.1);
		notasAlunos.add(10.0);
		
		System.out.println(notasAlunos); //[6.4, 5.8, 10.0, 9.3, 9.8, 4.2, 2.1, 7.5]
		
		notasAlunos.remove(9.3); // remover por object;
		System.out.println(notasAlunos);  //[6.4, 5.8, 10.0, 9.8, 4.2, 2.1, 7.5]
		
		System.out.println(notasAlunos.size());  //7, retorna tam
		
		Iterator<Double> iterator = notasAlunos.iterator();		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); //exibe todos os elem, um por linha
		}
		
		for(Double i : notasAlunos) {
			System.out.println(i);  //exibe todos os elem, um por linha
		}
		
		notasAlunos.clear();  //limpa todos os elem
		System.out.println(notasAlunos); //[]
		
		System.out.println(notasAlunos.isEmpty()); //true, pois está vazia
		

	}

}
