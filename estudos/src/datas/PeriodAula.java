package datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodAula {

	public static void main(String[] args) {		
		
		Period of = Period.of(1, 5, 2);
		System.out.println(of);		
		
		LocalDate ld = LocalDate.of(1987, 7, 18);
		LocalDate ld2 = LocalDate.of(1989, 7, 18);
		
		//saber a soma dois dois periodos
		Period bet = Period.between(ld, ld2);		
		//saber a soma dois dois periodos OBS: MESMA COISA DE CIMA
		Period util = ld.until(ld2);
		System.out.println(util);		
		
		//mais 10 dias
		Period dia = bet.plusDays(10);
		System.out.println(dia);	
		//mais 3 meses
		Period mes = bet.plusMonths(3);
		System.out.println(mes);	
		//mais 1 ano 
		Period ano = bet.plusYears(1);		
		System.out.println(ano);
		
		//exemplo de contagem
		LocalDate nascimento = LocalDate.of(1987, Month.JULY, 18);
		LocalDate hoje = LocalDate.now();
		Period tempoDeVida = Period.between(nascimento, hoje);
		System.out.println(tempoDeVida);
		
	}

}
