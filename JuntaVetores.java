package Aula_05_06;
import java.util.Scanner;
public class JuntaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner (System.in);                    
		int a [] = new int [2];
		int b [] = new int [2];
		int c [] = new int [4];

		for (int i =0; i<2; i++) {
			System.out.print("informe um valor do vetor A: ");
			a[i]= ler.nextInt ();
			c[i] = a[i]; 

		}
		for (int i =0; i<2; i++) {
			System.out.print("informe um valor do vetor B:  ");
			b [i]= ler.nextInt ();
			c[i+2] = b[i];
		}
		for(int i=0;i<4;i++) {
			System.out.println(c[i]);

		}

	}
}
