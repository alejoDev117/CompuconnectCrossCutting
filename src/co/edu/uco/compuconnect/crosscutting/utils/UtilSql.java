 package co.edu.uco.compuconnect.crosscutting.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectDataException;
import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectException;
import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectcCrossCuttingException;
import co.edu.uco.compuconnect.crosscutting.utils.Messages.UtilSqlMessage;

public class UtilSql {

    private UtilSql() {
    	
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
            connectionIsOpen(connection);
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

    private static void validarConfirmacionLista(Connection connection) {
        if (UtilObject.isNull(connection)) {
            var userMessage = UtilSqlMessage.COMMIT_IS_READY_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_IS_READY_TECHNICAL_NULL_POINTER_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, new NullPointerException());
        }
    }
    
    
    public static boolean connectionIsOpen(final Connection connection) {
		if(UtilObject.isNull(connection)) {
			var userMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
			throw CompuconnectcCrossCuttingException.create(technicalMessage,userMessage);
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
	

    
    
 
   
}







