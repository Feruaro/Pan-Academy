package br.com.estudosfe.exceptions;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		DecimalFormat deci = new DecimalFormat("0.00");
		Integer opcao = 0;
		
		do {
			
			try {
				
				String a = JOptionPane.showInputDialog("Informe numerador: ");
				if(a == null) break;    //caso o usu�rio clique em "cancelar" ou no "fechar"  =  sai do la�o, do contr�rio entra em loop
				 
				String b = JOptionPane.showInputDialog("Informe denominador: ");
				if(b == null) break;
				
				JOptionPane.showMessageDialog(null, "Resultado = " +  deci.format(Float.parseFloat(a) / Float.parseFloat(b)));
				
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? \n1-Sim \n2-N�o \nDigite sua op��o: "));
				
			} catch(NumberFormatException e) {                                                                                                                                                 
				JOptionPane.showMessageDialog(null, "Inv�lido! Digite um n�mero..");
			} catch(ArithmeticException ae){    
				JOptionPane.showMessageDialog(null, "Imposs�vel dividir por 0! Tente novamente..");
			} finally {
//				JOptionPane.showMessageDialog(null, "Chegou no finally");
			}
			
		}while(continuar(opcao));

	}

	private static boolean continuar(Integer opcao) {
		boolean retorno = false;
		
		if(opcao == 1) retorno = true;
		
		return retorno;
	}

}
