import java.util.Scanner;

public class Exercício3 {
	
	public static void main(String[] args) {
		
		/* 3)	Escreva um programa que leia as medidas dos lados de um triângulo:
			− Triângulo Equilátero: possui os 3 lados iguais.
			− Triângulo Isóscele: possui 2 lados iguais.
			− Triângulo Escaleno: possui 3 lados diferentes. */
		
		Scanner scan = new Scanner(System.in);
		int lados[] = new int[3];
		
		for(int i=0; i<lados.length; i++) {
			System.out.printf("Informe a medida do lado %d: ", i+1);
			lados[i] = scan.nextInt();
		}
		scan.close();
		
		if(lados[0] == lados[1]) {
			if(lados[0] == lados[2])
				System.out.println("Triângulo Equilátero");
			else 
				System.out.println("Triângulo Isóscele");				
		} else {
			System.out.println("Triângulo Escaleno");
		}		
		
	}
}
