package com;

import java.util.HashMap;

public class Principal {

	
	public static void main(String []args) {
		
		HashMap<String ,Ciudad>hs =new HashMap<String,Ciudad>();
		HashMap<String  ,Boleto>hsm =new HashMap<String,Boleto>();
		
		Ciudad c1=new Ciudad("Veracruz",200);
		Ciudad c2=new Ciudad("Morelos",8);
		Ciudad c3=new Ciudad("Guanajuato",9);
		Ciudad c4=new Ciudad("Guerrero",6);
		
		hs.put(c1.getNombre(),c1);
		hs.put(c2.getNombre(),c2);
		hs.put(c3.getNombre(),c3);
		hs.put(c4.getNombre(),c4);
		
		Conductor conduc=new Conductor("jose","licencia","5454656",5454545);
		Conductor conduc1=new Conductor("juan","licencia","988455",5454451);
		Conductor conduc2=new Conductor("arturo","licencia","6554546",6564821);
		Conductor conduc3=new Conductor("arturo","licencia","6554546",6564821);
		AutobusClaseAlta alta=new AutobusClaseAlta(215545,"10 pm",conduc,151545,hs,"Veracruz");
		AutobusClaseAlta alta2=new AutobusClaseAlta(215545,"10 pm",conduc2,151545,hs,"Morelos");
		AutobusClaseBaja baja=new AutobusClaseBaja(215545,"10 pm",conduc1,hs,"Veracruz");
		AutobusClaseBaja baja2=new AutobusClaseBaja(215545,"10 pm",conduc3,hs,"Guanajuato");
		Object tipoAltaBaja=alta;
		Object tipoAltaBaja2=alta2;
		Object Baja=baja;
		Object Baja2=baja2;
		
		Persona per=new Persona();
		
		Cliente cte=new Cliente("daly",25);
		Cliente cte1=new Cliente("rosa",25);
		Cliente cte2=new Cliente("pedro",25);
		Cliente cte3=new Cliente("maria",25);
		
		Negocio ngo=new Negocio("ADO","col. centro");
		
		Boleto bole=new Boleto(cte,1355,ngo,Baja,"Veracruz");
		Boleto bole2=new Boleto(cte1,1895,ngo,tipoAltaBaja,"Veracruz");
		Boleto bole3=new Boleto(cte2,3254,ngo,tipoAltaBaja2,"Morales");
		Boleto bole4=new Boleto(cte3,9846,ngo,Baja2,"Guanajuato");
	hsm.put(bole.getCliente().nombre, bole);
		hsm.put(bole2.getCliente().nombre, bole2);
		hsm.put(bole3.getCliente().nombre, bole3);
		hsm.put(bole4.getCliente().nombre, bole4);
		System.out.println(hsm.toString());
		System.out.println(hsm.get("rosa"));
		
		for(String k:hsm.keySet()) {
			if(hsm.get(k).getDestino().equals("Veracruz")) {
				System.out.println(hsm.get(k));
			}
		}
		
//		System.out.println(bole);
//		System.out.println(bole2);
//		System.out.println(bole3);
//		System.out.println(bole4);

}}
