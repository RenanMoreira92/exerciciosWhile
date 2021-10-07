package Familia36;

import java.util.Scanner;

public class exercicio3array 
{
	public static void main(String[] args) {
		
		
		
		int M[][] = new int[3][3];
		int x=0, linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha=0; linha<3; linha++)
		{
			for (coluna=0; coluna<3; coluna++)
			{
				System.out.println("\n: Entre com um número: ");
				M[linha][coluna] = leia.nextInt();
				
				if(M[linha][coluna]>=10)
			     {
			    	 x++;
			     }
			}
		}
		
		System.out.printf("\n: Os números a mais de 10 são: %d ",x);
		     
	}
}


