package pilotoPharma.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

	private final String url = "jdbc:postgresql://127.0.0.1:5432/pilotoPharma";
	private final String usuario = "postgres";
	private final String clave = "1234";

	public Connection ConectarBD() {

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, usuario, clave);
			System.out.println("Conectado a Base de datos");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return con;

	}
}
