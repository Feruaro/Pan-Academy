package br.com.estudosfe.exceptions.personalizadas;

import javax.swing.JOptionPane;

public class ExceptionsPersonalizadas2 {
	
	public static void main(String[] args) {
		
		int [] numerador = {6, 5, 8, 3};
		int [] denominador = {3, 4, 4, 0, 9};
		
		for(int i=0; i<denominador.length; i++) {
			
			try {
				
				if(denominador[i] == 0) 
					throw new ImpossivelDividirPorZero();

				if(numerador[i]%2 != 0) 
					throw new DivisaiNaoExataException();

				int resultado = numerador[i] / denominador[i];
				System.out.println(resultado);
				
			}  catch (ImpossivelDividirPorZero | DivisaiNaoExataException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch(ArrayIndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Não é possível fazer a divisão com o numerador ou denominador nulo!");
			}
		}
		
		System.out.println("\nPrograma continua mesmo com as exceptions...");

	}
}

class ImpossivelDividirPorZero extends Exception {

	private static final long serialVersionUID = 1L;

	public ImpossivelDividirPorZero() {
		super("Não é possível dividir por zero");
	}
	
	
}

