import java.util.Scanner;

public class ExerciciosCondicionais4 {

	public static void main(String[] args) {
		/* 4. Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
		      A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			  A mensagem "Reprovado", se a média for menor do que sete;
			  A mensagem "Aprovado com Distinção", se a média for igual a dez. */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a nota 1 e nota 2: ");
		float media = (scan.nextFloat() + scan.nextFloat()) / 2;		
		scan.close();
		
		if(media >= 7) {
			System.out.printf("Aprovado \nMédia: %.2f", media);
			if(media == 10) System.out.printf(" com distinção \nMédia: %.2f", media);
		} else {
			System.out.printf("Reprovado \nMédia: %.2f", media);
		}
		
	}

}
