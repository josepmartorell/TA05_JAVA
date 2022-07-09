import javax.swing.JOptionPane;

public class PruebaAppNum12 {
	
	private static final int password = 1234;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int count = 3;
		boolean matchPassword = false;
		do {	
			String userData = JOptionPane.showInputDialog("Introduzca el password (dispone de "+count+" intentos)");
			int userNum = Integer.parseInt(userData);
			count--;
			if(userNum == password) {
				matchPassword = true;
			}
		}while(count>0 && !matchPassword);
		
		if (!matchPassword)
			JOptionPane.showMessageDialog(null, "Lo siento, ha agotado todos los intentos");
		else
			JOptionPane.showMessageDialog(null, "Enhorabuena, el password es correcto!");

	}

}
