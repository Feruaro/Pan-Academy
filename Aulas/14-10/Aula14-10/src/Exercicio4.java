//4. OK- Crie um programa que recebe 10 valores e ao final imprima o maior número;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		 	
		Scanner scan = new Scanner(System.in);		
		int num, maior = 0;
		
		for(int i=0; i<10; i++) {
			System.out.printf("Informe o número %d: ", i+1);
			num = scan.nextInt();
			
			if(i == 0 || num > maior) { maior = num; }
		}
		scan.close();
		System.out.println("O maior número dentre os números informados é " + maior);

	}

}
