package optional;

import java.util.Optional; //trabalha com Strings
import java.util.OptionalDouble; ////extens�o para decimal
import java.util.OptionalInt;  //extens�o para int
import java.util.OptionalLong; //extens�o para long

public class ExemploOptional {

	public static void main(String[] args) {
		
		//of: construir com valores ou null, retornando erro em caso de null
		//ofNullable: construir com valor null
		//empty: construir vazio
				
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("---- Valor opcional que est� presente ----");
		optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("N�o est� presente"));  //Valor presente
		              //se tiver valor, excute a primeira op��o, se n�o execute a segunda (igual como funciona o if e else, mas com express�o lambda)
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("---- Valor opcional que n�o est� presente ----");
		optionalNull.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("null = n�o est� presente"));  //null = n�o est� presente
		
		Optional<String> optionalEmpty = Optional.empty();
		
		System.out.println("---- Valor opcional que est� vazio ----");  
		optionalEmpty.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("empty = est� vazio"));   //empty = est� vazio
		
//		Optional<String> optionalNullErro = Optional.of(null); //a diferen�a para ofNullable, � que esse retorna erro
//		
//		System.out.println("---- Valor opcional que lan�a erro NullPointerException ----");
//	    optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("erro = n�o est� presente")); //java.lang.NullPointerException
		
		                                                 //os dois s�o sempre um o contr�rio do outro
		System.out.println(optionalString.isPresent());  //true, verifica se est� presente | retorna um boolean
		System.out.println(optionalString.isEmpty());    //false, verifica se est� vazio | retorn um boolena
		
		//if garante que s� vai executar se o valor for presente, ou seja, n�o vazio
		if(optionalString.isPresent()) {
			System.out.println(optionalString.get());    //Valor presente, m�todo get retorna o valor, se estiver nulo retorna erro
		}
		
		//map: transforma/modifica o valor 
		optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);  //Valor presente*****, se estiver presente retorna a transforma��o do map
		
		optionalString.orElseThrow(); //se n�o estiver presente lan�a uma exception 
		System.out.println(optionalString.orElseThrow(IllegalStateException::new));   //Valor presente, se n�o java.util.NoSuchElementException: No value present
		
		//Existem extens�es para os tipos primitivos: double, int, e long
		
		System.out.println("---- Valor opcional inteiro ----");
		OptionalInt.of(22).ifPresent(System.out::println);      //22, (valor) -> System.out.println(valor);
		
		System.out.println("---- Valor opcional double/decimal ----");
		OptionalDouble.of(22.5).ifPresent(System.out::println); //22.5
		
		System.out.println("---- Valor opcional longo ----");
		OptionalLong.of(25L).ifPresent(System.out::println);     //25
		
	}

}
