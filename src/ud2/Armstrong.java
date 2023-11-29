package ud2;

import java.util.Scanner;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		boolean valor = false;
		int cont = 0;
		
		while(!valor) 
		{
			System.out.println("Introduce uno a uno los numeros que componen el numero que quieres(ingrese un número negativo para terminar):");
			int numero = entrada.nextInt();
			if(numero < 0) {
				valor = false;
			}
			else {
				cont++;
			}
		}
		
		

	}

}
