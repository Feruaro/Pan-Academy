// 2. Criar um programa que: (Tente utilizar a estrutura do while)
//  OK- enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos;
//  OK- caso receba um número negativo, encerre o programa. 

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, soma = 0;
		
		do {			
			System.out.println("Informe um número:");
			num = scan.nextInt();
			
			if(num >= 0){ 
				System.out.println("\n----- Somando os números -----");
				System.out.println("Soma dos números: " + (soma += num));
				System.out.println("------------------------------\n");
			}			
		}while(num >= 0);
			
		scan.close();

	}

}
