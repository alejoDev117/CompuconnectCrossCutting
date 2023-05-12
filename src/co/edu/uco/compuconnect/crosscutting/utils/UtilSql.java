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

    public static Connection conexion;

    public static void abrirConexion() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/compuconnect", "postgres", "pass");
            validarConexionAbierta(conexion);
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

    public static void cerrarConexion() {
        try {
            conexion.close();
        } catch (final CompuconnectException exception) {
            throw exception;
        } catch (final Exception exception) {
            var userMessage = UtilSqlMessage.CLOSE_CONNECTION_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.CLOSE_CONNECTION_TECHNICAL_EXCEPTION;
            throw CompuconnectDataException.create(userMessage, technicalMessage, exception);
        }
    }

    public static  void iniciarTransaccion() {
        try {
            validarConexionAbierta(conexion);
            conexion.setAutoCommit(false);
        } catch (final CompuconnectException exception) {
            throw exception;
        } catch (final SQLException exception) {
            var userMessage = UtilSqlMessage.COMMIT_IS_STARTING_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_TECHNICAL_SQL_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, exception);
        }
    }

    public static void confirmarTransaccion() {
        try {
            validarConfirmacionLista(conexion);
            conexion.commit();
        } catch (CompuconnectException exception) {
            throw exception;
        } catch (SQLException exception) {
            var userMessage = UtilSqlMessage.CONFIRM_COMMIT_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_TECHNICAL_SQL_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, exception);
        }
    }

    public static void cancelarTransaccion() {
        try {
            validarConfirmacionLista(conexion);
            conexion.rollback();
        } catch (CompuconnectException exception) {
            throw exception;
        } catch (SQLException exception) {
            var userMessage = UtilSqlMessage.CANCEL_COMMIT_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_TECHNICAL_SQL_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, exception);
        }
    }

    private static void validarConexionAbierta(Connection conexion) {
        if (conexion == null) {
            var userMessage = UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION;
            throw CompuconnectDataException.create(userMessage, technicalMessage, new NullPointerException());
        }
    }

    private static void validarConfirmacionLista(Connection conexion) {
        if (conexion == null) {
            var userMessage = UtilSqlMessage.COMMIT_IS_READY_USER_MESSAGE;
            var technicalMessage = UtilSqlMessage.COMMIT_IS_READY_TECHNICAL_NULL_POINTER_EXCEPTION;
            throw CompuconnectcCrossCuttingException.create(userMessage, technicalMessage, new NullPointerException());
        }
    }
    
    //prueba 
    
    public static void main(String[] args) {
        UtilSql utilSql = new UtilSql();

        try {
            utilSql.abrirConexion();
            System.out.println("Conexión exitosa");
        } catch (CompuconnectException e) {
            e.printStackTrace();
        } finally {
            utilSql.cerrarConexion();
        }
    }
   
}







