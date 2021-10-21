package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosStreamAPI {
	
	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Fernanda");
		estudantes.add("William");
		estudantes.add("Ana Clara");
		estudantes.add("Matheus");
		estudantes.add("Guilherme");
		estudantes.add("Júlia");
		estudantes.add("Isadora");
		
		System.out.println("Contagem: " + estudantes.stream().count());  //Contagem: 7, retorna um long com a contagem de elem 
		
		                                                                       //vai ordenar de acordo com o tam de letras, qntd
		System.out.println("Maior número de lera: " + estudantes.stream().max(Comparator.comparingInt(String::length)));  //Maior número de lera: Optional[Ana Clara], max: retorna o maior
		System.out.println("Menor número de lera: " + estudantes.stream().min(Comparator.comparingInt(String::length)));  //Menor número de lera: Optional[Júlia]
		
																			//filter: recebe uma regra (lambda) que retorna um boolean, resultado: uma coleção contendo somente os elem que contém true
		System.out.println("Com a letra 'r' no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList())); 
		//Com a letra 'r' no nome: [Fernanda, Ana Clara, Guilherme, Isadora]
		
		                                                                      //map: retorna uma nova coleção com a mesma qtnd de elem e contendo a regra de negócio, lambda
		System.out.println("Retorna uma nova coleção com a quatidade de letras: " + estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		//Retorna uma nova coleção com a quatidade de letras: [Fernanda - 8, William - 7, Ana Clara - 9, Matheus - 7, Guilherme - 9, Júlia - 5, Isadora - 7]
		
		System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
		//Retorna os 3 primeiros elementos: [Fernanda, William, Ana Clara]
		
		                                                                    //peek: executa item por item e depois retorna a mesma coisa
		System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
		//primeiro retornou os elementos um por um
		//Retorna os elementos: [Fernanda, William, Ana Clara, Matheus, Guilherme, Júlia, Isadora]
		
		System.out.println("Retorna os elementos novamente: ");
		estudantes.stream().forEach(System.out::println); //apenas executa para cada elem
		//retornou os elementos um por um
		
		//allMatch: retorna um boolean | caso TODOS os elementos retornarem true, o método retorna true. Caso ALGUM elem retorne false, o método retorna false
		System.out.println("Todos os elementos tem W no nome? " + estudantes.stream().allMatch((elemento -> elemento.contains("W")))); 
		//Todos os elementos tem W no nome? false
		
		//anyMatch: retorna um boolean | caso ALGUM dos elementos retornar true, o método retorna true. Caso TODOS os elem retornarem false, o método retorna false
		System.out.println("Tem algum elemento com 'a' minusculo no nome? " + estudantes.stream().anyMatch((elemento -> elemento.contains("a")))); 
		//Tem algum elemento com 'a' minusculo no nome? true
		
		//noneMatch: retorna um boolean | caso TODOS dos elementos retornarem false, o método retorna true. Caso ALGUM dos elem retornar true, o método retorna false
		System.out.println("Não tem nenhum elemento com 'a' minusculo no nome? " + estudantes.stream().noneMatch((elemento -> elemento.contains("a")))); 
		//Não tem nenhum elemento com 'a' minusculo no nome? false
		
		System.out.println("Retorna o primeiro elemento da coleção: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);  //Fernanda
		
		
		
	}
}
