package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Mensaje_Inicial texto = new Mensaje_Inicial ();
		texto.Mensaje();
	
		System.out.println("------------------------------------------");
		System.out.println(" Escribe en la terminal los datos que desees, \n  entre las acciones que puedes realizar \n   es operaciones aritmeticas básicas \n como: sumar, restar, dividir y multiplicar \n     utilizando dos números, también \n     puedes aprender sobre conceptos \n  relacionados con sistemas e instalación \n de Software cada concepto con un significado \n  y su función y con la opción help escrita  \n  en la consola podrás ver nuestra lista de  \n             comandos habilitados ");
		
		boolean on = true;
		
		do {
			
			Scanner inputCommand = new Scanner (System.in);
			System.out.println("");
			System.out.print("~$ ");
			String output = inputCommand.nextLine();
			
			
		    CommandList dateCommand = new CommandList();	
			
		    if(output.equals(dateCommand.command[0])) {
		    	System.out.println("");
		    	ArithmeticOperations ma = new ArithmeticOperations();
		    	ma.suma();
		    
		    }
		    
		    else if (output.equals(dateCommand.command[1])) {
		    	System.out.println("");
		    	ArithmeticOperations ma = new ArithmeticOperations();
		    	ma.resta();	
		    }
		    
		    else if (output.equals(dateCommand.command[2])) {
		    	System.out.println("");
		    	ArithmeticOperations ma = new ArithmeticOperations();
		    	ma.multiplicar();	
		    }
		    
		    else if (output.equals(dateCommand.command[3])){
		    	System.out.println("");
		    	ArithmeticOperations ma = new ArithmeticOperations();
		    	ma.dividir();
		    }
		    else if (output.equals(dateCommand.command[4])){
		    	System.out.println("");
		    	ArithmeticOperations ma = new ArithmeticOperations();
		    	ma.residuo();
		    }
		    else if (output.equals(dateCommand.command[5])){
		    	help help = new help();
		    	help.List();
		    }
		    else if (output.equals(dateCommand.command[6])) {
		    	on = false;
		    }
		    else if (output.equals(dateCommand.command[7])){
		    	Sistemas_y_Instalacion info = new Sistemas_y_Instalacion();
		    	info.kernel();
		    	
		    }
		    else if (output.equals(dateCommand.command[8])){
		    	Sistemas_y_Instalacion info = new Sistemas_y_Instalacion();
		    	info.linux();
		    	
		    }	
		    else if (output.equals(dateCommand.command[9])){
		    	Sistemas_y_Instalacion info = new Sistemas_y_Instalacion();
		    	info.shell();
		    	
		    }	
		    else if (output.equals(dateCommand.command[10])){
		    	Sistemas_y_Instalacion info = new Sistemas_y_Instalacion();
		    	info.script();
		    	
		    }	
		    else if (output.equals(dateCommand.command[11])){
		    	Sistemas_y_Instalacion info = new Sistemas_y_Instalacion();
		    	info.Assembler();
		    	
		    }	
		    
		    else {
		    	System.out.println("Lo siento tu comando no fue encontrado");
		    	System.out.println("Ingresa la palabra help para mas infomación");
		    }
		    
		}while(true);
	      
	    
	    
	    
	}

}
