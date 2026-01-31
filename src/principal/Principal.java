package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int a = sc.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        
        Multiplicacion multi = new Multiplicacion();
        System.out.println("El resultado de la multiplicación es: "+multi.res(a, b));
        
    }
    
}
