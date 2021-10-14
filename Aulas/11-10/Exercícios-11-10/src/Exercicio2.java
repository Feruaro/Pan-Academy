import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/* 2)	Faça um  algoritmo que escreva as seguintes mensagens :
				− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
				− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de lados da figura: ");
		int lados = scan.nextInt();
		scan.close();
		
		if(lados < 3)
			System.out.println("NÃO É UM POLÍGONO");
		else if (lados > 5) 
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		
	}

}
