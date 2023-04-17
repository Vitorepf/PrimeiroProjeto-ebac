import javax.swing.JOptionPane;

public class PrimeiraClasse {

	public static void main(String[] args) {

		String[] options = { "nome", "Sem nome" };
		var choice = JOptionPane.showOptionDialog(null, "Qual opcao deseja?", "Selecione uma opcao:", 0, 3, null,
				options, options[0]);
		if (choice == 0) {
			String nome = "";
			nome = JOptionPane.showInputDialog("Digite o seu nome: ");
			JOptionPane.showMessageDialog(null, "Hello world, " + nome);
		}
		if (choice == 1) {
			JOptionPane.showMessageDialog(null, "Hello world, Desconhecido");
		}

	}

}
