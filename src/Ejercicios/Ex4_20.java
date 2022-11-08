package Tema_4;

import java.util.Scanner;

public class Ex4_20 {
	public static void main(String[]args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el precio en €");
		int numUser = lector.nextInt();
		lector.nextLine();
		int b500=0;int b200=0;int b100=0;int b50=0;int b20=0;int b10=0,b5=0;
		do {
			if(numUser>=500) {
				numUser=numUser - 500;
				b500++;
				continue;
			}
			if(numUser>=200) {
				numUser=numUser-200;
				b200++;
				continue;
			}
			if(numUser>=100) {
				numUser=numUser-100;
				b100++;
				continue;
			}
			if(numUser>=50) {
				numUser=numUser-50;
				b50++;
				continue;
			}
			if(numUser>=20) {
				numUser=numUser-20;
				b20++;
				continue;
			}
			if(numUser>=10) {
				numUser=numUser-10;
				b10++;
				continue;
			}
			if(numUser>=5) {
				numUser=numUser-5;
				b5++;
				continue;
			}
		}while(numUser>=5);
		System.out.println(b500+" billetes de 500");
		System.out.println(b200+" billetes de 200");
		System.out.println(b100+" billetes de 100");
		System.out.println(b50+" billetes de 50");
		System.out.println(b20+" billetes de 20");
		System.out.println(b10+" billetes de 10");
		System.out.println(b5+" billetes de 5");
	}
}
