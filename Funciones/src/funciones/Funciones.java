package funciones;

import java.util.Scanner;

public class Funciones {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el numero 1: ");
        int numero1 = leer.nextInt();
        System.out.println("ingrese el numero 2: ");
        int numero2 = leer.nextInt();
        System.out.println("la suma es: " + funcionSuma(numero1, numero2));
        System.out.println("la resta es: " + funcionResta(numero1, numero2));
        System.out.println("la multiplicacion es: " + funcionMultiplicar(numero1, numero2));
        System.out.println("ingrese que le parecio el programa: ");
        String ev = leer.next();
        evaluacion(ev);
    }
    
    public static int funcionSuma(int parametro1, int parametro2) {
        int suma = parametro1 + parametro2;
        return suma;
        
    }
    
    public static int funcionResta(int parametro1, int parametro2) {
        int resta = parametro1 - parametro2;
        return resta;
    }

    public static int funcionMultiplicar(int parametro1, int parametro2) {
        int multiplicacion = parametro1 * parametro2;
        return multiplicacion;
    }

    public static void evaluacion(String nota) {
        System.out.println("la nota es: " + nota);
        
    }
}
