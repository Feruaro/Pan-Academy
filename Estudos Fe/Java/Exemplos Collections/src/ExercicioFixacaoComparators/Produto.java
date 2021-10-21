package ExercicioFixacaoComparators;

public class Produto implements Comparable<Produto>{
	
	//controle de estoque de produtos de maquiagem
	
	private final String nome;
	private final Integer qntd;

	public Produto(String nome, Integer qntd) {
		super();
		this.nome = nome;
		this.qntd = qntd;
	}
	
	public String getNome() { return nome; }

	public Integer getValor() { return qntd; }

	@Override
	public String toString() {
		return getNome() + " - " + getValor();
	}

	@Override
	public int compareTo(Produto o) {
		return this.getValor() - o.getValor();
	}

	
	
	
	
	
	
}
