package co.edu.uco.compuconnect.crosscutting.utils;

public final class Messages {

	public static final class UtilSqlMessage {
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada..."; 
		public static final String CONNECTION_IS_OPEN_TECHNICAL_ILEGAL_ARGUMENT_EXCEPTION = "Se ha presentado un excepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SECURITY_EXCEPTION = "Se ha presentado un SecurityExcepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION = "Se ha presentado un NullPointerExcepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_CLOSE_USER_MESSAGE = "Se ha presentado un problema tratando de cerrar la conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_CLOSE_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_CLOSE_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la conexion estaba abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTED_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una transaccion esta activa o no";
		public static final String COMMIT_IS_STARTED_TECHNICAL_AUTOCOMMIT = "No es posible validar si se ha iniciado la transaccion, verificar si esta se encuentra en True";
		public static final String COMMIT_IS_STARTED_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la transaccion esta activa. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTED_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la transaccion esta activa. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTING_USER_MESSAGE = "Se ha presentado un problema tratando de validar la transaccion inicial";
		public static final String CONFIRM_COMMIT_USER_MESSAGE = "Se ha presentado un problema tratando de validar la confirmacion de la transaccion";
		public static final String CANCEL_COMMIT_USER_MESSAGE = "Se ha presentado un problema tratando de validar la cancelacion de transaccion";
		public static final String COMMIT_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar la transaccion. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_CLOSED_EXCEPTION = "La conexión está cerrada.";
		public static final String CLOSE_CONNECTION_USER_MESSAGE = "No se pudo cerrar la conexión.";
		public static final String CLOSE_CONNECTION_TECHNICAL_SQL_EXCEPTION = "Ocurrió una excepción al intentar cerrar la conexión SQL.";
	    public static final String CLOSE_CONNECTION_TECHNICAL_EXCEPTION = "Ocurrió un error al cerrar la conexión";
	    public static final String COMMIT_IS_READY_USER_MESSAGE = "No se puede confirmar la transacción, la conexión no está lista";
	    public static final String COMMIT_IS_READY_TECHNICAL_NULL_POINTER_EXCEPTION = "Ocurrió un error al confirmar la transacción debido a un puntero nulo";
	    
	}
	
}

