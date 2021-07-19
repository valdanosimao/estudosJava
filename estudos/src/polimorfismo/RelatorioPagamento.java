package polimorfismo;

public class RelatorioPagamento {
	
	public void relatorioPagamentoGerente(Gerente gerente) {
		System.out.println("Gerando relat�rio para pagamento de ger�ncia");
		gerente.pagamento();
		System.out.println("Nome " + gerente.getNome());
		System.out.println("Salario " + gerente.getSalario());
	}
	
	public void relatorioPagamentoVendedor(Vendedor vendedor) {
		System.out.println("Gerando relat�rio para pagamento de Vendedores");
		vendedor.pagamento();
		System.out.println("Nome " + vendedor.getNome());
		System.out.println("Salario " + vendedor.getSalario());
	}
	

}
