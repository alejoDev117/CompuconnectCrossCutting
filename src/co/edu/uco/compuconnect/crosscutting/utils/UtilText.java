package co.edu.uco.compuconnect.crosscutting.utils;

public final class UtilText {
	

	private static final String EMPTY = "";
	
	
	private UtilText() {
		super();
	}
	
	

	
	public static boolean isNull(final String text) {
		return UtilObject.isNull(text);
	}
	
	public static final String getDefault(final  String text, String defaultValue) {
		
		String result = text;
		
		if(isNull(text)) {
			result = isNull(defaultValue) ? EMPTY : defaultValue;
		}
		
		return result;
	}
	
	

	public static final String getDefault(final  String text) {
	return (getDefault(text,EMPTY));
	}
	
	public static final String applyTrim(final String text) {
		return getDefault(text).trim();
	}


	public static final String getDefaultValue() {
		return EMPTY;
	}
	
	public static  final boolean matchPattern(final String text, final String pattern) {
		return (getDefault(text).matches(getDefault(pattern)));
		
	}
	


}
