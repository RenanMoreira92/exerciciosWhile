package Familia36;

import java.util.Scanner;

public class exercicio4while
{
	public static void main(String[] args) {
		Scanner info= new Scanner(System.in);
		int idade=0,genero=0,psico=0,calmas=0,Mnervo=0,Hagre=0,Ocalmos=0,nervo=0,menorcalmo=0,pessoas=0;
		
		System.out.println("Por favor digite sua idade.");
		idade=info.nextInt();
		System.out.println("Por favor escolha seu genero:"
				+ "\n1-Feminino"
				+ "\n2-Masculino"
				+ "\n3-Outros");
		genero=info.nextInt();
		while(genero<1 || genero>3) {
			System.out.println("Genero invalido Digite novamente");
			genero=info.nextInt();
		}
		
		System.out.println("Selecione a caracteristica que mais se assemelhar a voce:"
				+ "\n1-Voce é uma pessoa calma"
				+ "\n2-Voce é uma pessoa nervosa"
				+ "\n3-Voce é uma pessoa agressiva");
		psico=info.nextInt();
		while(psico<1 || psico>3) {
			System.out.println("Caracteristica invalida digite novamente");
			psico=info.nextInt();
		}
		
		while(pessoas!=5) {
			
			if (psico==1) {	
				calmas++;
			}
			if(genero==1 && psico==2) { 
				Mnervo++;
			}
			if(genero==2 && psico==3) { 
				Hagre++;
			}
			if(genero==3 && psico==1) { 
				Ocalmos++;
			}
			if(idade>=40 && psico==2) {
				nervo++;
			}
			if(idade<=18 && psico==1) {
				menorcalmo++; 
			}
			System.out.println("Por favor digite sua idade.");
			idade=info.nextInt();
			System.out.println("Por favor escolha seu genero:"
					+ "\n1-Feminino"
					+ "\n2-Masculino"
					+ "\n3-Outros");
			genero=info.nextInt();
			while(genero<1 || genero>3) {
				System.out.println("Genero invalido Digite novamente");
				genero=info.nextInt();
			}
			System.out.println("Selecione a caracteristica que mais se assemelhar a voce:"
					+ "\n1-Voce é uma pessoa calma"
					+ "\n2-Voce é uma pessoa nervosa"
					+ "\n3-Voce é uma pessoa agressiva");
			psico=info.nextInt();
			while(psico<1 || psico>3) {
				System.out.println("Caracteristica invalida digite novamente");
				psico=info.nextInt();
			}
			pessoas++;
		}
		
		System.out.printf("\nO numero de pessoas calmas: %d", calmas);
		System.out.printf("\nO numero de Mulheres Nervosas: %d", Mnervo);
		System.out.printf("\nO numero de Homens Agressigos: %d", Hagre);
		System.out.printf("\nO numero de pessoas de genero Outros calmas: %d", Ocalmos);
		System.out.printf("\nO numero de pessoas Nervosas com mais de 40 anos: %d", nervo);
		System.out.printf("\nO numero de pessoas Calmas com menos de 18 anos: %d", menorcalmo);
		
	}

}



