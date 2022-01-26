package pkg;

public class Principal {
	
	public static void main(String[] args) {
		
		Remitente r1 = new Remitente("Luis Angeles", "Palmira 512", 22032020 , 123123 );
		
		Destinatario d1 = new Destinatario("Delhi Villegas" , "callejon bonito 9" , 22032020 , 123123 );
		
		Paquete Paq = new Paquete(123123 , 15092021 , "Luis Angeles" , "Delhi Villegas");
		
		
		
	}

}
