package EJ1;

import java.io.*;


public class E2 {
	
	public static void main(String[] args)
	{
		//Por bloques
		
		InputStream i = null;
		OutputStream o = null;
		
		try
		{
			
			i = new FileInputStream(args[0]);
			o = new FileOutputStream(args[1]);
		
	
				byte[] b = new byte[100];
				int leidos = i.read(b);
				while (leidos != -1)
				{
					o.write(b, 0, leidos);
					leidos = i.read(b);
				}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				i.close();
				o.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		 
	}

}
