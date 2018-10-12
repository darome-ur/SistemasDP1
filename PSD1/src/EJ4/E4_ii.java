package EJ4;

import java.io.*;

public class E4_ii {
	
	public static void main(String[] args)
	{
		// Parte 1:
		try
		{
			File f = new File("fichero.txt");
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
		// Parte 2:
			try
			{
				File f = new File("fichero.txt");
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String linea;
				int leidos;
				while((linea=br.readLine()) != null)
				{
					System.out.println(linea);
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
	}

}
