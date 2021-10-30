/* - Crie uma estrutura de herença para demonstrar o polimorfismo utilizando classes de animais;
- Crie o método comunicar() e movimentar() na classe animal
- Nas classes descendentes de animais, sobrescreva os métodos citados de acordo com os tipos de animais */

package animais;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("carne", "Pastor Alemão", 4);
		Peixe fish = new Peixe ("ração", "Betta", 20);
		Passaro bird = new Passaro("alpiste", "Canário", "Amarelo");
		
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
