import java.util.Scanner;

public class ExerciciosCondicionais2 {

	public static void main(String[] args) {
		
		/* 2. Escreva um programa para ler o ano de nascimento de uma pessoa e 
	          escrever uma mensagem que diga se ela poderá ou não votar este ano 
	          (não é necessário considerar o mês em que ela nasceu). */
	
		Scanner scan = new Scanner(System.in);
		int idade;
		
		do {
			System.out.print("Informe seu ano de nascimento: ");
			idade = 2021 - scan.nextInt(); 
		}while(idade <= 0);		
		
		scan.close();
	
		if(idade >= 18 && idade <=70) {
			System.out.println("Voto obrigatório! \nIdade: " + idade);
		} else if(idade >= 16 || idade > 70) {
			System.out.println("Voto opcional! \nIdade: " + idade);
		} else {
			System.out.println("Ainda não pode votar! \nIdade: " + idade);
		}

	}

}
