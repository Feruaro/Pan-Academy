package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(1);   //adiciona os elem  | garante ordem
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(32);
		
		System.out.println(sequenciaNumerica);  //[1, 2, 4, 8, 16, 32]
		
		sequenciaNumerica.remove(4);  //remove por object;
		System.out.println(sequenciaNumerica);  //[1, 2, 8, 16, 32]
		
		System.out.println(sequenciaNumerica.size());  //5, retorna o tam
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());  //exibe todos os elementos, um em cada linha
		}
		
		for(Integer i : sequenciaNumerica) {
			System.out.println(i);  //exibe todos os elementos, um em cada linha
		}
		
		System.out.println(sequenciaNumerica.isEmpty());  //false
		
		sequenciaNumerica.clear();  //limpa todos os elementos
		System.out.println(sequenciaNumerica);  //[]
		
		System.out.println(sequenciaNumerica.isEmpty());  //true
		
	}

}
