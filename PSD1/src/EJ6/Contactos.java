package EJ6;

import java.io.Serializable;
import java.util.*;


public class Contactos implements Serializable{
	
	public static class Datos implements Serializable{
		 private String email;
		 private String tfno;
		 public Datos(String email, String telefono) {
		 this.email = email;
		 this.tfno = telefono;
		 }
		 public String getTfno() {
		 return tfno;
		 }
		 public String getEmail() {
		 return email;
		 }
	}

		 private Map<String, Datos> agenda = new HashMap<String, Datos>();
		 
		 private int TamañoMAximoAgenda = 500;
		 
		 public void addDatos(String nombre, String tfno, String email) {
		 agenda.put(nombre, new Datos(email, tfno));
		 }
		 
		 public String getTfno(String nombre) {
		 return agenda.get(nombre).getTfno();
		 }
		public String getEmail(String nombre) {
		 return agenda.get(nombre).getEmail();
		 }
		public int tamaño()
		{
			return 0;
		}


}
