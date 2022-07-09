import javax.swing.JOptionPane;

public class PruebaAppNum11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcion = JOptionPane.showInputDialog("Elige un día de la semana (L, M, X, J, V, S, D)");
		opcion = opcion.toUpperCase();
		
		switch(opcion) {
			case "L":
			case "M":
			case "X":
			case "J":
			case "V":
				JOptionPane.showMessageDialog(null, opcion+" es un día laborable");
				break;
			case "S":
			case "D":			
				JOptionPane.showMessageDialog(null, opcion+" es un día festivo");
				break;
		
		}
		
		

	}

}
