package br.com.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o primeiro numero?");
		num1 = input.nextInt();
		
		System.out.println("Qual o segundo numero?");
		num2 = input.nextInt();
		
		System.out.println("Resultado soma: " + (num1 + num2));
		System.out.println("Resultado subtração: " + (num1 - num2));
		System.out.println("Resultado: multiplicação" + (num1 * num2));
		System.out.println("Resultado: divisão" + (num1 / num2));
	}

}
