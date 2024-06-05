package Aula_05_06;
import java.util.Scanner;
public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner (System.in);                      //Instaciar classe Scanner
		double numeroDivisivel;                                    //variaveis

		System.out.print("Informe um valor:  ");
		numeroDivisivel = ler.nextDouble();                        // entrada de dados

		if (numeroDivisivel % 5 == 0) {
			System.out.print(" O numero " + numeroDivisivel + " é multiplo de 5");

		}
		if (numeroDivisivel % 5 != 0) {
			System.out.print(" O numero" + numeroDivisivel + "não é multiplo de 5");
			ler.close();
		}

	}

}
