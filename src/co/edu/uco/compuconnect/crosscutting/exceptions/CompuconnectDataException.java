package co.edu.uco.compuconnect.crosscutting.exceptions;

public final class CompuconnectDataException extends CompuconnectException{


	private static final long serialVersionUID = 8020586492797527036L;

	
	private CompuconnectDataException(final String technicalMessage,final  String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
	}
	
	
	public static CompuconnectDataException create(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		return new CompuconnectDataException(technicalMessage,userMessage,rootCause);
	}
	
	public static CompuconnectDataException create(final String userMessage) {
		return new CompuconnectDataException(userMessage,userMessage,new Exception());
	}
	
	public static CompuconnectDataException create(final String technicalMessage,final String userMessage) {
		return new CompuconnectDataException(technicalMessage,userMessage,new Exception());
	}
	

}
