import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do vetor int
		int nota[] = new int[4];
		
		// Instacia da Classe Maiormenor
		Maiormenor maiormenor = new Maiormenor();
		
		// Declara��o do vetor String de op��es 
		String[] options = { "menor nota", "Media", "Maior nota" };

		// Responsavel por pegar a op��o desejada
		var choice = JOptionPane.showOptionDialog(null, "Qual opcao deseja?", "Selecione uma opcao:", 0, 3, null,
				options, options[0]);

		// Responsavel por pegar e guardar as notas
		for (int i = 0; i <= 3; i++) {
			nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
		}

		/*  A partir de agora o choice vai ser usado para ativar uma das 3 op�oes disponiveis no come�o, 
		 * que s�o: A menor nota, a media e a maior nota      */
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
