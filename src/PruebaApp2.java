
import java.util.Scanner;

public class PruebaApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduzca su nombre:\n");
		
		String nombre = sc.nextLine();
		sc.close();
		
		System.out.println("\nBienvenido "+nombre+" !");

	}

}
