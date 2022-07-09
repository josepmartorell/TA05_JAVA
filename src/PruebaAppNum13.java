import javax.swing.JOptionPane;
import java.lang.Math;

public class PruebaAppNum13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		float operator1;
		float operator2; 
		float result = 0;
        String[] options = {"SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", "POTENCIA", "MÓDULO"};
        
        // seleccionamos opcion
        int option = JOptionPane.showOptionDialog(null, "CALCULADORA INVERSA",
                "Seleccione el tipo de operación a efectuar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        // recogemos y parseamos los operandos
		String userNum = JOptionPane.showInputDialog("Introduzca el primer operando");
		operator1 = Float.parseFloat(userNum);
		String userNum2 = JOptionPane.showInputDialog("Introduzca el segundo operango");
		operator2 = Float.parseFloat(userNum2);
		
		// seleccionamos el algoritmo a efectuar
		switch(option) {
		case 0:
			result = operator1 + operator2;
			break;
		case 1:
			result = operator1 - operator2;
			break;
		case 2:
			result = operator1 * operator2;
			break;
		case 3:
			result = operator1 / operator2;
			break;
		case 4:
			result = (float) Math.pow(operator1, operator2);
			break;
		case 5:
			result = operator1 % operator2;
			break;
		}
		
		// mostramos resultado en un cuadro de diálogo
		JOptionPane.showMessageDialog(null, "El resultado de la operación es "+result);
		

	}

}
