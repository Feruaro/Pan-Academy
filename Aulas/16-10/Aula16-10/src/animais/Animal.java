package animais;

public class Animal {
	
	private String comida;
	
	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public void Comunicar() {
		System.out.println("Animal se comunicando..");
	}
	
	public void Movimentar() {
		System.out.println("Animal se movimentando..");
	}
	
	public void Comer() {
		System.out.println("Animal comendo " + this.comida);
	}

	public void Status() {
		System.out.println("\n----- Animal -----\n");
	}
	
	
	

}