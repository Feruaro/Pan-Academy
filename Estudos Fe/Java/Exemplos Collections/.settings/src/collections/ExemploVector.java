package collections;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {
		
		List<String> esportes = new Vector<>();
		
		esportes.add("Futebol");		//adiciona os elem a lista esporte
		esportes.add("Basquetebol");
		esportes.add("Tênis de mesa");
		esportes.add("Vôlei");		
		
		System.out.println(esportes);	//[Futebol, Basquetebol, Tênis de mesa, Vôlei]
		for(String i : esportes) {		//Futebol 
			System.out.println(i);		//Basquetebol
		}								//Tênis de mesa
										//Vôlei	
		
		esportes.set(2, "Ping Pong");   //altera o elem do index informado (2) para o elem informado (Pig Pong)
		System.out.println(esportes);   //[Futebol, Basquetebol, Ping Pong, Vôlei]
		
		esportes.remove(0);             //remove por index;
		System.out.println(esportes);   //[Basquetebol, Ping Pong, Vôlei]
		
		esportes.remove("Basquetebol"); //remove por object;
		System.out.println(esportes);   //[Ping Pong, Vôlei]
		
		String esporte = esportes.get(1); //atribuindo a uma variavel o elem daquele index; / retorno é de acordo com o tipo daquela lista
		System.out.println(esporte);   //Vôlei
		System.out.println(esportes.get(1)); //Vôlei, retorna o elem daquela posição
		
		
	
	
	}												

}
