package EJ1;

import java.io.*;

public class E1 {
	
	public static void main(String[] args)
	{
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
			f = new File("C:\\Users\\darome\\Desktop\\P1.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			/* alternativa:
			 * BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\darome\\Desktop\\P1.txt"));
			 *String linea = br.readLine();
			 *while (linea != null)
			 *{
			 *   ...
			 *   linea = br.readLine();
			 *}
			 */
			
			String linea;
			int c = 0;
			int index;
			while ((linea = br.readLine()) != null)
			{
				System.out.println(linea);
				index=linea.indexOf("DRL");
				while(index != -1) //si no la necuntra devuelve -1
				{
					c ++;
					index = linea.indexOf("DRL", index + 3 );
				}
				
			}
			
			System.out.println("Las iniciales DRL aparecen " + c + " veces.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{                    
	            if( null != fr )
	            {   
	               fr.close();     
	            }                  
	         }catch (Exception e2)
			 { 
	            e2.printStackTrace();
	         }
		}
		 
	}

}
