package enumeracao2;

import enumeracao2.Cliente.TipoPagamento;

public class TesteCliente {

	public static void main(String[] args) {		
		
	Cliente cliente = new Cliente("Valdano", TipoCliente.PESSOA_FISICA, TipoPagamento.AVISTA);

	System.out.println(cliente);
	
	
	}

}
