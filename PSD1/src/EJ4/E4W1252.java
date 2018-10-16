package EJ4;

import java.io.*;


public class E4W1252 {
public static void main(String[] args) {
		
		File fo = new File("Ew1252.txt");
		FileOutputStream os =null;
	Writer r =null;
		try {
				os = new FileOutputStream(fo);
				r= new OutputStreamWriter(os,"windows-1252");
				r.write("Lápiz a 1€");
				r.close();
			}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally {
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
