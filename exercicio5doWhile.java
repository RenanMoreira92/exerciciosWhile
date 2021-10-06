package Familia36;

import java.util.*;

public class exercicio5doWhile {

	public static void main(String[] args) {
		
		int x,somax=0;
		
		Scanner leia = new Scanner(System.in);
		 
		do 
		{	
			System.out.println("\nEntre com um numero: ");
			
			x = leia.nextInt();
			
		if (x >=1)
			{
				somax += x;
			}
		}
			
		
		while( x!=0);
		System.out.printf("\nA soma é igual a : %d", somax);

}
}
