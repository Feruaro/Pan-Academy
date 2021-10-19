package animais;

public class Passaro extends Animal {
	
	private String raca;
	private String cor;
	
	public Passaro(String comida, String raca, String cor) {
		this.setComida(comida);
		this.raca = raca;
		this.cor = cor;
	}
	
	@Override
	public void Comunicar() {
		System.out.println("piu piu piu");
	}
	
	@Override
	public void Movimentar() {
		System.out.println("Pássaro voando..");
	}
	
	@Override
	public void Comer() {
		System.out.println("Pássaro comendo " + this.getComida());
	}

	@Override
	public void Status() {
		System.out.println("\n----- Pássaro -----\n" +
					       "Raça: " + this.raca +
						   "\nCor: " + this.cor);
	}
}
