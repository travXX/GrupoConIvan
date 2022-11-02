package Tema_4;

import java.util.Scanner;

public class Ex4_19 {
	public static void main(String[]args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Que numero quieres saber si es primo o no?");
		int numUser = lector.nextInt();
		int res=0;
			for(int i=0;i<numUser;i++) {
			for(int cont=2;cont<numUser;cont++) {
			res=numUser%cont;
				if(res==0) {
					break;
				}
			}
			if(res!=0) {
			System.out.print(numUser+"\t");
			}
		}
	}
}
