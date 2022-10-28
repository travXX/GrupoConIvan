package Ejercicios;

import java.util.Scanner;

public class Ex4_17 {
	public static void main(String[]args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Que numero quieres pasar?");
		int numUser = lector.nextInt();
		lector.nextLine();
		System.out.println("Que base quieres usar?");
		int numBase = lector.nextInt();
		lector.nextLine();
		String residuo="";
/*********///Calcuadora del binario
		do {
			residuo=residuo + Integer.toString(numUser%numBase);
			numUser=numUser/numBase;
		}while(numUser>1);
/********///Escribe el primer dijito solo si es 1
		if(numUser==1) {
		System.out.print('1');
		}
/********///escribira el resultado de las operaciones al reves para que el numero salga bien
		for(int cont=residuo.length()-1;cont>=0;cont--) {
			System.out.print(residuo.charAt(cont)+"*"+numBase+"^"+cont+" ");
		}
	
   }
}
