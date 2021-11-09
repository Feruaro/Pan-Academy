package br.com.estudosfe.exceptions.personalizadas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionsPersonalizadas {
	
	public static void main(String[] args) {
		
		String nomeDoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
			
		imprimirArquivoConsole(nomeDoArquivo);
		System.out.println("\nPrograma continua...");
		
	}

	private static void imprimirArquivoConsole(String nomeDoArquivo) {
		
		try {
			BufferedReader br = lerArquivo(nomeDoArquivo);          		
			String line = br.readLine();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			do {
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}while(line != null);
			
			bw.flush();
			br.close();
		} catch(ImpossivelAberturaDeArquivoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
//			e.printStackTrace();
		} catch(NullPointerException e){
			JOptionPane.showMessageDialog(null,"Arquivo vazio. Por favor verifique e tente novamente!\n" + e.getMessage());
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Por favor revise o nome do arquivo que deseja imprimir\n" + e.getMessage());
		} 
		
	}

	private static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
		try {
			return new BufferedReader(new FileReader(nomeDoArquivo));
		} catch (FileNotFoundException e) {
			throw new ImpossivelAberturaDeArquivoException(nomeDoArquivo);
		}
	}
	
}


//CLASSE DE EXCEPTION PERSONALIZADA
class ImpossivelAberturaDeArquivoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String nomeArquivo;
	
	public ImpossivelAberturaDeArquivoException(String nomeArquivo) {
		super("O arquivo " + nomeArquivo + " não foi encontrado!");
		this.nomeArquivo = nomeArquivo; 
	}

	@Override
	public String toString() {
		return "ImpossivelAberturaDeArquivoException [nomeArquivo=" + nomeArquivo + "]";
	}	
	
}

