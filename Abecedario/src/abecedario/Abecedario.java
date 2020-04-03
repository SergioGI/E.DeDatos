package abecedario;

import java.util.Scanner;
public class Abecedario {
    
  
    public static void main(String[] args) {
        int opt,p=0, tope=0;
        
         Scanner leer=new Scanner(System.in);
            System.out.println("tamaño de la pila");
            p=leer.nextInt();     
         char[]abc={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
          char[] aleatorio=new char[27];
      for(int i=0;i<=24;i++){
           aleatorio[i]=abc[(int)(Math.random()*27)];
           //string letras={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        }     
         do {

            System.out.println("1-agregar \n");
            System.out.println("2-mostrar \n");
            System.out.println("3-eliminar \n");
            System.out.println("4-salir \n");
            opt = leer.nextInt();

            switch (opt) {          
                case 1:
                  if (tope < p) {
                        System.out.println("digite un caracter");
                        aleatorio[tope] = leer.next().charAt(0);
                        tope++;
                    } else {
                        System.out.println("pila llena");
                    }break;
                    
                case 2:
                    System.out.println("Los datos son: \n");               
                    if (tope > 0) {
                        for (int i = 0; i < p; i++) {                      
                            System.out.println(" " + aleatorio[i]);
                        }
                    } else {
                        System.out.println("pila vacia\n ");
                    }
                    break;
                    
                case 3:
                        if (tope <= p) {                         
                        for (int i = 0; i < p-1; i++) {
                           
                            System.out.println(" " + aleatorio[i]);
                        }
                    } else {
                        System.out.println("pila vacia\n ");
                    }
                    break;                                                   
        }} while (opt != 4);  
    }
}