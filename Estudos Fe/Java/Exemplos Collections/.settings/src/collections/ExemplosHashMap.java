package collections;

import java.util.HashMap;
import java.util.Map;

public class ExemplosHashMap {

	public static void main(String[] args) {

		//implementa a interface Map
		//K =  key(chave)   | V = value(valor)
		
		Map<String, Integer> campeosMundialFifa = new HashMap<>();
		
		campeosMundialFifa.put("Brasil", 5);     //put(chave, valor) = adiciona um elem
		campeosMundialFifa.put("Alemanha", 4);
		campeosMundialFifa.put("Itália", 4);
		campeosMundialFifa.put("Uruguai", 2);
		campeosMundialFifa.put("Argentina", 2);
		campeosMundialFifa.put("França", 2);
		campeosMundialFifa.put("Inglaterra", 1);
		campeosMundialFifa.put("Espanha", 1);
		
		System.out.println(campeosMundialFifa);  //{Brasil=5, Itália=4, Argentina=2, Inglaterra=1, França=2, Uruguai=2, Espanha=1, Alemanha=4}
		
		campeosMundialFifa.put("Brasil", 6);     //atualiza o valor (6) através da chave (Brasil)
		System.out.println(campeosMundialFifa);  //{Brasil=6, Itália=4, Argentina=2, Inglaterra=1, França=2, Uruguai=2, Espanha=1, Alemanha=4}
		
		System.out.println(campeosMundialFifa.get("Argentina")); //2, retorna o valor através da chave (Argentina)
		
		System.out.println(campeosMundialFifa.containsKey("França")); //true, retorna um boolean se o existe aquela chave
		System.out.println(campeosMundialFifa.containsValue(6)); //true, retorna um boolean se o existe aquele valor
		
		campeosMundialFifa.remove("França");    //remove através chave (França)
		System.out.println(campeosMundialFifa); //{Brasil=6, Itália=4, Argentina=2, Inglaterra=1, Uruguai=2, Espanha=1, Alemanha=4}
		
		System.out.println(campeosMundialFifa.size());  //7, retorna tam do map 
				
		//navegar nos registros do mapa -> através do entrySet() que possuem os métodos get e set
		for(Map.Entry<String, Integer> entry : campeosMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		//navegar nos registros do mapa -> através do keySet(), como só navega pela chave, usar o get para retornar o valor
		//menos performático
		for(String key : campeosMundialFifa.keySet()) {
			System.out.println(key + " -- " + campeosMundialFifa.get(key));
		}
		
		
		
	}

}
