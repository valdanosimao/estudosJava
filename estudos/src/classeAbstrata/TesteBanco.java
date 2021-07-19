package classeAbstrata;

public class TesteBanco {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(140.23, 1);
		cc.setNomeCliente("Valdano");
		cc.setNomeBanco("Java Capital");
		cc.setNumConta(1234);	
		
		ContaPoupanca pp = new ContaPoupanca(234.43 , 2);
		pp.setNomeCliente("Tatiana");
		pp.setNomeBanco("Pyton Investimento");
		pp.setNumConta(56788);		
				
		System.out.println(cc);
		cc.tipo();
		System.out.println("===============");
		System.out.println(pp);	
		pp.tipo();		

	}

}
