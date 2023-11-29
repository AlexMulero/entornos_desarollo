package ud2;
//Muestre los numeros del 1 al 10 y los suma todos
public class Ejemplo1 
{

	public static void main(String[] args) 
	{
		int suma = 0;
		for (int i=0; i < 10; i++) {
			System.out.println(i);
			suma = suma + i;
		}
		System.out.println(suma);
	}

}
