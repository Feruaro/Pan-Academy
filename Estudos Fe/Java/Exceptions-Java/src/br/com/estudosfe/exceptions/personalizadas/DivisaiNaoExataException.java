package br.com.estudosfe.exceptions.personalizadas;

public class DivisaiNaoExataException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
//	private int numerador;
//	private int denominador;

	public DivisaiNaoExataException(String message) {
		super(message);
	}
	
	public DivisaiNaoExataException() {
		super("Divisão não exata!");
	}
	
	
}
