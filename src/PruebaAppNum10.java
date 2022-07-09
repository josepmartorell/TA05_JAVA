import javax.swing.JOptionPane;

public class PruebaAppNum10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userNum = "";
		float acumuladoVentas = 0;
		
		userNum = JOptionPane.showInputDialog("Introduzca el número de ventas:\n");
		float numVentas = Float.parseFloat(userNum);
		
		for(int i = 0; i<numVentas; i++) {			
			String userDato = JOptionPane.showInputDialog("Venta Nº "+(i+1)+" introduzca la cantidad");
			float nuevaVenta = Float.parseFloat(userDato);
			acumuladoVentas += nuevaVenta;
		}
		JOptionPane.showMessageDialog(null, "El total de las ventas acumuladas es "+acumuladoVentas);
		

	}

}
