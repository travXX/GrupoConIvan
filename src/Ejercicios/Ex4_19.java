package Tema_4;

import java.util.Scanner;

public class Ex4_19 {
	public static void main(String[]args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Cuantos numeros primos quieres?");
		int numUser = lector.nextInt();
		lector.nextLine();
		int numVuelta=0, buscaPrimo=1, Find=0;
		while(numVuelta < numUser) {
			
			for(int i = buscaPrimo / 2 ; i >= 2 ; i--) {
				if(buscaPrimo % i == 0) {
					Find++;
				}
			}
			if(Find>0) {
				buscaPrimo++;
				Find = 0;
			}else {
				numVuelta++;
				System.out.println(buscaPrimo);	
				buscaPrimo++;
				Find = 0;
			}
		}
	}
}
