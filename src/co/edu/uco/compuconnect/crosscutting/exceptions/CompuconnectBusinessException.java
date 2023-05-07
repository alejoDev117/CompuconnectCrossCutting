package co.edu.uco.compuconnect.crosscutting.exceptions;

public final class CompuconnectBusinessException extends CompuconnectException{


	private static final long serialVersionUID = -1976252259881551690L;
	
	

	private CompuconnectBusinessException(final String technicalMessage,final  String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSINESS);
	}
	
	
	public static CompuconnectBusinessException create(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		return new CompuconnectBusinessException(technicalMessage,userMessage,rootCause);
	}
	
	public static CompuconnectBusinessException create(final String userMessage) {
		return new CompuconnectBusinessException(userMessage,userMessage,new Exception());
	}
	
	public static CompuconnectBusinessException create(final String technicalMessage,final String userMessage) {
		return new CompuconnectBusinessException(technicalMessage,userMessage,new Exception());
	}
	

}
