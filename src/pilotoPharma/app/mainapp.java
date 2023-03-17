package pilotoPharma.app;

import pilotoPharma.conexion.conexion;

public class mainapp {

	public static void main(String[] args) {
		
		conexion conex = new conexion();
		
		conex.ConectarBD();

	}

}
