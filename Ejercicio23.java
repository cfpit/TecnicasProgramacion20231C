package pruebas;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int min = 0;
        int max = 0;
        int total = 0;
        int contador = 0;
        
        do 
        {
            System.out.println("Ingrese n: ");
            int n = lector.nextInt();
            
            if (n == 0) {
                break;
            }
            
            if (contador == 0) 
            {
                max = n;
                min = n;
            }
            
            total += n;
            
            if (n > max) {
                max = n;
            }
            
            if (n < min) {
                min = n;
            }
            
            contador ++;
            
        } while (true);
        
        System.out.println("maximo = " + max);
        System.out.println("minimo = " + min);
        if (contador != 0) 
        {
            System.out.println("Promedio = " +(double)total/contador);
        }
        else
        {
            System.out.println("No se puede calcular el promedio");
        }
    }
}
