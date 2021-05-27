package scl.edu.gt;

import java.util.Scanner;

public class ArithmeticOperations{
	
	
	public static void suma() {
		
		Scanner dato_1 = new Scanner(System.in);
		System.out.print("Igresa el primer numero:  ");
		double numero_1 = dato_1.nextDouble();
		
		Scanner dato_2 = new Scanner(System.in);
		System.out.print("Igresa el segundo numero:  ");
		double numero_2 = dato_2.nextDouble();
		
		double respuesta = numero_1 + numero_2;
		
		System.out.println("El resultado de la operacion es: " + respuesta);
		
	}
    
	public static void resta() {
		
		Scanner dato_1 = new Scanner(System.in);
		System.out.print("Igresa el primer numero:  ");
		double numero_1 = dato_1.nextDouble();
		
		Scanner dato_2 = new Scanner(System.in);
		System.out.print("Igresa el segundo numero:  ");
		double numero_2 = dato_2.nextDouble();
		
		double respuesta = numero_1 - numero_2;
		
		System.out.println("El resultado de la operacion es: " + respuesta);
		
	}
    public static void multiplicar() {
		
		Scanner dato_1 = new Scanner(System.in);
		System.out.print("Igresa el primer numero:  ");
		double numero_1 = dato_1.nextDouble();
		
		Scanner dato_2 = new Scanner(System.in);
		System.out.print("Igresa el segundo numero:  ");
		double numero_2 = dato_2.nextDouble();
		
		double respuesta = numero_1 * numero_2;
		
		System.out.println("El resultado de la operacion es: " + respuesta);
		
	}
    public static void dividir() {
		
 		Scanner dato_1 = new Scanner(System.in);
 		System.out.print("Igresa el primer numero:  ");
 		double numero_1 = dato_1.nextDouble();
 		
 		Scanner dato_2 = new Scanner(System.in);
 		System.out.print("Igresa el segundo numero:  ");
 		double numero_2 = dato_2.nextDouble();
 		
 		double respuesta = numero_1 / numero_2;
 		
 		System.out.println("");
 		System.out.println("El resultado de la operacion es: " + respuesta);
 		
 	}
    public static void residuo() {
		
 		Scanner dato_1 = new Scanner(System.in);
 		System.out.print("Igresa el primer numero:  ");
 		double numero_1 = dato_1.nextDouble();
 		
 		Scanner dato_2 = new Scanner(System.in);
 		System.out.print("Igresa el segundo numero:  ");
 		double numero_2 = dato_2.nextDouble();
 		
 		double respuesta = numero_1 % numero_2;
 		
 		System.out.println("");
 		System.out.println("El resultado de la operacion es: " + respuesta);
 		
 	}
 	
	
}
