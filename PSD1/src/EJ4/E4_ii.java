package EJ4;

import java.io.*;

public class E4_ii {
	
	public static void main(String[] args)
	{
		// Parte 1:
		File f = new File("fichero.txt");
		try
		{
			
			FileInputStream is = new FileInputStream(f);
			byte[] leido = new byte[1024];
			int leidos;
			while((leidos=is.read(leido)) != -1)
			{
				System.out.println(leidos);
				leidos = is.read(leido);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Comienza parte 2: ");
		// Parte 2:
			try
			{
				FileInputStream fis = new FileInputStream(f);
				BufferedReader r = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
				String linea;
				while((linea = r.readLine()) != null)
				{
					System.out.println(linea);
					linea = r.readLine();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("Comienza parte 3: ");
			
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedReader r = new BufferedReader(new InputStreamReader(fis,"windows-1252"));
			String linea;
			while((linea = r.readLine()) != null)
			{
				System.out.println(linea);
				linea = r.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//Se lee correctamente la codificación en UTF-8.
	//Ya que al tener mas bytes por caracter tiene mayor numero de simbolos  lo que incluye el del euro.

}
