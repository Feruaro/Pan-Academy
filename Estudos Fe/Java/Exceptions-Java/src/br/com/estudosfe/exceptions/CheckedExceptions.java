package br.com.estudosfe.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedExceptions {
	
	public static void main(String[] args) {
		
		String nomeDoArquivo = "teste-exceptions.txt";
		
		try {
			imprimirArquivoConsole(nomeDoArquivo);
		} catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "O arquivo está vazio\n" + e.getMessage());
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, entre em contato com o suporte\n" + e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Por favor revise o nome do arquivo que deseja imprimir\n" + e.getMessage());
		} 
		
		System.out.println("Programa continua...");
		
	}

	private static void imprimirArquivoConsole(String nomeDoArquivo) throws IOException {
		File file = new File(nomeDoArquivo);
		
		BufferedReader br = new BufferedReader(new FileReader(file.getName()));          		
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			
			bw.write(line);
			bw.newLine();
			line = br.readLine();
			
		}while(line != null);
		
		bw.flush();
		br.close();
	}
}
