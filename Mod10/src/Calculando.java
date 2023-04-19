import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 * @author Vitorepf
 *
 */
public class Calculando {

	private float resultado;

	public Calculando(float nota1, float nota2, float nota3, float nota4) {
		resultado = (nota1 + nota2 + nota3 + nota4) / 4;
	}

	public void Situacao() {
		String situacao = "";

		if (this.resultado >= 7) {
			situacao = "O Aluno esta Aprovado ";
		} else if (this.resultado >= 5 || this.resultado < 7) {
			situacao = "O Aluno esta de Recuperacao";
		} else {
			situacao = "O Aluno esta Reprovado";
		}

		JOptionPane.showMessageDialog(null,
				"A media das quatro notas  e: " + new DecimalFormat(".#").format((this.resultado)) + "\n" + situacao);
	}
}
