package Ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
	private Scanner teclado;
    private int cantidad;
    private float precio;
    private float resultado;

public void ingresar() {
    teclado = new Scanner(System.in);
    System.out.print("Ingrese los articulos: ");
    cantidad = teclado.nextInt();
    System.out.print("Ingrese el precio del articulo que lleva el cliente: ");
    precio = teclado.nextFloat();
    }
public void calcular() {
    resultado = cantidad * precio;
    System.out.print("El comprador paga: $" +resultado);
    }
public static void main(String[] ar){
	Ejercicio1 prueba1 = new Ejercicio1();
    prueba1.ingresar();
    prueba1.calcular();
      }
}
