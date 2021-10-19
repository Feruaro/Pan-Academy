import java.util.Scanner;

public class ExerciciosCondicionais3 {

	public static void main(String[] args) {
		
		/* Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234.
		   Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO (caso a senha seja válida)  /  ACESSO NEGADO (caso a senha seja inválida). */
		
		Scanner scan = new Scanner(System.in);		
		int senha = 1234, senhaUsuario;
		
		do {		
			System.out.print("Informe a senha: ");
			senhaUsuario = scan.nextInt();
			if(senha != senhaUsuario) System.out.println("Acesso negado\n");
			
		}while (senha != senhaUsuario);
				
		scan.close();
		System.out.println("Acesso permitido");
		
			
		
			
		
		
		

	}

}
