package co.edu.uco.compuconnect.crosscutting.exceptions;

public final class CompuconnectDtoException extends CompuconnectException{


	private static final long serialVersionUID = 5250554071120572596L;
	
	

	private CompuconnectDtoException(final String technicalMessage,final  String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
	}
	
	
	public static CompuconnectDtoException create(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		return new CompuconnectDtoException(technicalMessage,userMessage,rootCause);
	}
	
	public static CompuconnectDtoException create(final String userMessage) {
		return new CompuconnectDtoException(userMessage,userMessage,new Exception());
	}
	
	public static CompuconnectDtoException create(final String technicalMessage,final String userMessage) {
		return new CompuconnectDtoException(technicalMessage,userMessage,new Exception());
	}
	

}
