package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int suma,valor;
        suma=0;
        do {
            System.out.print("Ingresar valores (Al ingresar 9999, el programa termina): ");
            valor=teclado.nextInt();
            if (valor!=9999) {
                suma=suma+valor;
            }
        }while (valor!=9999);
        System.out.print("El valor acumulado es: ");
        System.out.print(suma);
        System.out.print(". \n");
        if (suma==0) {
            System.out.print("El numero ");
            System.out.print(suma); 
            System.out.print(" es cero.");
        } else {
            if (suma>0) {
            	System.out.print("El numero ");
                System.out.print(suma); 
                System.out.print(" es positivo.");
            } else {
            	System.out.print("El numero ");
                System.out.print(suma); 
                System.out.print(" es negativo");
            }
        }
    }
}
