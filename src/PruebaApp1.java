
public class PruebaApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float var1 = 7;
		float var2 = 3;
		
		float varMayor = 0;
		
		if(var1 != var2) {
			if(var1 > var2) {	
				varMayor = var1;
				System.out.println("La variable mayor entre var1 y var2 es var1 con el valor "+varMayor);	
			}else if(var1 < var2) {
				varMayor = var2;
				System.out.println("La variable mayor entre var1 y var2 es var2 con el valor "+varMayor);	
			}	
		}else {System.out.println("Las variables var1 y var2 tienen el mismo valor "+var1);}
	}

}
