package optional;

import java.util.Optional;

public class ExercicioFixacaoOptional {
	
	public static void main(String[] args) {
		
		//Crie uma optional de um determinado tipo de dado: estado vazio, estado presente e com null
		
		Optional<String> optionalPresent = Optional.of("Fernanda");
		Optional<String> optionalEmpty = Optional.empty();
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		//Se presente exiba o valor no console:
		optionalPresent.ifPresent(System.out::println);   //Fernanda
		optionalEmpty.ifPresent(System.out::println);    
		optionalNull.ifPresent(System.out::println);      
				
		//se vazio lance uma exceção IllegalStateException:
		System.out.println(optionalPresent.orElseThrow(IllegalStateException::new)); //Fernanda
//	    System.out.println(optionalEmpty.orElseThrow(IllegalStateException::new));   // java.lang.IllegalStateException
//		System.out.println(optionalNull.orElseThrow(IllegalStateException::new));    // java.lang.IllegalStateException

		//Se vazio, exiba "Optional vazio" no console:
		System.out.println(optionalPresent.orElse("Optional vazio")); //Fernanda
		System.out.println(optionalEmpty.orElse("Optional vazio"));   //Optional vazio
		System.out.println(optionalNull.orElse("Optional vazio"));    //Optional vazio
		
		//Se presente, transforme o valor e exiba no console:
		optionalPresent.map((valor) -> valor.concat(" Ruaro")).ifPresent(System.out::println); //Fernanda Ruaro
		optionalEmpty.map((valor) -> valor.concat(" Ruaro")).ifPresent(System.out::println);
		optionalNull.map((valor) -> valor.concat(" Ruaro")).ifPresent(System.out::println);
		
		//Se presente, pegue o valor do optional e atribua em uma variavel:
		String s;
		
		if(optionalPresent.isPresent()) {
			s = optionalPresent.get();
			System.out.println(s);      //Fernanda
		}
		if(optionalEmpty.isPresent()) {
			s = optionalEmpty.get();
			System.out.println(s);
		}
		if(optionalNull.isPresent()) {
			s = optionalNull.get();
			System.out.println(s);
		}
		
		
	}	
}
