package ejerciciosMartes;

import java.util.*;

public class PrincipalOxxo {

	public static void main(String[] args) {
		
		
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto("Coca Cola",30.0,"Bebidas"));
		productos.add(new Producto("Papas Sabritas",15.0,"Frituras"));
		productos.add(new Producto("Tortillinas", 20.5, "Categoria 3"));
		
		ClienteSM cliente = new ClienteSM("cliente perez", 500.0 ,"efectivo", productos);
		System.out.println(cliente);
		
		CajeroSM cajero = new CajeroSM("Juan perez", "domicilio", "123456789");
		
		cajero.cobrar(cliente);
		
		
	}
	
}
