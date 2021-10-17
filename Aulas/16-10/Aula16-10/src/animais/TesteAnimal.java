/* - Crie uma estrutura de heren�a para demonstrar o polimorfismo utilizando classes de animais;
- Crie o m�todo comunicar() e movimentar() na classe animal
- Nas classes descendentes de animais, sobrescreva os m�todos citados de acordo com os tipos de animais */

package animais;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("carne", "Pastor Alem�o", 4);
		Peixe fish = new Peixe ("ra��o", "Betta", 20);
		Passaro bird = new Passaro("alpiste", "Can�rio", "Amarelo");
		
		dog.Status();
		dog.Comer();
		dog.Comunicar();
		dog.Movimentar();
		
		fish.Status();
		fish.Comer();
		fish.Comunicar();
		fish.Movimentar();
		
		bird.Status();
		bird.Comer();
		bird.Comunicar();
		bird.Movimentar();
		
	}
}
