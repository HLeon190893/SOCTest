package exceptions;

public class ExecucaoTesteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	/*
	 *	 Exceção pesonalizada para CT  
	 */
	
	public ExecucaoTesteException(Exception e) {
		super();
		System.out.println("Erro na execução do teste:" + e.getMessage());
	}

}
