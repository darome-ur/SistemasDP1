package Ej7;
import java.io.*;
public class EJ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fis= new FileReader("miConfiguracion.txt");
			BufferedReader r = new BufferedReader(fis);
			String linea;
			int lineasC = 0;
			int lineasNoC = 0;
			while((linea = r.readLine())!=null)
			{
				if(linea.contains(":"))
				{
					String[] partes = linea.split("\\:");
					partes[0] = "DRL";
					linea = partes[0] + ":" + partes[1];
					lineasC++;
				}
				else
				{
					lineasNoC++;
				}
				System.out.println(linea);
			}
			System.out.println("LineasC: "+lineasC);
			System.out.println("LineasNoC: "+lineasNoC);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
