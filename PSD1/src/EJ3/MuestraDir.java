package EJ3;

import java.io.*;
import java.util.Date;


public class MuestraDir {

	public static void main(String[] args) throws IOException {
		
		File d = new File(args[0]);
		if(d.exists()) 
		{
			if(d.isDirectory())
			{
				File contenido[] = d.listFiles();
				
				for(File f:contenido)
				{
					Date fecha = new Date(f.lastModified()); ;
					if(f.isDirectory())
					{
						System.out.println("Directorio: " + f.getName() + " Tamaño: " + f.length() + " Fecha: " + fecha);
					}
					else
					{
						System.out.println("Fichero: " + f.getName() + " Tamaño: " + f.length() + " Fecha: " + fecha);
					}
				}
			}
		}
		else
		{
			System.out.println("No existe.");
		}
		
	}
	
}
