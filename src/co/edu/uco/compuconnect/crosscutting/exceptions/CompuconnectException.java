package co.edu.uco.compuconnect.crosscutting.exceptions;

import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;
import co.edu.uco.compuconnect.crosscutting.utils.UtilText;

public abstract  class CompuconnectException extends RuntimeException{

	private static final long serialVersionUID = -981892666003012957L;
	private ExceptionType type;
	private String userMessage;
	
	protected CompuconnectException(final String technicalMessage, final String userMessage, Throwable rootCause, ExceptionType type) {
		super(technicalMessage,rootCause);
		setUserMessage(userMessage);
		setType(type);
		
	}
	
	
	public final String getTechnicalMessage() {
		return UtilText.getDefaultIfEmpty(getMessage(), getUserMessage());
	}
	
	public final Throwable getRootCause() {
		return UtilObject.getDefault(getCause(),new Exception());
		
	}
	public final ExceptionType getType() {
		return type;
	}

	private  final void setType(final ExceptionType type) {
		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}

	public final String getUserMessage() {
		return userMessage;
	}

	public final void setUserMessage(final String userMessage) {
		this.userMessage = UtilText.getDefault(userMessage);
	}

	public static final long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
