import javax.swing.JOptionPane;

public class PruebaApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final float IVA = 1.21F;
		String userNum = JOptionPane.showInputDialog("Introduzca el precio del producto\n");
		float precio = Float.parseFloat(userNum);
		JOptionPane.showMessageDialog(null, "El precio del producto con IVA incluido es "+(precio*IVA));
	

	}

}
