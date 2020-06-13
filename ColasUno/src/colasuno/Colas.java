package colas;

import java.util.Scanner;


public class Colas {
  
   int numero;
    int x;
    String nombre;
    String v1[]=new String[numero];
    
public void crearvector(){
     Scanner texto = new Scanner(System.in);
        System.out.println("¿de que tamaño desea el vector?: ");
        numero = texto.nextInt(); 
        v1=  new String[numero+1];
    
}
public void agregarcola() {
    Scanner texto = new Scanner(System.in);
        System.out.println("ingrese nombre: ");
        nombre = texto.nextLine();
        
        v1[x++] = nombre;
    
}


public void mostrarcola(){
     for(int x=0; x<numero; x++){
    
            System.out.println("el nombre en la posicion [" + x + "] es: " + v1[x]);
        
        }
   
   
}

public void eliminarcola(){
 
     numero--;
      System.out.println("nombre eliminado"); 
     
}
    
    public static void main(String[] args) {
        Colas c= new Colas();
        Scanner teclado= new Scanner (System.in);
        String nombre;
        int opt=0;
        
        c.crearvector();
          
        do{
            System.out.println("1-agregar");
            System.out.println("2-mostrar");
            System.out.println("3-eliminar");
   
            switch(opt=teclado.nextInt()){
              
                case 1:
                   c.agregarcola();
                    break;
                case 2:
                   c.mostrarcola();
                    break;
                case 3:
                   c.eliminarcola();
                    break;
               
            }
        }while (opt !=4);
            
    }
}