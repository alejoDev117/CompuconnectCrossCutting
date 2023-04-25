package co.edu.uco.compuconnect.crosscutting.utils;

public final class UtilText {
	private final static UtilText INSTANCE = new UtilText();
	private final static String EMPTY = "";
	private UtilText() {
		super();
	}
	
	
	public static final UtilText getInstanceUtilText() {
		return INSTANCE;
	}
	
	
	public boolean isNull(final String text) {
		return UtilObject.isNull(text);
	}
	
	public final String getDefault(final  String text, String defaultValue) {
		
		String result = text;
		
		if(isNull(text)) {
			result = isNull(defaultValue) ? EMPTY : defaultValue;
		}
		
		return result;
	}

	public final String getDefault(final  String text) {
	return (getDefault(text,EMPTY));
	}
	
	public final String applyTrim(final String text) {
		return getDefault(text).trim();
	}


	public static final String getDefaultValue() {
		return EMPTY;
	}
	
	public final boolean matchPattern(final String text, final String pattern) {
		return (getDefault(text).matches(getDefault(pattern)));
		
	}
	


}
