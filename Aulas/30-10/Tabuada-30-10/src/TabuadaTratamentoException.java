import javax.swing.JOptionPane;

public class TabuadaTratamentoException {
	
	public static void main(String[] args) {
		
		while(true) {			
			try {
				String op = menuPrincipal(); 
				if(op == null) break;
 				Integer opcao = Integer.parseInt(op);
				
				if(opcao == 1) {
					String n = JOptionPane.showInputDialog("Informe o número que você deseja calcular");
					Integer num = Integer.parseInt(n);
					calcularTabuada(num);
				} else if(opcao == 2) {
					JOptionPane.showMessageDialog(null, "Saindo...");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente digitando 1 ou 2");
				}
				
			} catch (NumberFormatException nfe) {				
				JOptionPane.showMessageDialog(null, "Digite um número");
			} 
		}
										
	}

	private static String menuPrincipal() {
		String resp = JOptionPane.showInputDialog("---- Menu Inicial ----" +
		                                        "\n1- Calcular tabuada" +
												"\n2- Sair" +
		                                        "\nDigite sua opção: ");
		return resp;
	}

	private static void calcularTabuada(Integer num) {		
		String tabuada = "    Tabuada do " + num;		
		for(int i=1; i<=10; i++) {
			tabuada += ("\n" + i + " x " + num + " = " + (i*num));
		}
		JOptionPane.showMessageDialog(null, tabuada);
	}
	
}
