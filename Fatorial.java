package Aula_05_06;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner (System.in);
		int fat = 1, num;

		System.out.print("Informe o Fatorial: ");
		num= ler.nextInt();

		if (num < 0) {
			System.out.print(" Não existem fatorial de numero negativo! ");

		}
		if (num > 0)
			for(int i=1 ; i <= num; i ++) {
				fat *=i;
			}
		System.out.print(" O fatorial de " + num + " é " + fat);
	
    }
}

