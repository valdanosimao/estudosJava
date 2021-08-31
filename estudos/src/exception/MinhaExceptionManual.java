package exception;

public class MinhaExceptionManual extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int num;
	protected int denom;
	
	public MinhaExceptionManual(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "Resultado de =" + num + "/" + denom + " não é inteiro ";
	}
	
	
	
}
