package co.edu.uco.compuconnect.crosscutting.exceptions;

public final class CompuconnectEntityException extends CompuconnectException{


	private static final long serialVersionUID = -821381452390812332L;
	
	
	

	private CompuconnectEntityException(final String technicalMessage,final  String userMessage,final Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
	}
	
	
	public static CompuconnectEntityException create(final String technicalMessage,final String userMessage,final Throwable rootCause) {
		return new CompuconnectEntityException(technicalMessage,userMessage,rootCause);
	}
	
	public static CompuconnectEntityException create(final String userMessage) {
		return new CompuconnectEntityException(userMessage,userMessage,new Exception());
	}
	
	public static CompuconnectEntityException create(final String technicalMessage,final String userMessage) {
		return new CompuconnectEntityException(technicalMessage,userMessage,new Exception());
	}
	

}
