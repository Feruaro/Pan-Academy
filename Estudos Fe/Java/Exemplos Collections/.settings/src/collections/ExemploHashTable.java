package collections;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> estudantes = new Hashtable<>();
		
		estudantes.put("Fernanda", 21);	  //adicionar elem (chave, valor)
		estudantes.put("William", 28);
		estudantes.put("Maria Júlia", 25);
		estudantes.put("Jonas", 30);
		estudantes.put("Isabel", 29);
		
		System.out.println(estudantes);   //{Jonas=30, Fernanda=22, Isabel=29, Maria Júlia=25, William=28}
		
		estudantes.put("Fernanda", 22);   //atualiza o valor daquela chave
		System.out.println(estudantes);   //{Jonas=30, Fernanda=22, Isabel=29, Maria Júlia=25, William=28}
		
		estudantes.remove("Jonas");       //remover pela chave
		System.out.println(estudantes);   //{Fernanda=22, Isabel=29, Maria Júlia=25, William=28}
		
		System.out.println(estudantes.get("Fernanda"));  //22, retorna o valor daquela chave
		
		System.out.println(estudantes.size());   //4, retorna o tam
		
		//navegar pelo HashTable:
		
		for(String i : estudantes.keySet()) {
			System.out.println(i + " -- " + estudantes.get(i));
		}
		
		for(Map.Entry<String, Integer> i : estudantes.entrySet()) {
			System.out.println(i.getKey() + " -- " + i.getValue());
		}

	}

}
