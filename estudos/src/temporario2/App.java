package temporario2;

public class App {

	public static void main(String[] args) {
		
		Funcionario func =  new Funcionario();
		Gerente ger = new Gerente();
		Secretaria sec = new Secretaria();
		Servico serv = new Servico();
		Emprestimo emp = new Emprestimo();
		SeguroVeiculo seg = new SeguroVeiculo();
		Cliente cli = new Cliente();
		
		cli.setNome("Valdano Simão"); // HERENÇA - É UM
		//cli.getFuncionario().setNome("Valdano Simão"); RELAÇÃO ENTRE CLASSES - TEM UM
		cli.setCpf("077.312.554-09");
		cli.setSalario(1600.99);
		cli.setAtivo(true);
		
		func.setNome(cli.getNome());
		
		
		ger.setNome("Tatiana Carla");
		ger.setCpf("321.445.656-44");
		ger.setSalario(5300.77);
		ger.setUsuario("Tati12");
		ger.setSenha("1234admin");
		
		sec.setRamal(2);
		
		serv.setContratante(cli);
		serv.setAtendente(sec);
		serv.setDataContrato("18/07/1987");
		
		emp.setValor(324);
		System.out.println(emp.getValor());
		
		System.out.println(serv.getContratante());
		
	}

}
