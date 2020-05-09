package javaapplication2;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el valor de la pila A: ");
        int v = leer.nextInt();
        int opt;
        int[] m1 = new int[v];
        System.out.println("ingresa el valor de la pila B: ");
        int v2 = leer.nextInt();
        int[] m2 = new int[v2];
        int v1 = 0;
        int v3 = 0;
        int aux = 0;
        int[] m3 = new int[v3 = v1 + v2];
        do {
            System.out.println("1-Llenar");
            System.out.println("2-Mostrar");
            System.out.println("3-Sumar pilas");
            System.out.println("4-Vaciar pila");
            System.out.println("5-ordenar");
            switch (opt = leer.nextInt()) {

                case 1:
                    int i = 0;
                    for (i = 0; i < v; i++) {
                        m1[i] = (int) (Math.random() * -200 + 200);

                    }
                    for (i = 0; i < v2; i++) {
                        m2[i] = (int) (Math.random() * -200 + 200);

                    }

                    break;

                case 2:
                    System.out.println("La pila A es:\n");
                    for (i = 0; i < v; i++) {
                        System.out.println("posicion " + i + " ----> " + m1[i]);
                    }
                    System.out.println("La pila B es:\n");
                    for (i = 0; i < v2; i++) {
                        System.out.println("posicion " + i + " ----> " + m2[i]);
                    }
                    break;

                case 3:
                    System.out.println("La pila c es:\n");
                    for (i = 0; i < v3; i++) {
                        m3[i] = m1[i];
                        System.out.println(" " + m1[i]);
                        m3[i] = m2[i];
                        System.out.println(" " + m2[i]);
                    }
                    break;
                case 4:
                    for (i = 0; i < v; i++) {
                        m1[i] = 0;
                    }
                    for (i = 0; i < v2; i++) {
                        m2[i] = 0;
                    }
                    break;
                case 5:
                    for (int j = 0; j < v3; j++) {
                        for (i = 0; i < v3 - 1; i++) {
                            if (m3[i] > m3[i + 1]) {
                                aux = m3[i];
                                m3[i] = m3[i + 1];
                                m3[i + 1] = aux;
                            }
                        }
                    }
                    int k=0;
                    System.out.println("NUMEROS ORDENADOS");
                    while(k<v3)
                    {
                     System.out.println(m3[k]);
                     k++;
                    }
                    break;
                    
            }

        } while (opt != 6);

    }

}