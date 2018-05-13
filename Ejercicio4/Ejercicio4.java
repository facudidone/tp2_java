package Ejercicio4;

public class Ejercicio4 { 
	    private int i = 1;
	    private int r = 5;
	    
	public void tabla() {
		
	    for (i = 1; i < 11; i++)
	    {
	      System.out.print("5x");
	      System.out.print(i);
	      System.out.print("=");
	      System.out.print(r);
	      System.out.print("\n");
	      r += 5;
	    }
	}
	 
	public static void main(String[] ar){
		Ejercicio4 prueba1 = new Ejercicio4();
	    prueba1.tabla();
	  }
}