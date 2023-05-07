package co.edu.uco.compuconnect.crosscutting.exceptions;

public final class CompuconnectAPIException extends CompuconnectException{

	private static final long serialVersionUID = -510749110729591677L;
	
	
	

	private CompuconnectAPIException(final String technicalMessage,final  String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	
	public static CompuconnectAPIException create(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		return new CompuconnectAPIException(technicalMessage,userMessage,rootCause);
	}
	
	public static CompuconnectAPIException create(final String userMessage) {
		return new CompuconnectAPIException(userMessage,userMessage,new Exception());
	}
	
	public static CompuconnectAPIException create(final String technicalMessage,final String userMessage) {
		return new CompuconnectAPIException(technicalMessage,userMessage,new Exception());
	}
	

}
