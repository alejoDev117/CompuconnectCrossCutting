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
	
	public static final class AgendaFacadeImpMessage{
		private AgendaFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear una nueva agenda, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear una nueva AgendaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de una agenda, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  una AgendaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar una agenda, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las AgendaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una agenda, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar una AgendaDTO. Por favor valide la traza completa de la excepcion presentada";

	}
	public static final class AgendaReservaFacadeImpMessage{
		private AgendaReservaFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear el vinculo de agenda y reserva. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear AgendaReservaDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las reservas en agendas. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las AgendaReservaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de cancelar una reserva en una agenda. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar AgendaReservaDTO. Por favor valide la traza completa de la excepcion presentada....";
		
	}
	
	public static final class BuzonSolicitudFacadeImpMessage{
		private BuzonSolicitudFacadeImpMessage() {
			
		}
		public static final String GENERAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de vincular una solicitud con el buzon de solicitudes. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String GENERAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de generar BuzonSolicitudDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las solicitudes en el buzon. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las BuzonSolicitudDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ACTUALIZAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar el buzon de solicitudes. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ACTUALIZAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de actualizar  BuzonSolicitudDTO. Por favor valide la traza completa de la excepcion presentada....";
		
	
	}
	public static final class CentroInformaticaEquipoComputoFacadeImpMessage{
		private CentroInformaticaEquipoComputoFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de vincular un equipo computo con un centro de informatica. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un CentroInformaticaEquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los equipos de computo disponibles en un centro informatica. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los CentroInformaticaEquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un equipo computo de un centro informatica. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar  un CentroInformaticaEquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class ContenidoFacadeImpMessage{
		private ContenidoFacadeImpMessage() {
	}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear un contenido. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un ContenidoDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los contenidos. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los ContenidoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un contenido Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar  un ContenidoDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class DestinatarioFacadeImpMessage{
		private DestinatarioFacadeImpMessage() {
	}
		public static final String REGISTRAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar un nuevo destinatario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String REGISTRAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de registrar un nuevo DestinatarioDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de un destinatario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de actualizar la informacion  un  DestinatarioDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar un destinatario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  DestinatarioDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un destinatario, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  DestinatarioDTO. Por favor valide la traza completa de la excepcion presentada";
	}
	public static final class DestinatarioNotificacionFacadeImpMessage{
		private DestinatarioNotificacionFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de vincular una notificacion con un destinatario. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un DestinatarioNotificacionDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las notificaciones asociadas a destinatarios. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los DestinatarioNotificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una notificacion de un destinatario. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar  un DestinatarioNotificacionDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class DetalleReservaFacadeImpMessage{
		private DetalleReservaFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear el detalle de una reserva, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un nuevo DetalleReservaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar el detalle de una reserva, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de modificar la informacion  un  DetalleReservaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los detalles de una reserva , Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los  DetalleReservaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un detalle de reserva, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un  DetalleReservaDTO. Por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ExcepcionAgendaFacadeImpMessage{
		private ExcepcionAgendaFacadeImpMessage() {
			
		}
		public static final String ASIGNAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de asingar una excepcion a una agenda. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ASIGNAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de asignar un ExcepcionAgendaDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las excepciones asigandas en agendas. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las ExcepcionAgendaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una excepcion asignada a una agenda. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar una ExcepcionAgendaDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class HorarioPersonaEncargadaFacadeImpMessage{
		private HorarioPersonaEncargadaFacadeImpMessage() {
			
		}
		public static final String ASIGNAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de asingar el horario a una persona encargada. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ASIGNAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de asignar un HorarioPersonaEncargadaDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los horarios de personas encargadas. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los HorarioPersonaEncargadaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un horario de una persona encargada. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un HorarioPersonaEncargadaDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class NotificacionFacadeImpMessage{
		private NotificacionFacadeImpMessage() {
			
		}
		public static final String GENERAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de generar una notificacion. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String GENERAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de generar una NotificacionDTO. Por favor valide la traza completa de la excepcion presentada....";
		
	}
	public static final class PeriodoFuncionamientoDiaFestivoFacadeImpMessage{
		private PeriodoFuncionamientoDiaFestivoFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de vincular un dia festivo a un periodo funcionamiento. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un PeriodoFuncionamientoDiaFestivoDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los dias asociados a un periodo de funcionamiento. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los PeriodoFuncionamientoDiaFestivoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un dia festivo en un periodo funcionamiento. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar  un PeriodoFuncionamientoDiaFestivoDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class PersonaEncargadaFacadeImpMessage{
		private PersonaEncargadaFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear una persona encargada, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear una nueva  PersonaEncargadaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String MODIFICAR_EXCEPCTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de una persona encargada, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String MODIFICAR_EXCEPTION_TECHNICAL_MESSAGE ="Se ha presentado una excepcion no conocida tratando de modificar la informacion  una  PersonaEncargadaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las personas encargadas, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las  PersonaEncargadaDTO. Por favor valide la traza completa de la excepcion presentada";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una persona encargada, Por favor intente nuevamente y si persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar una PersonaEncargadaDTO. Por favor valide la traza completa de la excepcion presentada";
	
	}
	public static final class ReservaPerfilFacadeImpMessage{
		private ReservaPerfilFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de vincular una reserva a un perfil. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear un ReservaPerfilDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las reservas asociadas a un perfil. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las ReservaPerfilDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una reserva de un perfil. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar  una ReservaPerfilDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class RespuestaFacadeImpMessage{
		private RespuestaFacadeImpMessage() {
			
		}
		public static final String REALIZAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de generar la respuesta. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String REALIZAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de generar RespuestaDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las respuestas. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las RespuestaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una respuesta. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar  una RespuestaDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class SoftwareEquipoComputoFacadeImpMessage{
		private SoftwareEquipoComputoFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear el vinculo entre el software y el equipo computo. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de generar SoftwareEquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los softwares instalados en un equipo de computo. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los SoftwareEquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un software de un equipo de computo. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un SoftwareEquipoComputoDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class SolicitudPerfilFacadeImpMessage{
		private SolicitudPerfilFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de crear el vinculo entre el solicitud y el perfil. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de generar SolicitudPerfilDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar las solicitudes asociadas a un perfil. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar las SolicitudPerfilDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar una solicitud de un perfil. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar una SolicitudPerfilDTO. Por favor valide la traza completa de la excepcion presentada....";
	}
	public static final class TiempoFuncionamientoCentroInformaticaFacadeImpMessage{
		private TiempoFuncionamientoCentroInformaticaFacadeImpMessage() {
			
		}
		public static final String CREAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de configurar el tiempo de funcionamiento de un centro de informatica. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CREAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de crear TiempoFuncionamientoCentroInformaticaDTO. Por favor valide la traza completa de la excepcion presentada....";
		public static final String CONSULTAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar los tiempos en los que funciona un centro de informatica. Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String CONSULTAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de listar los TiempoFuncionamientoCentroInformaticaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String ELIMINAR_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar un tiempo de funcionamiento de un centro de informatica . Por favor intente nuevamente y si el problema persiste comuniquese con el administrador de sistema...";
		public static final String ELIMINAR_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocida tratando de eliminar un TiempoFuncionamientoCentroInformaticaDTO. Por favor valide la traza completa de la excepcion presentada....";
		
		
	}
	public static final class DAOFactoryMessage{
		private DAOFactoryMessage() {
			
		}
		public static final String DATA_BASE_NO_IMPLEMENT_EXCEPTION = "La fuente de datos especificada no esta implementada...";
	}

	public static final class IdentificadorValidationMessage{
		private IdentificadorValidationMessage() {
			
		}
		public static final String IDENTIFICADOR_EMPTY_MESSAGE = "No es posible continuar con el identificador  vacio...";
		public static final String IDENTIFICADOR_DEFAULT_MESSAGE = "No es posible tener el identificador por defecto...";
	}
	
	
	public static final class CentroInformaticaControllerMessage{
		private CentroInformaticaControllerMessage() {
			
		}
		public static final String GET_RESPONSE_SUCCESSFULLY = "Se han consultado los centros de informatica exitosamente...";
		
	}
	public static final class SqlDAOMessage{
		private SqlDAOMessage() {
			
		}
		public static final String SET_CONNECTION_EXCEPTION_USER_MESSAGE ="Se ha presentado un error tratando de llevar a cabo la operacion deseada por favor intente de nuevo y si el problema persiste contecte al administrador del sistema";
		public static final String SET_CONNECTION_EXCEPTION_TECHNICAL_MESSAGE = "No se ha podido crear el SqlDAO debido a que la conexion no esta abierta";
	}
	public static final class AgendaPostgresqlDAOMessage{
		private AgendaPostgresqlDAOMessage() {
			
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva agenda...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase AgendaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion de la nueva agenda...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase AgendaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de una agenda...";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo delete de la clase AgendaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion de una agenda...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo delete de la clase AgendaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de una agenda...";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo update de la clase AgendaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion de una agenda...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo update de la clase AgendaPostgresqlDAO.Por favor verifique la traza completa del error...";
		
	}
	
	public static final class AgendaReservaPostgresqlDAOMessage{
		private AgendaReservaPostgresqlDAOMessage() {
			
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva agenda reserva...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase AgendaReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion de la nueva agenda reserva...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase AgendaReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de una agenda...";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo delete de la clase AgendaReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion de una agenda reserva...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo delete de la clase AgendaReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de una agenda reserva...";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo update de la clase AgendaReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion de una agenda reserva...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo update de la clase AgendaReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class CentroInformaticaPostgresqlDAOMessage{
		private CentroInformaticaPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo centro informatica...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase CentroInformaticaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo centro informatica...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase CentroInformaticaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de un centro informatica...";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo delete de la clase CentroInformaticaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion de un centro informatica...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo delete de la clase CentroInformaticaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de un centro informatica...";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo update de la clase CentroInformaticaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion de un centro informatica...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo update de la clase CentroInformaticaPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class DetalleReservaPostgresqlDAOMessage{
		private DetalleReservaPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo detalle reserva...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase DetalleReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo detalle reserva...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase DetalleReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de un detalle reserva...";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo delete de la clase DetalleReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion de un detalle reserva...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo delete de la clase DetalleReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de un detalle reserva...";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo update de la clase DetalleReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion de un detalle reserva...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo update de la clase DetalleReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class DiaSemanalPostgresqlDAOMessage{
		private DiaSemanalPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del dia semanal...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase DiaSemanalPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del dia semanal...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase DiaSemanalPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class EstadoPeriodoFuncionamientoPostgresqlDAOMessage{
		private EstadoPeriodoFuncionamientoPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado periodo funcionamiento...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase EstadoPeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo estado periodo funcionamiento...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase EstadoPeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class FrecuenciaPostgresqlDAOMessage{
		private FrecuenciaPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva frecuencia...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase FrecuenciaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion de la nueva frecuencia...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase FrecuenciaPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class PeriodoFuncionamientoPostgresqlDAOMessage{
		private PeriodoFuncionamientoPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo periodo funcionamiento...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase PeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo periodo funcionamiento...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase PeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de un periodo funcionamiento...";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo delete de la clase PeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion de un periodo funcionamiento...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo delete de la clase PeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de un periodo funcionamiento...";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo update de la clase PeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion de un periodo funcionamiento...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo update de la clase PeriodoFuncionamientoPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class ReservaPostgresqlDAOMessage{
		private ReservaPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva reserva...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase ReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion de la nueva reserva...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase ReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de una reserva...";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo delete de la clase ReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion de una reserva...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo delete de la clase ReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de una reserva...";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo update de la clase ReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion de una reserva...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo update de la clase ReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class TipoIdentificacionPostgresqlDAOMessage{
		private TipoIdentificacionPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo identificacion...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase TipoIdentificacionPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion  del nuevo tipo identificacion...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase TipoIdentificacionPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class TipoNotificacionPostgresqlDAOMessage{
		private TipoNotificacionPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo notificacion...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase TipoNotificacionPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion  del nuevo tipo notificacion...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase TipoNotificacionPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class TipoReservaPostgresqlDAOMessage{
		private TipoReservaPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo reserva...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase TipoReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion  del nuevo tipo reserva...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase TipoReservaPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class TipoUsuarioPostgresqlDAOMessage{
		private TipoUsuarioPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo usuario...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase TipoUsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion  del nuevo tipo usuario...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase TipoUsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
	
	public static final class UsuarioPostgresqlDAOMessage{
		private UsuarioPostgresqlDAOMessage(){
		
		}
		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo usuario...";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo create de la clase UsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo usuario...";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo create de la clase UsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del usuario...";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo delete de la clase UsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion del usuario...";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo delete de la clase UsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion de un usuario...";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SqlException en el metodo update de la clase UsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion de un usuario...";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema no conocido en el metodo update de la clase UsuarioPostgresqlDAO.Por favor verifique la traza completa del error...";
	}
}




