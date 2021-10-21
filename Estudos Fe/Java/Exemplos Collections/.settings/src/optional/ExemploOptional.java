package optional;

import java.util.Optional; //trabalha com Strings
import java.util.OptionalDouble; ////extensão para decimal
import java.util.OptionalInt;  //extensão para int
import java.util.OptionalLong; //extensão para long

public class ExemploOptional {

	public static void main(String[] args) {
		
		//of: construir com valores ou null, retornando erro em caso de null
		//ofNullable: construir com valor null
		//empty: construir vazio
				
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("---- Valor opcional que está presente ----");
		optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("Não está presente"));  //Valor presente
		              //se tiver valor, excute a primeira opção, se não execute a segunda (igual como funciona o if e else, mas com expressão lambda)
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("---- Valor opcional que não está presente ----");
		optionalNull.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("null = não está presente"));  //null = não está presente
		
		Optional<String> optionalEmpty = Optional.empty();
		
		System.out.println("---- Valor opcional que está vazio ----");  
		optionalEmpty.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("empty = está vazio"));   //empty = está vazio
		
//		Optional<String> optionalNullErro = Optional.of(null); //a diferença para ofNullable, é que esse retorna erro
//		
//		System.out.println("---- Valor opcional que lança erro NullPointerException ----");
//	    optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("erro = não está presente")); //java.lang.NullPointerException
		
		                                                 //os dois são sempre um o contrário do outro
		System.out.println(optionalString.isPresent());  //true, verifica se está presente | retorna um boolean
		System.out.println(optionalString.isEmpty());    //false, verifica se está vazio | retorn um boolena
		
		//if garante que só vai executar se o valor for presente, ou seja, não vazio
		if(optionalString.isPresent()) {
			System.out.println(optionalString.get());    //Valor presente, método get retorna o valor, se estiver nulo retorna erro
		}
		
		//map: transforma/modifica o valor 
		optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);  //Valor presente*****, se estiver presente retorna a transformação do map
		
		optionalString.orElseThrow(); //se não estiver presente lança uma exception 
		System.out.println(optionalString.orElseThrow(IllegalStateException::new));   //Valor presente, se não java.util.NoSuchElementException: No value present
		
		//Existem extensões para os tipos primitivos: double, int, e long
		
		System.out.println("---- Valor opcional inteiro ----");
		OptionalInt.of(22).ifPresent(System.out::println);      //22, (valor) -> System.out.println(valor);
		
		System.out.println("---- Valor opcional double/decimal ----");
		OptionalDouble.of(22.5).ifPresent(System.out::println); //22.5
		
		System.out.println("---- Valor opcional longo ----");
		OptionalLong.of(25L).ifPresent(System.out::println);     //25
		
	}

}
