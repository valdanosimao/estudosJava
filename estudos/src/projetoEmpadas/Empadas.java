package projetoEmpadas;

public class Empadas {

	//atributos
	double empadaFrango;
	double empadaCharque;
	double empadaCamarao;
	
	double boloChocolate;
	double BoloRedVelvet;
	
	double tortaLimao;
	
	
	//métodos
	double atribuirDescontoFrango(double descontoVal) {
		return empadaFrango * (1 - descontoVal);
		
	}
	
	double atribuirDescontoChaque(double descontoVal) {
		return empadaCharque * (1 - descontoVal);
		
	}
	
	double atribuirDescontoCamarao(double descontoVal) {
		return empadaCamarao * (1 - descontoVal);
		
	}
	
	
	
	
}
