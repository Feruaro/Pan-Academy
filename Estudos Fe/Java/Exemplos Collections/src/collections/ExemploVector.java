package collections;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {
		
		List<String> esportes = new Vector<>();
		
		esportes.add("Futebol");		//adiciona os elem a lista esporte
		esportes.add("Basquetebol");
		esportes.add("T�nis de mesa");
		esportes.add("V�lei");		
		
		System.out.println(esportes);	//[Futebol, Basquetebol, T�nis de mesa, V�lei]
		for(String i : esportes) {		//Futebol 
			System.out.println(i);		//Basquetebol
		}								//T�nis de mesa
										//V�lei	
		
		esportes.set(2, "Ping Pong");   //altera o elem do index informado (2) para o elem informado (Pig Pong)
		System.out.println(esportes);   //[Futebol, Basquetebol, Ping Pong, V�lei]
		
		esportes.remove(0);             //remove por index;
		System.out.println(esportes);   //[Basquetebol, Ping Pong, V�lei]
		
		esportes.remove("Basquetebol"); //remove por object;
		System.out.println(esportes);   //[Ping Pong, V�lei]
		
		String esporte = esportes.get(1); //atribuindo a uma variavel o elem daquele index; / retorno � de acordo com o tipo daquela lista
		System.out.println(esporte);   //V�lei
		System.out.println(esportes.get(1)); //V�lei, retorna o elem daquela posi��o
		
		
	
	
	}												

}
