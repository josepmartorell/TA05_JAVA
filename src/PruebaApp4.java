import javax.swing.JOptionPane;

public class PruebaApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI = 3.1416;
		String num = JOptionPane.showInputDialog("Introduzca el radio del círculo\n");
		double radio = Double.parseDouble(num);
		JOptionPane.showMessageDialog(null, "El area del círculo es "+((radio*2)*PI));
	

	}

}
