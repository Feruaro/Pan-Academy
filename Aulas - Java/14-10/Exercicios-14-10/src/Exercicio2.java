// 2. Criar um programa que: (Tente utilizar a estrutura do while)
//  OK- enquanto estiver recebendo n�meros positivos, imprime no console a soma dos n�meros inseridos;
//  OK- caso receba um n�mero negativo, encerre o programa. 

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, soma = 0;
		
		do {			
			System.out.println("Informe um n�mero:");
			num = scan.nextInt();
			
			if(num >= 0){ 
				System.out.println("\n----- Somando os n�meros -----");
				System.out.println("Soma dos n�meros: " + (soma += num));
				System.out.println("------------------------------\n");
			}			
		}while(num >= 0);
			
		scan.close();

	}

}
