package EJ4;

import java.io.*;


public class E4W1252 {
	public void main(String[] args) {
		
		File fo = new File("Ew1252.txt");
		File f1 = new File("fichero.txt");
	
		try {
				FileOutputStream os = new FileOutputStream(fo);
				FileInputStream fis = new FileInputStream(f1);
				BufferedReader r = new BufferedReader(new InputStreamReader(fis,"windows-1252"));
				String linea;
				while((linea = r.readLine()) != null)
				{
					System.out.println(linea);
					linea = r.readLine();
				}
			}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}

}
