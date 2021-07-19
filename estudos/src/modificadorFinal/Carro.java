package modificadorFinal;

	public class Carro {
	
		//atributos
		private String marca;
		private int ano;
		//atributo FINAL 
		public static final double VELOCIDADE_FINAL = 250; //Obrigat�rio passar um valor;
		
		//construtor default
		public Carro() {
			
		}
		
		//construtor com paranmetros
		public Carro(String marca, int ano) {
			super();
			this.marca = marca;
			this.ano = ano;
		}			
		
		//m�todos
		
		@Override
		public String toString() {
			return "Marca: " + marca + "\nAno: " + ano + "\nVelocidade Atual: " + VELOCIDADE_FINAL;
		}		
		
		public void andar() {
			System.out.println("Carro est� andando");
		}


		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		//ele construiu s� o m�todo get pois o atributo � final.
		public static double getVelocidadeFinal() {
			return VELOCIDADE_FINAL;
		}
		
		
		
		

}
