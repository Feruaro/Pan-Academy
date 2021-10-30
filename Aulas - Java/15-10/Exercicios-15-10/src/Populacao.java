/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00. */

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
			System.out.printf("\nInforme o salário da pessoa %d: ", i+1);
			salario = scan.nextDouble();	
			System.out.printf("Informe o numero de filho da pessoa %d : ", i+1);
			filhos += scan.nextDouble();
			
			totalSalario += salario;
			if(salario > maiorSalario || i == 0) maiorSalario = salario;
			if(salario <= 100.00) salarioMenorCem++;			
		}
		scan.close();
		
		System.out.print("\n\n------------ Exibindo resultados da pesquisa ------------\n\n");
		System.out.printf("Média do salário da população: R$ %.2f \n", (totalSalario / pessoas));
		System.out.printf("Maior salário: R$ %.2f \n", maiorSalario);
		System.out.printf("Média da quantidade de filhos: %.2f \n", (double) filhos / pessoas);
		System.out.printf("O percentual de pessoas com salário menor que R$ 100,00: %.2f %%", (salarioMenorCem * 100 / pessoas));	
				
	}

}
