package Familia36;

import java.util.Scanner;

//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.

public class execicio2vetor {
	
	
	
public static void main(String[] args) {
		
		
		int numero[]=new int[6];
		int x, somapar=0, contimpar=0, contpar=0, quantimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for (x=0; x<6; x++)
		{
			System.out.println("\n Insira o número desejado: ");
			numero[x]  = leia.nextInt();
			
			
		}
		System.out.println("os numeros pares");
        for(x=0;x<6;x++) 
           {
                if(numero[x]%2==0){ // par
                somapar+=numero[x];
                System.out.print(" " +numero[x]+" /");
            }
        }
        System.out.println("\nOs numeros impares");
        for(x=0;x<6;x++) 
        {
            if(numero[x]%2!=0)
            {
                quantimpar++;
                System.out.printf(" "+numero[x]+ " /");
            }
        }
		
		System.out.println ("\nA soma dos números pares foi de: " +somapar );
		System.out.println ("\nA quantidade de números ímpares foi de : "+quantimpar );
		
		
		
		
	}

}

