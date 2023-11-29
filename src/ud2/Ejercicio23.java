package ud2;

import java.util.Scanner;

public class Ejercicio23 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		boolean valor = false;
		double acum = 0;
		double cont = 0;
		
		while (valor == false) {
			System.out.println("Introduce un numero: ");
			double numero = entrada.nextInt();
			if(numero != 0) {
				acum = acum + numero;
				cont++;
			}
			else if ( numero == 0) {
				valor = true;
			}
		}
		
		double media = acum / cont ;	
			
		System.out.println("La media de todos los numeros introducidos es: " + media );
		
		
	}

}
