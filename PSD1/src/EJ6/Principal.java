package EJ6;
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Datos contacto1 = new Datos("dromelalanza@gmail.com","690024227");
		
		try
		{
			Contactos c = new Contactos();
			c.addDatos("David", "690024227", "dromelalanza@gmail.com");
			FileOutputStream fos = new FileOutputStream("Ejercicio6.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
