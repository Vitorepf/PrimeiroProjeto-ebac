import javax.swing.JOptionPane;

public class Calculando {
	
	private int resultado;
	
	public Calculando(int nota1, int  nota2, int nota3, int nota4) {
		resultado= (nota1+nota2+nota3+nota4)/4;
		JOptionPane.showMessageDialog(null, resultado);
	}
}
