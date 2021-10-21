package ExercicioFixacaoComparators;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExercicioFixacao {

	public static void main(String[] args) {
		
		//Crie uma lista de um objeto complexo e execute as seguintes opera��es
		
		List<Produto> produtos = new ArrayList<>();
		
		//adicione elementos nesta lista:
		produtos.add(new Produto("R�mel", 19));
		produtos.add(new Produto("Base", 10));		
		produtos.add(new Produto("L�pis", 35));
		produtos.add(new Produto("Corretivo", 20));
		produtos.add(new Produto("Sombra", 15));		
		produtos.add(new Produto("Batom", 30));
		produtos.add(new Produto("Blush", 15));		
		System.out.println(produtos);   //[R�mel - 19, Base - 10, L�pis - 35, Corretivo - 20, Sombra - 15, Batom - 30, Blush - 15]
		
		//Ordene implementando a interface Comparable no seu objeto:
		Collections.sort(produtos);
		System.out.println(produtos);   //[Base - 10, Sombra - 15, Blush - 15, R�mel - 19, Corretivo - 20, Batom - 30, L�pis - 35]
 		
		//Ordene implementando um novo objeto com a interface Comparator no seu objeto:
		Collections.sort(produtos, new ProdutoComparator());
		System.out.println(produtos);   //[Base - 10, Sombra - 15, Blush - 15, R�mel - 19, Corretivo - 20, Batom - 30, L�pis - 35]
		
		//Ordene usando uma express�o lambda na chamada de suaLista.sort():
		produtos.sort((primeiro, segundo) -> primeiro.getValor() - segundo.getValor());
		System.out.println(produtos);   //[Base - 10, Sombra - 15, Blush - 15, R�mel - 19, Corretivo - 20, Batom - 30, L�pis - 35]
		
		//Ordene usando refer�ncias de m�todos e os m�todos est�ticos de Comparator:
		produtos.sort(Comparator.comparingInt(Produto::getValor));
		System.out.println(produtos);   //[Base - 10, Sombra - 15, Blush - 15, R�mel - 19, Corretivo - 20, Batom - 30, L�pis - 35]
		
	
	}

}
