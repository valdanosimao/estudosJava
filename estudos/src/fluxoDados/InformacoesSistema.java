package fluxoDados;

import java.io.File;

public class InformacoesSistema {

	public static void main(String[] args) {
		
		System.out.println("Separador de path = " + File.pathSeparator);
		System.out.println("Separador de diret�rio = " + File.separator);

		//mostra ar parti��es do pc
		File discos[] = File.listRoots();
		for(int cont = 0; cont < discos.length; cont++) {
			System.out.println("Disco " + cont + ":" + discos[cont]);
		}
	}

}
