package projetoEmpadas;

import java.util.Scanner;


public class EmpadasTreino {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		Empadas cardapio = new Empadas();
		
		//cardapio
		cardapio.empadaFrango = 5.00;
		cardapio.empadaCharque = 6.00;
		cardapio.empadaCamarao = 6.00;		
		cardapio.boloChocolate = 7.00;
		cardapio.BoloRedVelvet = 7.00;		
		cardapio.tortaLimao = 7.00;			
		
		
		
		System.out.println("******* BEM VINDOS A LÍGIA EMPADAS! *******\n......POR FAVOR, ESCOLHA SEUS PRODUTOS....... \n");
		System.out.println("      DIDITE 1 PARA EMPADA DE FRANGO  R$" + cardapio.empadaFrango + "\n"
				 + "      DIGITE 2 PARA EMPADA DE CHARQUE R$" + cardapio.empadaCharque + "\n"
				 	+ "      DIGITE 3 PARA EMPADA DE CAMARÃO R$" + cardapio.empadaCamarao + "\n");		
		
		
		System.out.println("      PODE DIGITAR... ");
		int produto = scan.nextInt();			
		
				
		if (produto == 1) {			
			System.out.printf("  SUA ESCOLHA FOI: EMPADA DE FRANGO, VALOR DO PRODUTO É: R$%.2f \n" ,  cardapio.empadaFrango); //usei o atributo usado na classe Empadas
					System.out.println("\n " +  " ATRIBUIR DESCONTO ? ");{
						String descontoFrango = scan.next();
							if(descontoFrango.equalsIgnoreCase("sim")) {
								System.out.printf("    COISA BOA, VOCÊ OBTEVE DESCONTO!! AGORA SEU PRODUTO SAI POR R$%.2f:" , cardapio.atribuirDescontoFrango(0.3)); //usei o método criado na classe Empadas
									}else {
										System.out.println("    TOTAL A PAGAR R$: " + cardapio.empadaFrango);
							}
					}
			}		
		
		else if (produto == 2) {
			System.out.printf("   SUA ESCOLHA FOI: EMPADA DE CHARQUE, VALOR DO PRODUTO É: R$%.2f \n " ,  cardapio.empadaCharque);
				System.out.println("\n " +  " ATRIBUIR DESCONTO ? ");
					String descontoCharque = scan.next();
						if (descontoCharque.equalsIgnoreCase("sim")) {
							System.out.printf("    COISA BOA, VOCÊ OBTEVE DESCONTO!! AGORA SEU PRODUTO SAI POR R$%.2f:" , cardapio.atribuirDescontoChaque(0.3));
						}else {
							System.out.println("    TOTAL A PAGAR R$: " + cardapio.empadaCharque);
				}
		} 
		
		else if (produto == 3) {
			System.out.printf("   SUA ESCOLHA FOI: EMPADA DE CAMARÃO, VALOR DO PRODUTO É: R$%.2f \n" , cardapio.empadaCamarao);
				System.out.println("\n " + " ATRIBUIR DESCONTO ? ");
					String descontoCamarao = scan.next();
					if (descontoCamarao.equalsIgnoreCase("sim")) {
						System.out.printf("    COISA BOA, VOCÊ OBTEVE DESCONTO!! AGORA SEU PRODUTO SAI POR R$%.2f:" , cardapio.atribuirDescontoCamarao(0.3));
					}				
		}
		
		
		
		
		else {
			System.out.println("  NÚMERO INVÁLIDO, POR FAVOR DIGITE NOVAMENTE");
		}
		
		
		
		
		
		scan.close();
	}

}
