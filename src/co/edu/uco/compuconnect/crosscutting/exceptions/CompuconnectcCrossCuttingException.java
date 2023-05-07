package co.edu.uco.compuconnect.crosscutting.exceptions;

public final class CompuconnectcCrossCuttingException extends CompuconnectException{



	private static final long serialVersionUID = 8364281581755940173L;
	
	

	private CompuconnectcCrossCuttingException(final String technicalMessage,final  String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.CROSSCUTTING);
	}
	
	
	public static CompuconnectcCrossCuttingException create(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		return new CompuconnectcCrossCuttingException(technicalMessage,userMessage,rootCause);
	}
	
	public static CompuconnectcCrossCuttingException create(final String userMessage) {
		return new CompuconnectcCrossCuttingException(userMessage,userMessage,new Exception());
	}
	
	public static CompuconnectcCrossCuttingException create(final String technicalMessage,final String userMessage) {
		return new CompuconnectcCrossCuttingException(technicalMessage,userMessage,new Exception());
	}
	

}
