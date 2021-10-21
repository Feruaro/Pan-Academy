package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosFixacaoStreamAPI {

	public static void main(String[] args) {
		
		//Utilizando uma lista de com objeto complexo realize as seguintes operações:
		
		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Fernanda", 22));
		estudantes.add(new Estudante("William", 28));
		estudantes.add(new Estudante("Joãozinho", 26));
		estudantes.add(new Estudante("Alexandre", 14));
		estudantes.add(new Estudante("Jonas", 18));
		
		//Conte a quantidade de estudantes tem na colecao	
		System.out.println("Quantidade de estudantes: " + estudantes.stream().count());  //Quantidade de estudantes: 5
		
		
		
		
	}

}
