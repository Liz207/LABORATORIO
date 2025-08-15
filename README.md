Clase DBConnection / ConexionBD

Contiene los parámetros de conexión (url, usuario, password).

Usa JDBC para abrir y cerrar conexiones con la base de datos.

Es el “puente” entre Java y SQL Server/PostgreSQL/Oracle.

Clases DAO (Data Access Object)

Cada clase maneja una tabla (ej. VueloDAO, ReservaDAO, PasajeroDAO).

Dentro tienen métodos como:

listarVuelos() → devuelve la lista de vuelos disponibles.

crearReserva() → inserta una nueva reserva en la BD.

consultarItinerario() → devuelve los vuelos asociados a una reserva/pasajero.

Modelo (POJOs – Plain Old Java Objects)

Clases simples que representan entidades (Vuelo, Reserva, Pasajero).

Tienen solo atributos, constructores y getters/setters.
Interfaz (Consola o Swing/JFrame)

Dependiendo de cómo lo armaste, puede ser consola o ventana.

Permite al usuario:

Buscar vuelos.

Reservar un vuelo.

Consultar itinerarios.

Flujo básico del programa

El usuario abre la aplicación → se conecta la BD.

Elige una opción en menú: buscar, reservar, consultar.

El sistema llama a los métodos DAO, que ejecutan sentencias SQL (SELECT, INSERT, JOIN).

Se muestran resultados o mensajes de confirmación.
Descripción

Este proyecto implementa un Sistema de Reservas de Vuelo como práctica integral de bases de datos.
Integra:

Normalización y modelado relacional.

Implementación en SQL (DDL + DML + DCL).

Administración avanzada de roles, vistas, triggers y encriptación.

Aplicación Java (NetBeans + JDBC) que se conecta a la base de datos para gestionar reservas.
Estructura:
/modelado      -> Diagramas UML, DER y normalización
/scripts       -> SQL de creación, inserción, vistas, triggers y funciones
/java          -> Código Java (NetBeans Ant Project)
/doc           -> Documentación y capturas de la práctica
/backup        -> Respaldo completo de la base de datos
Funcionamiento del Código Java

El código dentro de /java se organiza en capas:

1. Conexión a la BD (DBConnection.java)

Centraliza la configuración de la conexión (URL, usuario, contraseña).

Usa JDBC para abrir/cerrar conexiones.

Se utiliza en todas las clases DAO para interactuar con la base de datos.
Connection con = DriverManager.getConnection(url, usuario, password);
2. Modelos (POJOs)

Clases como Vuelo, Reserva, Pasajero.

Representan entidades de la BD.

Contienen atributos, constructores y getters/setters.
public class Vuelo {
    private int idVuelo;
    private String origen;
    private String destino;
    private Date fecha;
    // getters y setters
}
3. Acceso a Datos (DAO)

Clases que ejecutan operaciones SQL usando la conexión.

Principales métodos:

listarVuelos() → SELECT de vuelos disponibles.

crearReserva(Reserva r) → INSERT en tabla reservas.

consultarItinerario(int idCliente) → SELECT con JOIN entre vuelos y reservas.
public List<Vuelo> listarVuelos() {
    String sql = "SELECT * FROM Vuelos";
    // Ejecuta consulta y devuelve lista de objetos Vuelo
}
Interfaz de Usuario

Puede ser en consola o con formularios Swing.

Permite al usuario:

Buscar vuelos disponibles.

Crear una reserva.

Consultar itinerarios.

Llama a los métodos DAO y muestra resultados al usuario.
Flujo General

El usuario abre la aplicación en NetBeans.

Se conecta a la BD mediante DBConnection.

Se muestran opciones de menú.

Dependiendo de la elección:

Buscar vuelos → VueloDAO.listarVuelos().

Crear reserva → ReservaDAO.crearReserva().

Consultar itinerario → ReservaDAO.consultarItinerario().

Los resultados se muestran en pantalla.
![Imagen de WhatsApp 2025-08-14 a las 20 47 45_1786646b](https://github.com/user-attachments/assets/b4cd93c5-48b5-4b18-a932-0a0f73e2d7bc)
![Imagen de WhatsApp 2025-08-14 a las 20 53 56_4d092f0b](https://github.com/user-attachments/assets/f3607d98-60a0-46ce-8f20-c8653bc2c538)
![Imagen de WhatsApp 2025-08-14 a las 20 56 03_653c8607](https://github.com/user-attachments/assets/812b374b-1c00-4448-a33e-a862371275fe)
![Imagen de WhatsApp 2025-08-14 a las 20 57 04_fa5ec415](https://github.com/user-attachments/assets/bc8b6fd2-ef92-4164-9a1f-a487d339f5d3)





