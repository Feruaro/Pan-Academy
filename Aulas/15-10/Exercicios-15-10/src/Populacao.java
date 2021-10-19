/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00. */

import java.util.Scanner;

public class Populacao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double salario = 0, totalSalario = 0;
		double maiorSalario = 0, salarioMenorCem = 0; 
		int filhos = 0;
		
		System.out.print("Digite a quantidade de pessoas pesquisadas: ");
		int pessoas = scan.nextInt();
		
		for(int i=0; i<pessoas; i++) {
			System.out.printf("\nInforme o sal�rio da pessoa %d: ", i+1);
			salario = scan.nextDouble();	
			System.out.printf("Informe o numero de filho da pessoa %d : ", i+1);
			filhos += scan.nextDouble();
			
			totalSalario += salario;
			if(salario > maiorSalario || i == 0) maiorSalario = salario;
			if(salario <= 100.00) salarioMenorCem++;			
		}
		scan.close();
		
		System.out.print("\n\n------------ Exibindo resultados da pesquisa ------------\n\n");
		System.out.printf("M�dia do sal�rio da popula��o: R$ %.2f \n", (totalSalario / pessoas));
		System.out.printf("Maior sal�rio: R$ %.2f \n", maiorSalario);
		System.out.printf("M�dia da quantidade de filhos: %.2f \n", (double) filhos / pessoas);
		System.out.printf("O percentual de pessoas com sal�rio menor que R$ 100,00: %.2f %%", (salarioMenorCem * 100 / pessoas));	
				
	}

}
