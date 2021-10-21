package ExercicioFixacaoComparators;

import java.util.Comparator;

public class ProdutoComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getValor() - o2.getValor(); 
	}

}
