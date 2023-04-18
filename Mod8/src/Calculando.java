import javax.swing.JOptionPane;

public class Calculando {

	private float resultado;

	public Calculando(float nota1, float nota2, float nota3, float nota4) {
		resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		JOptionPane.showMessageDialog(null, "A media das 4 notas  e:  " + resultado);
	}
}
