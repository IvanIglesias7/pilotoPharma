package pilotoPharma.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

	public Connection ConectarBD() throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:postgresql://127.0.0.1:5432/pilotopharma";
		String usuario = "postgres";
		String clave = "1234";
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, usuario, clave);
		
	
		if(con != null)
			System.out.println("Conectado a la base de datos");
		else
			System.out.println("No se ha conectado a la base de datos");
		
		
		return con;
		
	}
}
