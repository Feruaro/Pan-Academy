
public class ImpostoRenda {

	public static void main(String[] args) {
		
		double salario = 2000;
		
		if(salario <= 2500) {
			System.out.println("Você precisa contribuir com 15%");
		} else if(salario <= 3800) {
			System.out.println("Você precisa contribuir com 18%");
		} else {
			System.out.println("Você precisa contribuir com 20%");
		}

	}

}
