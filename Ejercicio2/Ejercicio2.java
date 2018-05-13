package Ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    private Scanner teclado;
    private int num;

public void ingresar() {
    teclado = new Scanner(System.in);
    System.out.print("Ingresar un numero: ");
    num = teclado.nextInt();
}
public void calcular() {
    if (num < 10) {
        System.out.println(num);
        System.out.println(" tiene un solo dígito.");
    }
    else if ((num >= 10) && (num < 100))
    {
      System.out.println(num);
      System.out.println(" tiene dos dígitos.");
    }
    else
    {
      System.out.println(num);
      System.out.println(" tiene tres o más dígitos.");
    }
}
public static void main(String[] ar){
	Ejercicio2 prueba1 = new Ejercicio2();
    prueba1.ingresar();
    prueba1.calcular();
  }
}