package Ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {
	private Scanner teclado;
    private int n1,n2,suma,multiplicacion,resta,division;
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el valor del 1er n�mero: ");
        n1=teclado.nextInt();
        System.out.print("Ingrese el valor del 2do n�mero: ");
        n2=teclado.nextInt();
    }    
    public void suma(){
        suma=n1+n2;
    }
    public void resta(){
        resta=n1-n2;
    }
    public void multiplicar(){
        multiplicacion=n1*n2;
    }
    public void dividir(){
        division=n1/n2;
    }
    public void mostrarCalculos(){
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicaci�n es: " +multiplicacion);
        System.out.println("La divisi�n es: " +division);
    }
    public static void main (String args[]){
        Ejercicio7 operacion1 = new Ejercicio7();
        operacion1.inicializar();
        operacion1.suma();
        operacion1.resta();
        operacion1.multiplicar();
        operacion1.dividir();
        operacion1.mostrarCalculos();
    }
}
