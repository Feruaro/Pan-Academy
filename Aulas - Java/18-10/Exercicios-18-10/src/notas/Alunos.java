package notas;

public class Alunos {
	 
	private String nome;
	private double[] notas;
	
	public Alunos(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
		
		Media();
	}

	public String getNome() {
		return nome;
	}

	public double[] getNotas() {
		return notas;
	}
	
	public String VerificaAprovacao(double media) {
		
		return (media >= 7) ? "Aprovado! Parabénss" : "Reprovado!";
	}
	
	public boolean MaiorNota(double nota, double maior) {		
		
		return (nota > maior) ? true : false;
	}
	
	public void Media() {
		double soma = 0, maior = 0;
		
		for(double i : this.getNotas()) {
			soma += i;			
			if(MaiorNota(i, maior)) maior = i;
		}
		
		ImprimirDados(soma);
	}
	
	public void ImprimirDados(double soma) {
		
		System.out.println("----- Resultados do Aluno -----\n");		
		System.out.println("Nome: " + this.getNome());
		System.out.printf ("Média: %.2f\n" , soma /= this.getNotas().length);
		System.out.println(VerificaAprovacao(soma));
		System.out.println("\n-------------------------------\n");
	}
}
