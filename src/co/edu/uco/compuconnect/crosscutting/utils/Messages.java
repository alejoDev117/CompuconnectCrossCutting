package co.edu.uco.compuconnect.crosscutting.utils;

public final class Messages {
	
	private Messages() {
		
	}

	public static final class UtilSqlMessage {
		
		private UtilSqlMessage() {
			
		}
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
	
	public static final class CentroInformaticaFacadeImpMessage {
		
		private CentroInformaticaFacadeImpMessage() {
			
		}
		
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "se ha presentado un problema tratando de registrar la informacion del nuevo Centro Informatica. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "se ha presentado una excepcion no conocida al momento de crear un nuevo CentroInformaticaDTO.Por favor valide la traza completa de la excepcion presentada...";
		public static final String READ_EXCEPTION_USER_MESSAGE = "Se ha presetando un problema tratando de consultar los Centros Informatica disponibles. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String READ_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de listar los CentroInformaticaDTO disponibles. Por favor valide la traza completa de la excepcion presentada...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE ="Se ha presentado un problema tratando de actualizar la informacion de un centro Informatica. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de actualizar la informacion de un CentroInformaticaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de un centro Informatica. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de eliminar un CentroInformaticaDTO. Por favor valide la traza completa de la excepcion presentada...";
	}
	
	public static final class DiaFestivoFacadeImpMessage{
		private DiaFestivoFacadeImpMessage() {
			
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los dias festivos.Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de listar DiaFestivoDTO. Por favor valide la traza  completa de la excepcion presentada...";
	}
	public static final class DiaSemanalFacadeImpMessage{
		private DiaSemanalFacadeImpMessage() {
			
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los dias de la semanal. Por favor intente de nuevo y si el problema persiste comuniquese con el adminsitrador de sistema...";	
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de listar DiaSemanalDTO. Por favor valide la traza completa de la excepcion presentada...";
	}
	
	public static final class EstadoPeriodoFuncionamientoFacadeImpMessage{
		private EstadoPeriodoFuncionamientoFacadeImpMessage(){
			
		}
		
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los estados de Periodo funcionamiento. Por favor intente nuevamente y si persiste comuniquese con el adminsitrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de listar EstadosPeriodoFuncionamientoDTO.Por favor valide la traza completa de la excepcion presentada...";
		
		
	}
	
	public static final class EstadoEquipoComputoFacadeImpMessage{
		
		private EstadoEquipoComputoFacadeImpMessage() {
			
		}
		
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los estados de equipo computo. Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de listar EstadoEquipoComputoDTO.Por favor valide la traza completa de la excepcion presente...";
		
	}
	
	public static final class EstadoNotificacionFacadeImpMessage{
		private EstadoNotificacionFacadeImpMessage() {
			
		}
		
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los estados notificacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida al momento de listar EstadoNotificacionDTO. Por favor valide la traza completa de la excepcion presente...";
		
		
		
	}
	public static final class EstadoSolicitudFacadeImpMessage{
		private EstadoSolicitudFacadeImpMessage() {
			
		}
		
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los estado solicitud. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida al momento de listar EstadoSolicitudDTO. Por favor valide la traza completa de la excepcion presente...";
	}
	
	public static final class FrecuenciaFacadeImpMessage{
		private FrecuenciaFacadeImpMessage() {
			
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las frecuencias. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida al momento de listar FrecuenciaDTO. Por favor valide la traza completa de la excepcion presentada...";
		
	}
	
	public static final class SoftwareFacadeImpMessage{
		private SoftwareFacadeImpMessage() {
			
		}
		
		public static final String AÑADIR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema intentando añadir un nuevo Software. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String AÑADIR_EXCECPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida al momento de registrar un nuevo SoftwareDTO. Por favor valide la traza de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema intentando eliminar un Software. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida intentando eliminar un SoftwareDTO. Por favor valide la traza de la excepcion presentada...";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema intentando consultar los Software. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de sistema....";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida intentnado listar SoftwareDTO. Por favor valide la traza de la excepcion presentanda...";
		
		
	}
	public static final class TipoIdentificacionFacadeImpMessage{
		private TipoIdentificacionFacadeImpMessage() {
			
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE ="Se ha presentado un problema intentando consultar los tipo identificacion. Por favor intente nuevamente y si persiste comuniquese con el adminsitrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE="Se ha presentado una excepcion no conocida tratando de listar tipoIdentificacionDTO. Por favor valide la traza completa de la excepcion presentanda...";
	}
	
	public static final class TipoNotificacionFacadeImpMessage{
		private TipoNotificacionFacadeImpMessage() {
			
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema intentando consultar los tipo notificacion. Por favor intente nuevamente y si persiste comuniquesecon el adminsitrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar TipoNotificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		
	}
	
	public static final class TipoReservaFacadeImpMessage{
		private TipoReservaFacadeImpMessage() {
	
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema intentando consultar los tipo reserva. Por favor intente nuevamente y si el problema persiste comuniquese con el adminsitrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar TipoReservaDTO.Por favor valide la traza completa de la excepcion presentada...";
	}
	public static final class TipoSolicitudFacadeImpMessage{
		private TipoSolicitudFacadeImpMessage() {
			
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema intentando consultar los tipo solicitud. Por favor intente nuevamente y si el problema persiste comuniquese con el adminsitrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar TipoSolicitudDTO.Por favor valide la traza completa de la excepcion presentada...";
		
	}
	public static final class TipoUsuarioFacadeImpMessage{
		private TipoUsuarioFacadeImpMessage() {
			
		}
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema intentando consultar los tipo usuario. Por favor intente nuevamente y si el problema persiste comuniquese con el adminsitrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar TipoUsuarioDTO.Por favor valide la traza completa de la excepcion presentada...";
			
	}
	public static final class CoordinadorFacadeImpMessage{
		private CoordinadorFacadeImpMessage() {
			
		}
		public static final String REGISTRAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar un nuevo Coordinador, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String REGISTRAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de registrar un nuevo CoordinadorDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion un nuevo Coordinador, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  un  CoordinadorDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar un  Coordinador, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  CoordinadorDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un  Coordinador, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  CoordinadorDTO. Por favor valide la traza completa de la excepcion presentada";
	
	}
	public static final class EquipoComputoFacadeImpMessage{
		private EquipoComputoFacadeImpMessage() {
			
		}
		public static final String REGISTRAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar un nuevo Equipo Computo, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String REGISTRAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de registrar un nuevo EquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion un nuevo Equipo Computo, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  un  EquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar un  Equipo Computo, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  EquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un  Equipo Computo, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  EquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada";
		
	}
	public static final class ExcepcionFacadeImpMessage{
		private ExcepcionFacadeImpMessage() {
			
		}
		
		public static final String GENERAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de generar una nueva Excepcion, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String GENERAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de generar una nueva ExcepcionDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar una excepcion, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  un  ExcepcionDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar una Excepcion, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las  ExcepcionDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una Excepcion, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar una  ExcepcionDTO. Por favor valide la traza completa de la excepcion presentada";
	}
	
	public static final class MonitorFacadeImpMessage{
		private MonitorFacadeImpMessage() {
			
		}
		
		public static final String REGISTRAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar un nuevo monitor, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String REGISTRAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de registrar un nuevo MonitorDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de un monitor, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  un  MonitorDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar un monitor, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  MonitorDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un monitor, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  MonitorDTO. Por favor valide la traza completa de la excepcion presentada";
	}
	
	public static final class PerfilFacadeImpMessage{
		private PerfilFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear un nuevo perfil, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un nuevo PerfilDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ACTUALIZAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de un perfil, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ACTUALIZAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  un  PerfilDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar un Perfil, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  PerfilDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un Perfil, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  PerfilDTO. Por favor valide la traza completa de la excepcion presentada";
		
		
	}
	
	public static final class PeriodoFuncionamientoFacadeImpMessage{
		private PeriodoFuncionamientoFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear un nuevo periodo de funcionamiento, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un nuevo PeriodoFuncionamientoDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de un periodo funcionamiento, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de modificar la informacion  un  PeriodoFuncionamientoDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar un periodo funcionamiento, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  PeriodoFuncionamientoDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un periodo funcionamiento, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  PeriodoFuncionamientoDTO. Por favor valide la traza completa de la excepcion presentada";
		
		
	}
	public static final class ReservaFacadeImpMessage{
		private ReservaFacadeImpMessage() {
			
		}
		public static final String GENERAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de generar una nueva reserva, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String GENERAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de generar una ReservaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de una reserva , Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de modificar la informacion  una  ReservaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar una reserva, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las  ReservaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CANCELAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de cancelar una reserva, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CANCELAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de cancelar una  ReservaDTO. Por favor valide la traza completa de la excepcion presentada";
		
	}
	public static final class SolicitudFacadeImpMessage{
		private SolicitudFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear una nueva solicitud, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear una nueva SolicitudDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ENVIAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de enviar la solicitud, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ENVIAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de enviar una   SolicitudDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar una solicitud, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las  SolicitudDTO. Por favor valide la traza completa de la excepcion presentada";

	}
	public static final class UsuarioFacadeImpMessage{
		private UsuarioFacadeImpMessage() {
			
		}
		
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear un nuevo usuario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un nuevo UsuarioDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de un usuario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  un  UsuarioDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar un usuario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  UsuarioDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un usuario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  UsuarioDTO. Por favor valide la traza completa de la excepcion presentada";
	}
}

