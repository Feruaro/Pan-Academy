import java.util.InputMismatchException;
import java.util.Scanner;

public class TabuadaTratamentoException {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer op;
		
		System.out.println("----- Menu Tabuada -----" +
						 "\n1- Calcular tabuada" +
						 "\n2- Sair" +
						 "\nDigite sua opção: ");		

		try {
			op = scan.nextInt();
			if(op == 1) {
				calcularTabuada(scan);
			}
		} catch (InputMismatchException ime) {
			System.err.println("Digite um número");
		} finally {
			scan.close();
		}	
		
				
	}

	private static void calcularTabuada(Scanner scan) {
		System.out.println("Digite o número que deseja calcular a tabuada: ");
		Integer num;
		try {
			num = scan.nextInt();
			System.out.println("----- Tabuada do " + num + " -----\n\n");
			for(int i=1; i<=10; i++) {
				System.out.println(i + " x " + num + " = " +(i*num));
			}
		} catch (InputMismatchException ime) {
			System.out.println("Informe um número");
		}				
		
	}
	
	
}
