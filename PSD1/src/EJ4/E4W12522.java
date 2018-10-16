package EJ4;

import java.io.*;


public class E4W12522 {
	
	public static void main (String args[])
	{
		File fo = new File("Ew1252.txt");
		File fi = new File("fichero.txt");
		FileReader fr = null;
		FileOutputStream os =null;
		Writer r =null;
		BufferedReader br = null;
		try 
		{	
			fr = new FileReader(fi);
			os = new FileOutputStream(fo);
			br = new BufferedReader(fr);
			r= new OutputStreamWriter(os,"windows-1252");
			String linea;
			while((linea = br.readLine()) != null)
			{
				
			}
			r.write(linea);
			r.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if (r!= null)
			{
				try {
					r.close(); //se cierra tambien os 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	 }
}


