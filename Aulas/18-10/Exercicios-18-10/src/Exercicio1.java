/* Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 }; 
  - A. Retorno o valor total da soma de todos os elementos com foreach; 
  - B. Retorne a média de todos os elementos C. Retorne o maior valor e o menor elemento; */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int soma = 0, maior = 0, menor = array[0];
				
		for(int i : array) {
			soma += i;
			
			if(i > maior) maior = i;
			if(i < menor) menor = i;
		}
		
		System.out.println("----- Imprimindo os resultados -----\n");
		System.out.println("Soma: "  + soma);
		System.out.println("Média: " + (double) soma / array.length);
		System.out.println("Maior número: "  + maior);
		System.out.println("Menor número: "  + menor);
		
	}
}
