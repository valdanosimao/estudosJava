package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produtos p1 = new Produtos("Lapis" , 1.99, 0.35, 0);
		Produtos p2 = new Produtos("Notebook" , 4899.89 , 0.32, 0);
		Produtos p3 = new Produtos("Caderno" , 30, 0.45, 0);
		Produtos p4 = new Produtos("Impressora" , 1200, 0.40, 0);
		Produtos p5 = new Produtos("Ipad" , 3100, 0.29, 0);
		Produtos p6 = new Produtos("Relógio" , 1900, 0.12, 0);
		Produtos p7 = new Produtos("Monitor" , 800, 0.31, 0);
		
		
		List<Produtos> produtos = 
				Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		//Filter, filter, map
		Predicate<Produtos> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produtos> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produtos> precoRelevante = p -> p.preco >= 500;
		
		Function<Produtos, String> chamadaPromocional =
				p -> "Aproveite " + p.nome + " por R$ " + p.preco;
				
		//pipeline
		produtos.stream()
		 .filter(superPromocao)
		 .filter(freteGratis)
		 .filter(precoRelevante)
		 .map(chamadaPromocional)
		 .forEach(System.out::println);

	}

}
