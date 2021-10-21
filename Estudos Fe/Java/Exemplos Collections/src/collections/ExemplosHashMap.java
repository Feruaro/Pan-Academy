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
		campeosMundialFifa.put("It�lia", 4);
		campeosMundialFifa.put("Uruguai", 2);
		campeosMundialFifa.put("Argentina", 2);
		campeosMundialFifa.put("Fran�a", 2);
		campeosMundialFifa.put("Inglaterra", 1);
		campeosMundialFifa.put("Espanha", 1);
		
		System.out.println(campeosMundialFifa);  //{Brasil=5, It�lia=4, Argentina=2, Inglaterra=1, Fran�a=2, Uruguai=2, Espanha=1, Alemanha=4}
		
		campeosMundialFifa.put("Brasil", 6);     //atualiza o valor (6) atrav�s da chave (Brasil)
		System.out.println(campeosMundialFifa);  //{Brasil=6, It�lia=4, Argentina=2, Inglaterra=1, Fran�a=2, Uruguai=2, Espanha=1, Alemanha=4}
		
		System.out.println(campeosMundialFifa.get("Argentina")); //2, retorna o valor atrav�s da chave (Argentina)
		
		System.out.println(campeosMundialFifa.containsKey("Fran�a")); //true, retorna um boolean se o existe aquela chave
		System.out.println(campeosMundialFifa.containsValue(6)); //true, retorna um boolean se o existe aquele valor
		
		campeosMundialFifa.remove("Fran�a");    //remove atrav�s chave (Fran�a)
		System.out.println(campeosMundialFifa); //{Brasil=6, It�lia=4, Argentina=2, Inglaterra=1, Uruguai=2, Espanha=1, Alemanha=4}
		
		System.out.println(campeosMundialFifa.size());  //7, retorna tam do map 
				
		//navegar nos registros do mapa -> atrav�s do entrySet() que possuem os m�todos get e set
		for(Map.Entry<String, Integer> entry : campeosMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		//navegar nos registros do mapa -> atrav�s do keySet(), como s� navega pela chave, usar o get para retornar o valor
		//menos perform�tico
		for(String key : campeosMundialFifa.keySet()) {
			System.out.println(key + " -- " + campeosMundialFifa.get(key));
		}
		
		
		
	}

}
