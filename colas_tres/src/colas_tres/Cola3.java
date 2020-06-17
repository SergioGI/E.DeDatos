package cola3;

import java.util.Scanner;

public class Cola3 {
    
    int MAX=100;
    int x=0;
    int n=10, aux;
    int num[]=new int[n];
    

    public void llenarcola(){
        
        num[x] =(int) (Math.random() * MAX);
            
                   for ( x=0; x< n; x++) {
                num[x] =(int) (Math.random() * MAX);
                   for(int j=0; j<x;j++){
                       if(num[x]==num[j]){
                           x--;
                       }
                   }
               System.out.println(""+num[x]);
           }
    }   
    
        public void mostrarcola(){
            if(MAX>0){
                    System.out.println("los numeros son:");
                    for(x = 0; x < n; x++){
                    System.out.println("posicion de cola["+x+"]=" +num[x]);
                    }
                    }else{
                        System.out.println("la cola esta vacia");
                    }
    }
       
        public void ordenarcola(){
            for(int j=0;j<n;j++){
                          for( x=0;x<n-1;x++){
                            if(num[x]>num[x+1]){
                             aux=num[x];
                             num[x]=num[x+1];
                             num[x+1]=aux;
                              
                            }
                        }
                        
                    } 
                    {
                        System.out.println("se han ordenado");
                    }
    }
    
         public void vaciarcola(){
             MAX=0;
                    System.out.println("se ha vaciado");
    }
         
         public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
        Cola3 cola= new Cola3();
            int opcion;
        System.out.println("elija una opcion");
        
        
        do{
            
              System.out.println("1-llenar");
              System.out.println("2-mostrar");
              System.out.println("3-ordenar");
              System.out.println("4-vaciar");
               System.out.println("5-salir");
               
               System.out.print("Opcion es --> ");
        opcion = leer.nextInt();
        
        switch (opcion){
            
            case 1:cola.llenarcola();
                break;               
            case 2:cola.mostrarcola();              
                break;
            case 3:cola.ordenarcola();
                break;               
            case 4:cola.vaciarcola();
                break;     
        }
      }
      while (opcion!=5);  
    }   
}