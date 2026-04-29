package entities;

public class EntitiesException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public EntitiesException(String mensagem) {
		super(mensagem);
	}
}
