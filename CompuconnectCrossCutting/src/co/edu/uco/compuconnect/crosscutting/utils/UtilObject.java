package co.edu.uco.compuconnect.crosscutting.utils;

public interface UtilObject {
	

	 static <O> boolean isNull(final O object) {
		return (object == null);
	}

}
