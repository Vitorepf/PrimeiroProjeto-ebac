import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do vetor int
		int nota[] = new int[4];
		
		// Instacia da Classe Maiormenor
		Maiormenor maiormenor = new Maiormenor();
		
		// Declaração do vetor String de opções 
		String[] options = { "menor nota", "Media", "Maior nota" };

		// Responsavel por pegar a opção desejada
		var choice = JOptionPane.showOptionDialog(null, "Qual opcao deseja?", "Selecione uma opcao:", 0, 3, null,
				options, options[0]);

		// Responsavel por pegar e guardar as notas
		for (int i = 0; i <= 3; i++) {
			nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
		}

		/*  A partir de agora o choice vai ser usado para ativar uma das 3 opçoes disponiveis no começo, 
		 * que são: A menor nota, a media e a maior nota      */
		if (choice == 0) {
			maiormenor.Menor(nota[0], nota[1],nota[2] ,nota[3]);
		}

		if (choice == 1) {
			
			Calculando calcula = new Calculando(nota[0], nota[1],nota[2] ,nota[3]);	
		}

		if (choice == 2) {
			
			
			maiormenor.Maior(nota[0], nota[1],nota[2] ,nota[3]);
		}

	}

}
