package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Fernanda");	   //adicionando um elem a List
		nomes.add("William");
		nomes.add("Maria");
		nomes.add("Jo�o");		
		System.out.println(nomes); //[Fernanda, William, Maria, Jo�o]
		
		Collections.sort(nomes);   //ordena��o da list;		
		System.out.println(nomes); //[Fernanda, Jo�o, Maria, William]
		
		nomes.set(1, "Fernanda");  //trocando o elem do index pelo informado;
		System.out.println(nomes); //[Fernanda, Fernanda, Maria, William]
		
		nomes.remove(1);           //remover por index;
		System.out.println(nomes); //[Fernanda, Maria, William]
		
		nomes.remove("William");   //remover por objeto;
		System.out.println(nomes); //[Fernanda, Maria]
		
		int posicao = nomes.indexOf("Fernanda"); //atribui um retorno int de qual o �ndice daquele elem.
		System.out.println(posicao); //0
		System.out.println(nomes.indexOf("Fernanda")); //0, retorno um int de qual o �ndice daquele elem.
		//Caso n�o tenha o elem. retorno � -> -1;
		System.out.println(nomes.indexOf("Jos�")); //-1;		
		//CUIDAR -> informar o nome da MESMA forma que foi atribu�do a lista, como letras mai�sculas e acentos;
		System.out.println(nomes.indexOf("fernanda")); //-1;		
		
		String nome = nomes.get(1); //atribuindo a uma variavel o elem daquele index;
		System.out.println(nome);   //Maria
		System.out.println(nomes.get(1)); //Maria, retorna o elem daquele index		
		//caso informar um index que n�o existe -> retorna erro;
			
		int tam = nomes.size();     //atribuindo a uma variavel o tam daquela list;
		System.out.println(tam);    //2
		System.out.println(nomes.size()); //2, retorna o tam daquela list;
				
		boolean temFernanda = nomes.contains("Fernanda");//atribui a uma variavel boolean o retorno de se tem ou n�o aquele elem na list
		System.out.println(temFernanda); //true
		System.out.println(nomes.contains("Fernanda")); //true, retorna um booelan informando se tem ou n�o aquele elem na list
		System.out.println(nomes.contains("William"));  //false, pois n�o tem esse elem na list;
		//Retornos: "true" -> se tiver/constar o elem | "false" -> se N�O tiver o elem.
		
		boolean listaEstaVazia = nomes.isEmpty(); //atribui um retorno boolean se a lista est� ou n�o vazia;
		System.out.println(listaEstaVazia);       //false
		System.out.println(nomes.isEmpty());      //false, retorno boolean se a lista est� ou n�o vazia;
		//Retornos: "true" -> se a lista estiver vazia | "false" -> se N�O estiver vazia.
		
		//utilizar o for each para navegar entre os elem da lista
		for(String i : nomes) {
			System.out.println(i);   //Fernanda
		}							 //Maria
		
		//precisa importar o java.util.Iterator;
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) {  //hasNext -> retorna um boolean se existe ou n�o um pr�ximo elem na lista
			System.out.println(iterator.next()); //Fernanda
		}										 //Maria
				
		
		List<String> nomes2 = new ArrayList<>(); //criei uma nova lista
		
		nomes2.add("Ismael");	   //adicionei os seguintes elem
		nomes2.add("Rodrigo");
		
		for(String i : nomes2) {
			nomes.add(i);	       //adicionei os elem da lista 2 na lista 1;
		}
		System.out.println(nomes); //[Fernanda, Maria, Ismael, Rodrigo]
		
		Collections.sort(nomes);   //ordenei a lista 1
		System.out.println(nomes); //[Fernanda, Ismael, Maria, Rodrigo]
		
		nomes.clear(); //limpar a lista inteira;
		nomes2.clear();
	}

}
