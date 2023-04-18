import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		/*
		 * Declaração dos vetor 1- E o tanto de notas que eu quero pegar 2- Sao as
		 * opcoes disponiveis 3- E responsavel por impremir a ordem certinho
		 */

		float nota[] = new float[4];
		String[] options = { "menor nota", "Media", "Maior nota" };
		String ordem[] = { "primeira ", "segunda ", "terceira ", "quarta " };

		// Instacia da Classe Maiormenor
		Maiormenor maiormenor = new Maiormenor();

		// Responsavel por pegar e guardar as notas
		for (int i = 0; i <= 3; i++) {
			nota[i] = Float.valueOf(JOptionPane.showInputDialog("Digite a " + ordem[i] + "nota"));
		}

		// Responsavel por pegar a opção desejada
		var choice = JOptionPane.showOptionDialog(null, "O que deseja fazer com as 4 notas?", "Selecione uma opcao:", 0,
				3, null, options, options[0]);

		/*
		 * A partir de agora o choice vai ser usado para ativar uma das 3 opçoes
		 * disponiveis no começo, que são: A menor nota, a media e a maior nota
		 */
		if (choice == 0) {
			maiormenor.Menor(nota[0], nota[1], nota[2], nota[3]);
		}

		if (choice == 1) {

			Calculando calcula = new Calculando(nota[0], nota[1], nota[2], nota[3]);
		}

		if (choice == 2) {

			maiormenor.Maior(nota[0], nota[1], nota[2], nota[3]);
		}

	}

}
