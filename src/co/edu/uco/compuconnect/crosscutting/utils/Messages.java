package co.edu.uco.compuconnect.crosscutting.utils;

public final class Messages {

	public static final class UtilSqlMessage {
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE ="Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no abierta...";
		public static final String CONNECTION_IS_OPEN__TECHNICAL_NULL_CONNECTION = "No es posible si una conexion esta abierta si se encuentra nula";
		public static final String CONNECTION_IS_OPEN__TECHNICAL_SQL_EXCEPTION = "Se ha presentado una excepcion de tipo SQLException tratando de validar si la conexion estaba abierta o no abierta.Por favor validar la traza de errores completa de la excepcion presentada.";
		public static final String CONNECTION_IS_OPEN__TECHNICAL_EXCEPTION = "Se ha presentado una excepcion inesperada de tipo Exception tratando de validar si la conexion estaba abierta o no abierta.Por favor validar la traza de errores completa de la excepcion presentada.";
	}
	
}
