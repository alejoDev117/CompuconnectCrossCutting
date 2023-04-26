package co.edu.uco.compuconnect.crosscutting.utils;

public final class UtilObject {
	
	private UtilObject() {
		super();
	}
	
	
	public static final <O> boolean isNull(final O object) {
		return (object == null);
		
	 }
	 
	public static final <O> O getDefault(final O object, final O defaultValue) {
			return isNull(object) ? defaultValue : object;
		}
}
