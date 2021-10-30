/* Dado o seguinte array: int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125}; 
 - A. Retorne somente com números pares 
 - B. Retorne somente com os números ímpares * 2 */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125}; 
		
		for(int i : array2) {
			if(i%2 == 0) System.out.println("Par: " + i);
			else System.out.println("Ímpar: " + i + "x2 = " + i*2);
		}		
	}
}
