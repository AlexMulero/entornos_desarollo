package ud2;

public class EjerFibo 
{

	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int acum = 0;
		
		for( int i = 0; i <= 25; i++) {
			System.out.println(acum);
			acum = num1 + num2;
			num1 = num2;
			num2 = acum;
		}

	}

}
