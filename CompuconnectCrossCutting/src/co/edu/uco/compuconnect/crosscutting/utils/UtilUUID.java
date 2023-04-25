package co.edu.uco.compuconnect.crosscutting.utils;

import java.util.UUID;

import co.edu.uco.compuconnect.crosscutting.utils.UtilText;
import co.edu.uco.compuconnect.crosscutting.utils.UtilObject;

public final class UtilUUID {
	private static final UtilUUID INSTANCE = new UtilUUID();
	private static final String DEFAULT_UUID_AS_STRING = "FFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF";
	private static final UUID DEFAULT_UUID = generateUUIDFromString(DEFAULT_UUID_AS_STRING); 
	private static final String UUID_RE = "[a-f0-9]{8}([-][a-f0-9]{4}){3}[-][a-f0-9]{12}"; 
	
	private UtilUUID() {
		super();
	}
	
	public static final UUID generateNewUUID() {
		return UUID.randomUUID();
	}
	
	public static final boolean uuidAsStringIsValid(final String uuidValue) {
		return UtilText.getInstanceUtilText().matchPattern(uuidValue, UUID_RE);
	}
	
	
	public static final UUID generateUUIDFromString(final String uuidValue) {
		return uuidAsStringIsValid(uuidValue) ? UUID.fromString(uuidValue) : DEFAULT_UUID;
	}
	


	public static final String getDefaultUuidAsString() {
		return DEFAULT_UUID_AS_STRING;
	}

	public static final UUID getDefaultUuid() {
		return DEFAULT_UUID;
	}
	
	public static final UUID getDefault(final UUID uuidValue) {
		return UtilObject.isNull(uuidValue) ? DEFAULT_UUID : uuidValue;
	}
	
}
