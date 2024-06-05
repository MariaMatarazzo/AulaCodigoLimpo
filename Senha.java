package Aula_05_06;
import java.util.Scanner;
public class Senha {
public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner (System.in);                    
		double primeiroNumero, segundoNumero, soma; 
		int senhaMestre, senhaTentativa;

		
		System.out.print(">>>>>> Cadastre uma senha (APENAS NUMEROS): ");
		senhaMestre = ler.nextInt();
		 
		System.out.print("Informe um valor:  ");
		primeiroNumero = ler.nextDouble();  
		
		System.out.print("Informe outro numero: ");
		segundoNumero = ler.nextDouble();
		
		System.out.print("Digite sua senha para desbloquer a soma: ");
		senhaTentativa = ler.nextInt();
		
		soma = primeiroNumero + segundoNumero;
		
		if (senhaTentativa == senhaMestre) {
			System.out.println("A soma é: " + soma);
		}
		if (senhaTentativa != senhaMestre) {
			System.out.print("//// Erro!!! Senha Errada ////");
			ler.close();
		}
		
		

	}

}
