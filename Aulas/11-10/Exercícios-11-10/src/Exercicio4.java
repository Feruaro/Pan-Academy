import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		//4) As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze.
		//   Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		System.out.println("Informe a quantidade de ma�as: ");
		int qntd = scan.nextInt();		
		scan.close();
		
		double valor = (qntd < 12)? 0.30: 0.25;
		
		System.out.println("Quantidade de ma�as: " + qntd + "\nValor total: " + deci.format(qntd * valor));
		
	}
}
