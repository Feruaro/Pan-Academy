import java.util.InputMismatchException;
import java.util.Scanner;

public class TabuadaTratamentoException {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("\n----- Menu Tabuada -----" +
					 		 "\n1- Calcular tabuada" +
					         "\n2- Sair" +
					         "\nDigite sua op��o: ");
			try {
				Integer op = scan.nextInt();
				if(op == 1) {
					System.out.print("\nDigite o n�mero que deseja calcular a tabuada: ");
					Integer num = scan.nextInt();
					System.out.println("\n----- Tabuada do " + num + " -----\n");
					for(int i=1; i<=10; i++) {
						System.out.println(i + " x " + num + " = " +(i*num));
					}
				} else if(op == 2) {
					break;
				} else {
					System.out.println("Op��o inv�lida! Tente novamente!");
				}
			} catch (InputMismatchException ime) {
				System.err.println("Digite um n�mero");
				scan.next();     //limpar o buffer 
			} 
		}
		
		scan.close();
						
	}	
	
}
