package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {
		
		//ordena��o bin�ria, n�o ordena necessariamente da forma que � add os valores;
		TreeMap<String, String> treeCapitais = new TreeMap<>();
		
		treeCapitais.put("RS", "Porto Alegre");		  //adicionar elem | n�o garante a ordem
		treeCapitais.put("SC", "Florian�polis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "S�o Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("MG", "Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		System.out.println(treeCapitais.firstKey());  //MG, retorna a primeira chave
		System.out.println(treeCapitais.lastKey());   //SP, retorna a �ltima chave
		
		System.out.println(treeCapitais.lowerKey("SC"));  //RS, retorna a primeira chave abaixo na �rvore da chave parametrizada
		System.out.println(treeCapitais.higherKey("SC")); //SP, retorna a primeira chave acima na �rvore da chave parametrizada
		
		System.out.println(treeCapitais.firstEntry().getKey());	//MG, retorna a primeira chave, atrav�s do m�todo entry
		System.out.println(treeCapitais.lastEntry().getKey());  //SP, retorna a �ltima chave, atrav�s do m�todo entry

		System.out.println(treeCapitais.lowerEntry("SC").getKey() + " -- " + treeCapitais.lowerEntry("SC").getValue());   //RS -- Porto Alegre
		System.out.println(treeCapitais.higherEntry("SC").getKey() + " -- " + treeCapitais.higherEntry("SC").getValue()); //SP -- S�o Paulo
		
		System.out.println(treeCapitais.pollFirstEntry());  //MG=Belo Horizonte, retorna e remove o primeiro elem (chave e valor)
		System.out.println(treeCapitais.pollLastEntry());	//SP=S�o Paulo, retorna e remove o �ltimo elem (chave e valor)
		
		System.out.println(treeCapitais);  //{PR=Curitiba, RJ=Rio de Janeiro, RS=Porto Alegre, SC=Florian�polis}
				
		//Formas de nagevar em um TreeMap:
		
		Iterator<String> iterator = treeCapitais.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " -- " + treeCapitais.get(key));
		}
		
		for(String i : treeCapitais.keySet()) {
			System.out.println(i + " -- " + treeCapitais.get(i));
		}
		
		for(Map.Entry<String, String> i : treeCapitais.entrySet()) {
			System.out.println(i.getKey() + " -- " + i.getValue());
		}
		
		System.out.println(treeCapitais.containsKey("SC"));   //true
		System.out.println(treeCapitais.containsValue("Maranh�o"));  //false
		
	}

}
