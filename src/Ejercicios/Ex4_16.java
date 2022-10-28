package Ejercicios;

import java.util.Scanner;

public class Ex4_16 {
	public static void main(String[]args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Que numero quieres pasar a decimal?");
		int numUser = lector.nextInt();
		lector.nextLine();
		String residuo="";
		/*********///Calcuadora del binario
		do {
			residuo=residuo + Integer.toString(numUser%2);
			numUser=numUser/2;
		}while(numUser>1);
		/********///Escribe el primer dijito solo si es 1
		if(numUser==1) {
			System.out.print('1');
		}
		/********///escribira el resultado de las operaciones al reves para que el numero salga bien
		for(int cont=residuo.length()-1;cont>=0;cont--) {
			System.out.print(residuo.charAt(cont));
		}
		
	/* Se puede hacer asi 
	   String binario = Integer.toBinaryString(numUser);
	   System.out.println(binario);
	*/
	   }
}
