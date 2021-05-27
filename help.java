package scl.edu.gt;

public class help {
    
	
	public static void List() {
		
	System.out.println(" --------------------");	
	System.out.println("|Comandos Disponibles|");
	System.out.println(" --------------------");
	
	
	CommandList datos = new CommandList();

	int cantidadDeComandos = datos.command.length;
	
	System.out.println("");	
	for(int i = 0; i<cantidadDeComandos;i++){   
		    System.out.println(" ");
	        System.out.println("|"  + datos.command[i] + "-|" );
	        System.out.println( datos.information[i] );
	        System.out.println("");

	}
		
		  
	
	
	
	
	
	
	
	
	
	
	
	
	
	    }

}
          
		
		
		
		
		
		
		
	
	
	
	

