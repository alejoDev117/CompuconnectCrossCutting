 package co.edu.uco.compuconnect.crosscutting.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectDataException;
import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectException;
import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectcCrossCuttingException;
import co.edu.uco.compuconnect.crosscutting.utils.Messages.UtilSqlMessage;

public class UtilSql {

    public UtilSql() {
        super();
    }


    public static void abrirConexion(Connection connection) {
        try {
        	connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Compuconnect", "postgres", "admin");
            validarConexionAbierta(connection);
        } catch (final IllegalArgumentException exception) {
            var userMessage = UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_ILEGAL_ARGUMENT_EXCEPTION;
            throw CompuconnectDataException.create(userMessage, technicalMessage, exception);
        } catch (final NullPointerException exception) {
            var userMessage = UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION;
            throw CompuconnectDataException.create(userMessage, technicalMessage, exception);
        } catch (final Exception exception) {
            var userMessage = UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
            throw CompuconnectDataException.create(userMessage, technicalMessage, exception);
        }
        
    }

    public static void cerrarConexion(Connection connection) {
        try {
        	connection.close();
        } catch (final CompuconnectException exception) {
            throw exception;
        } catch (final Exception exception) {
            var userMessage = UtilSqlMessage.CLOSE_CONNECTION_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.CLOSE_CONNECTION_TECHNICAL_EXCEPTION;
            throw CompuconnectDataException.create(userMessage, technicalMessage, exception);
        }
    }

    public static  void iniciarTransaccion(Connection connection) {
        try {
            validarConexionAbierta(connection);
            connection.setAutoCommit(false);
        } catch (final CompuconnectException exception) {
            throw exception;
        } catch (final SQLException exception) {
            var userMessage = UtilSqlMessage.COMMIT_IS_STARTING_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_TECHNICAL_SQL_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, exception);
        }
    }

    public static void confirmarTransaccion(Connection connection) {
        try {
            validarConfirmacionLista(connection);
            connection.commit();
        } catch (CompuconnectException exception) {
            throw exception;
        } catch (SQLException exception) {
            var userMessage = UtilSqlMessage.CONFIRM_COMMIT_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_TECHNICAL_SQL_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, exception);
        }
    }

    public static void cancelarTransaccion(Connection connection) {
        try {
            validarConfirmacionLista(connection);
            connection.rollback();
        } catch (CompuconnectException exception) {
            throw exception;
        } catch (SQLException exception) {
            var userMessage = UtilSqlMessage.CANCEL_COMMIT_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_TECHNICAL_SQL_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, exception);
        }
    }

    private static void validarConexionAbierta(Connection connection) {
        if (connection == null) {
            var userMessage = UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION;
            throw CompuconnectDataException.create(userMessage, technicalMessage, new NullPointerException());
        }
    }

    private static void validarConfirmacionLista(Connection connection) {
        if (connection == null) {
            var userMessage = UtilSqlMessage.COMMIT_IS_READY_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_IS_READY_TECHNICAL_NULL_POINTER_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, new NullPointerException());
        }
    }
    
    
    public static boolean connectionIsOpen(final Connection connection) {
		if(UtilObject.isNull(connection)) {
			var userMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
			throw CompuconnectcCrossCuttingException.create("NO ES POSIBLE VALIDAR SI UNA CONEXION ESTA ABUERTA CUANDO SE ENCUENTRA NULA...");
		}
		
		try {
			return !connection.isClosed();
		} catch (final SQLException exception) {
			var userMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;
			
			throw CompuconnectcCrossCuttingException.create(technicalMessage, userMessage, exception);
			
		}
		
		catch (final Exception exception) {
			var userMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
			
			throw CompuconnectcCrossCuttingException.create(technicalMessage, userMessage, exception);
			
		}
		
	}
	
	public static void closeConnection(final Connection connection) {
		try {
			if(!connectionIsOpen(connection)) {
				connection.close();
			} 
		}catch (final SQLException exception){
				var userMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
				var technicalMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;
				
				throw CompuconnectcCrossCuttingException.create(technicalMessage, userMessage, exception);
				
			}
			
			catch (final Exception exception) {
				var userMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
				var technicalMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
				
				throw CompuconnectcCrossCuttingException.create(technicalMessage, userMessage, exception);
				
			}
	}
    
    
 
   
}







