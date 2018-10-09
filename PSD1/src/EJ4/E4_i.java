package EJ4;

import java.io.*;

public class E4_i 
{
	
	public static void main(String[] args) 
	{
		try {
			File fichero = new File("fichero.txt");
			String contenido = "Lapiz a 1€.";
		
			FileOutputStream fos = new FileOutputStream(fichero);
			Writer w = new OutputStreamWriter(fos,"UTF-8");
			w.write(contenido); //grabarlo en el writer
			w.flush();//manda al fichero
			w.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
