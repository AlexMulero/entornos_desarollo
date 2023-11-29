package ud2;

import java.util.Scanner;

public class Primo 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int numero = entrada.nextInt();
		int cont = 0;
		
		for(int i = 2; i < numero ; i++) {
			if(numero % i == 0) {
				cont++;
			}
		}
		
		if(cont > 0 ) {
			System.out.println(numero + " no es primo.");
		}
		else {
			System.out.println(numero + " es primo.");
		}
	}

}
