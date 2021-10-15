//3. Criar um programa que receba uma palavra e em seguida imprime no console letra por letra.

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = scan.nextLine();
		scan.close();
		
		String letra[] = palavra.split("");
		
		for(int i=0; i<palavra.length(); i++) {
			System.out.println(letra[i]);
		}
		
	}

}
