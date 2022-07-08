import javax.swing.JOptionPane;

public class PruebaApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userNum = JOptionPane.showInputDialog("Introduzca un numero:\n");
		
		float num = Float.parseFloat(userNum);

		if((num % 2) == 0) {
			JOptionPane.showMessageDialog(null, userNum+" es divisible entre dos");
		}else {	
			JOptionPane.showMessageDialog(null, userNum+" no es divisible entre dos");
		}
		
	}

}
