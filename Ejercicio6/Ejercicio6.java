package Ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre del Empleado: ");
        nombre = teclado.next();
        System.out.print("Ingrese sueldo del Empleado: ");
        sueldo = teclado.nextInt();
    }
    public void imprimeDatos(){
        System.out.println("El nombre del empleado es: " +nombre);
        System.out.println("Y su sueldo es: " +sueldo);
    }
    public void imprimeImpuesto(){
        if(sueldo>3000)
            System.out.println("El empleado paga impuesto.");
        else
            System.out.println("El empleado no paga impuesto.");
    }
    public static void main (String args[]){     
    	Ejercicio6 empleado1 = new Ejercicio6();
        empleado1.inicializar();
        empleado1.imprimeDatos();
        empleado1.imprimeImpuesto();
    }  
}
