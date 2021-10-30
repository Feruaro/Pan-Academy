/* Calcular média de N alunos.
OK - Notas válidas: entre 0 e 10;
OK - Contar quantas notas válidas foram digitadas;
OK - Usuário deve digitar -1 para sair do programa e ser informado da sua média e quantidade de notas; */

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		int qntdNotas = 0;
		double nota = 0, media = 0;
		
		while(true) {						
			System.out.println("Informe a nota (Para sair digite -1):");
			nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10){ 
				qntdNotas++; 
				media += nota;				
			} else if(nota == -1) {
				System.out.println("\n---- Calculando média -----\n");
				System.out.printf("Média: %.2f \nQuantidade total de notas: %d", (media /= qntdNotas), qntdNotas);
				break;
			} else{
				System.out.println("Nota inválida. Tente novamente!");	
			}			
		}		
		scan.close();		
					
	}

}
