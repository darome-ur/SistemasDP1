package EJ1;

import java.io.*;


public class E2 {
	
	public static void main(String[] args)
	{
		//Por bloques
		
		InputStream i = null;
		Writer o = null;
		
		try
		{
			
			i = new FileInputStream(args[0]);
			//o = new FileOutputStream(args[1]);
			o = new OutputStreamWriter(args[1],"UTF-8");
		
	
				byte[] b = new byte[1024];
				int leidos = i.read(b);
				while (leidos != -1)
				{
					o.write(b, 0, leidos);
					leidos = i.read(b);
					//Usar un writer para la codificacion en args[1]
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
