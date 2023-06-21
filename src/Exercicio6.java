import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//		mostre: 
//			a) a área do triângulo retângulo que tem A por base e C por altura. 
//			b) a área do círculo de raio C. (pi = 3.14159) 
//			c) a área do trapézio que tem A e B por bases e C por altura. 
//			d) a área do quadrado que tem lado B. 
//			e) a área do retângulo que tem lados A e B.
		Scanner sc = new Scanner(System.in);
		float A, B, C, at, ac, atr, aq, ar;
		double pi = 3.14159;
		

		
		System.out.println("Insira os valores de A, B e C.");
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		at = (A * C) /2;
		ac = (float) (pi * (C*C));
		atr = (A + B) / 2 * C;
		aq = B*B;
		ar = A*B;
		
		System.out.println("a): "+ at +" b): "+ ac +" c): "+ atr +" d): "+ aq +" e): "+ ar);
		sc.close();
		
	}

}
