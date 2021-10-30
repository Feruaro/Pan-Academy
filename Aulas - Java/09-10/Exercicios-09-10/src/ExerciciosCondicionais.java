import java.util.Scanner;

public class ExerciciosCondicionais {

	public static void main(String[] args) {
		
		// 1. Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor. 
		
		Scanner scan = new Scanner(System.in);
		int num, me = 0, ma = 0;
		
		for(int i=0; i<3; i++) {
			System.out.printf("Informe o valor %d: ", i+1);
			num = scan.nextInt();
			
			if(i == 0 || num > ma) ma = num;
			if(i == 0 || num < me) me = num;								
		}
		
		scan.close();	
		System.out.println("Menor: " + me + "\nMaior: " + ma);
		
	}

}
