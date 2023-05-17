package br.senai.sp.jandira;

import java.util.Scanner;

public class MatrizABC {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int matrizA[] = new int[6];
		int matrizB[] = new int[6];
		int matrizC[] = new int[6];
		int i = 0;
		
		System.out.println("*********************************");
		System.out.println("      Subtração de Matrizes");
		System.out.println("*********************************");
		System.out.println("");
		
		while(i < matrizA.length) {
			
			System.out.print("Insira  " + (i+1) + "° valor da Matriz A: ");
			matrizA[i] = teclado.nextInt();
			
			i++;
		}
		
		i = 0;
		System.out.println("");
		
		while(i < matrizB.length) {
			
			System.out.print("Insira  " + (i+1) + "° valor da Matriz B: ");
			matrizB[i] = teclado.nextInt();
			
			i++;
		}
			
		i = 0;
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("     Resultado das Subtrações");
		System.out.println("*********************************");
		System.out.println("");

		
		while(i < matrizC.length) {
			
			matrizC[i] = matrizA[i] - matrizB[i];
			System.out.println(matrizA[i] + " - " + matrizB[i] + " = " + matrizC[i]);
			
			i++;

		}
		
		
	}

}
