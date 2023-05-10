package co.edu.uco.compuconnect.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectException;
import co.edu.uco.compuconnect.crosscutting.exceptions.CompuconnectcCrossCuttingException;
import co.edu.uco.compuconnect.crosscutting.utils.Messages.UtilSqlMessage;

public final class UtilSql {
	
	
	private UtilSql() {
		super();
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if(UtilObject.isNull(connection)) {
			
			throw CompuconnectcCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION,UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE);
		}
		
		
		try {
			return !(connection.isClosed());
		} catch (final SQLException exception) {
			
			throw CompuconnectcCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION,UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE);
			
		} catch (final Exception exception) {
			
			throw CompuconnectcCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION, UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE);
			
		} 
			
		
	}
	
	public static boolean closeConnection(final Connection connection) {
		try {
		if(!connectionIsOpen(connection)) {	
			connection.close();
		}
			}catch(CompuconnectcCrossCuttingException exception) {
				
				throw exception;
				
			} catch (final SQLException exception) {
				
				throw CompuconnectcCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_CLOSE_TECHNICAL_SQL_EXCEPTION,UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE);
				
			} catch (final Exception exception) {
				
				throw CompuconnectcCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_CLOSE_TECHNICAL_EXCEPTION, UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE);
				
			} 
		return true;
		}
	
	
}

