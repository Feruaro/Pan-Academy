/* 1. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
	OK- Armazene um número aleatório em uma variável. 
	OK- O jogador tem 10 tentativas para adivinhar o número gerado. 
	OK- Ao final de cada tentativa: 
    	OK- imprima a quantidade de tentativas restantes;
        OK- imprima se o número inserido é maior ou menor do que o número armazenado.
    * Caso deseje, utilize o método Random() da coleção java util para sortear o número:
    OK- import java.util.Random; Random numeroAleatorio = new Random(); */

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
        int numAle = random.nextInt(100), num;
        
        for(int i=10; i>0;) {
        	System.out.println("Digite o número:");
        	num = scan.nextInt();
        	
        	if(num == numAle) {
        		System.out.println("Você acertou!! Parabéns");
        		break;
        	} else {
        		System.out.println("Tentativas restantes: " + --i);
        		System.out.println("Número informado é " + ((num > numAle)? "maior" : "menor"));
        		System.out.println("\n-----------------------------\n");
        		if(i==0) {
        			System.out.println("O número que você devia adivinhar era " + numAle);
        		}
        	}
        }
        scan.close();       
        
	}

}
