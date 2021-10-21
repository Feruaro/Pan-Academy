package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		//LinkedList implementa a interface Deque que extends a Queue
		//DEQUE
		//pop() --> remove e retorna o elem removido (igual poll())
		//push ou add para adicionar
		
		filaBanco.add("Fernanda");    //adicionar elem
		filaBanco.offer("Patr�cia");  //outra forma de add 
		filaBanco.add("Jenifer");
		filaBanco.add("Ana");
		filaBanco.add("Maria");	 
		  		
		System.out.println(filaBanco);  //[Fernanda, Patr�cia, Jenifer, Ana, Maria]
		
		//poll() -> retorna e remove o primeiro da fila | se vazia retorna null;
		//peek() -> retorna e N�O remove o primeiro da fila | se vazia retorna null;
		//element() -> retorna e N�O remove o primeiro da fila | se vazia retorna uma expection;
		
		String clienteASerAtendido = filaBanco.poll(); //atribui o primeiro elem e o remove da fila;
		System.out.println(clienteASerAtendido);  //Fernanda
		System.out.println(filaBanco);            //[Patr�cia, Jenifer, Ana, Maria]
		
		//filaBanco.clear();
		
		String primeiroCliente = filaBanco.peek(); //atribui o primeiro elem;
		System.out.println(primeiroCliente);  //Patr�cia
		System.out.println(filaBanco);        //[Patr�cia, Jenifer, Ana, Maria]
		
		String primeiroClienteOuErro = filaBanco.element();  //atribui o primeiro elem;
		System.out.println(primeiroClienteOuErro); //Patr�cia
		System.out.println(filaBanco);             //[Patr�cia, Jenifer, Ana, Maria]
		
		
		for(String i : filaBanco) {
			System.out.println(i);
		}
		
		Iterator<String> iterator = filaBanco.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(filaBanco.size());  //4, retorna tam da fila
		
		System.out.println(filaBanco.isEmpty()); //false, retorna um boolean se est� vazia ou n�o
		
		filaBanco.clear(); //limpa fila inteira;
		
		filaBanco.add("Daniel");  //adiciona o Daniel ao �ltimo da fila
		
		System.out.println(filaBanco.contains("Daniel")); //retorna um boolean se existe/cont�m ou n�o o elem na fila
	}

}
