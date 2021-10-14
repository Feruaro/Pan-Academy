import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/* 1)	Escreva um programa que leia o valor de 3 ângulos de um triângulo: 
                − Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
                − Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o)
                − Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o) */
		
		
		Scanner scan = new Scanner(System.in);
		int ang[] = new int[3];
		
		for(int i=0; i<ang.length; i++) {
			System.out.printf("Informe o ângulo %d: ", i+1);
			ang[i] = scan.nextInt(); 
		}				
		scan.close();
		
		if(ang[0] == 90 || ang[1] == 90 || ang[2] == 90)
			System.out.println("Triângulo Retângulo");
		else if(ang[0] > 90 || ang[1] > 90 || ang[2] > 90)
			System.out.println("Triângulo Obtusângulo");
		else if(ang[0] < 90 && ang[1] < 90 && ang[2] < 90)
			System.out.println("Triângulo Acutângulo");
		
	}
}
