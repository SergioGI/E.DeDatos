package pilas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class pilas {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("tamaño de pila a:");
        int x = leer.nextInt();
        int opt;
        int[] p = new int[x];
        System.out.println("tamaño d5e la pila b:");
        int y = leer.nextInt();
        int[] m = new int[y];
        int z = 0;
        int b = 0;
        int aux = 0;
        int[] a = new int[b = z + y];
        do {
            System.out.println("1-Llenar");
            System.out.println("2-Mostrar");
            System.out.println("3-Sumar pilas");
            System.out.println("4-Vaciar pila");
            System.out.println("5-ordenar");        
            switch (opt = leer.nextInt()) {
                case 1:
                    int i = 0;
                    for (i = 0; i < x; i++) {
                        p[i] = (int) (Math.random() * -200 + 200);
                    }
                    for (i = 0; i < y; i++) {
                        m[i] = (int) (Math.random() * -200 + 200);
                    }
                    break;
                    
                case 2:
                    System.out.println("La pila A es:\n");
                    for (i = 0; i < x; i++) {
                        System.out.println("posicion"+i+">"+p[i]);
                    }
                    System.out.println("La pila B es:\n");
                    for (i = 0; i < y; i++) {
                        System.out.println("posicion"+i+">"+m[i]);
                    }
                    break;
                    
                case 3:
                    System.out.println("pila c : ");
                    for (i = 0; i < b; i++) {
                        a[i] = p[i];
                        System.out.println(" " + p[i]);
                        a[i] = m[i];
                        System.out.println(" " + m[i]);
                    }
                    break;
                case 4:
                    
                    for (i = 0; i < x; i++) {
                        p[i] = 0;
                    }
                    for (i = 0; i < y; i++) {
                        m[i] = 0;
                    }
                    break;
                case 5:
                    for (int j = 0; j < b; j++) {
                        for (i = 0; i < b - 1; i++) {
                            if (a[i] > a[i + 1]) {
                                aux = a[i];
                                a[i] = a[i + 1];
                                a[i + 1] = aux;
                            }
                        }
                    }                    
                    {                   
                    }
                    break;
            }
        } while (opt != 5);
    }
