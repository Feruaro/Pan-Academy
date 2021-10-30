package animais;

public class Peixe extends Animal {
	
	private String raca;
	private float peso;
	
	public Peixe(String comida, String raca, float peso) {
		this.setComida(comida);
		this.raca = raca;
		this.peso = peso;
	}
	
	@Override
	public void Comunicar() {
		System.out.println("glub glub glub");
	}
	
	@Override
	public void Movimentar() {
		System.out.println("Peixe nadando..");
	}
	
	@Override
	public void Comer() {
		System.out.println("Peixe comendo " + this.getComida());
	}

	@Override
	public void Status() {
		System.out.println("\n----- Peixe -----\n" +
						   "Raça: " + this.raca +
						   "\nPeso: " + this.peso + " gramas");
	}
}
