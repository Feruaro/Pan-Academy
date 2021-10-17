package animais;

public class Cachorro extends Animal {
	
	private String raca;
	private int qntdPatas;
	
	public Cachorro(String comida, String raca, int qntdPatas) {
		this.setComida(comida);
		this.raca = raca;
		this.qntdPatas = qntdPatas;
	}

	@Override
	public void Comunicar() {
		System.out.println("Au Au Au Au");
	}
	
	@Override
	public void Movimentar() {
		System.out.println("Cachorro correndo..");
	}
	
	@Override
	public void Comer() {
		System.out.println("Cachorro comendo " + this.getComida());
	}

	@Override
	public void Status() {
		System.out.println("\n----- Cachorro -----\n" +
						   "Raça: " + this.raca +
						   "\nQntd. patas: " + this.qntdPatas);
	}
}
