/* Calcular m�dia de N alunos.
OK - Notas v�lidas: entre 0 e 10;
OK - Contar quantas notas v�lidas foram digitadas;
OK - Usu�rio deve digitar -1 para sair do programa e ser informado da sua m�dia e quantidade de notas; */

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
				System.out.println("\n---- Calculando m�dia -----\n");
				System.out.printf("M�dia: %.2f \nQuantidade total de notas: %d", (media /= qntdNotas), qntdNotas);
				break;
			} else{
				System.out.println("Nota inv�lida. Tente novamente!");	
			}			
		}		
		scan.close();		
					
	}

}
