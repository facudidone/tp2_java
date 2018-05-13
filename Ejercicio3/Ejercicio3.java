package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3{
    private Scanner teclado;
    private int f = 0; 
    private int p = 0;
    private int i = 0;
    private int num;

public void ingresarycontar() {
    for (f = 0; f < 10; f++)
    {
    teclado = new Scanner(System.in);
    System.out.print("Ingrese un entero: ");
    num = teclado.nextInt();
        if (num % 2 == 0) {
            p++;
        } else {
            i++;
        }
    }
}

public void mostrar() {
    System.out.print("La cantidad de pares es: " +p);
    System.out.print("\n "
    		+ "La cantidad de impares es: " +i);
}

public static void main(String[] ar){
	Ejercicio3 prueba1 = new Ejercicio3();
    prueba1.ingresarycontar();
    prueba1.mostrar();
  }
}