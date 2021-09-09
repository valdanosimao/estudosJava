package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::print;
		
		Stream<String> langs = Stream.of("Java","lua", "JS\n");
		langs.forEach(print);
		
		String [] maisLangs = {"Java", "Lips","Perl"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1 , 2).forEach(print);;
		
		List<String> outrasLangs =  Arrays.asList("c" , "PHP" , "python");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(()-> "a").forEach(print); FORMA INFINITA
	   //Stream.iterate(0, n -> n + 1).forEach(println);		
	}
	
}
