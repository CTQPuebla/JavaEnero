package Modelo;

public class Juego {
	private String interfaz;
	private String[][] contenido;
	private boolean estatus;
	
	public Juego() {
		contenido = new String [3][3];
		for (int i = 0 ; i < contenido.length ; i++) {
			for (int j = 0 ; j < contenido[i].length ; j++) {
				contenido[i][j] = "";
			}
		}
		this.interfaz = ""
				+ "      A    B    C\n\n"
				+ " 1     "+ contenido[0][0] +"  |  "+ contenido[0][1] +"  |  "+ contenido[0][2] +" \n"
				+ "      ------------\n"
				+ " 2     "+ contenido[1][0] +"  |  "+ contenido[1][1] +"  |  "+ contenido[1][2] +" \n"
				+ "      ------------\n"
				+ " 3     "+ contenido[2][0] +"  |  "+ contenido[2][1] +"  |  "+ contenido[2][2] +" \n";
		this.estatus = true;
	}

	public String getInterfaz() {
		return interfaz;
	}

	public void setInterfaz(String interfaz) {
		this.interfaz = interfaz;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
