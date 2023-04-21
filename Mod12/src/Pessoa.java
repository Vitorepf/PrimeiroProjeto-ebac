import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Pessoa {

	public void captura() {

		List<String> masculino = new ArrayList<>();
		List<String> feminino = new ArrayList<>();
		int loop;
		int quantidade;

		quantidade = Integer
				.parseInt(JOptionPane.showInputDialog(null,
						"Caso tenha uma quantidade definada de pessoas que deseja salvar,\n "
								+ "digite a quantidade, caso não tenha uma quantidade exata, e so confirmar o valor 0",
						0));

		do {
			if (quantidade != 0) {
				for (int i = 1; i <= quantidade - 1; i++) {
					String[] recebe = JOptionPane
							.showInputDialog(null,
									"Digite o nome e o sexo dividido por virgula.\nMasculino(m)    Feminino(f)")
							.split(",");
					String nome = recebe[0];
					String sexo = recebe[1];

					if (sexo.equalsIgnoreCase("m")) {
						masculino.add(nome);

					} else if (sexo.equalsIgnoreCase("f")) {
						feminino.add(nome);
					}
				}
			}
			quantidade = 0;
			String[] recebe = JOptionPane.showInputDialog(null, "Digite o nome e o sexo dividido por virgula")
					.split(",");
			String nome = recebe[0];
			String sexo = recebe[1];

			if (sexo.equalsIgnoreCase("m")) {
				masculino.add(nome);

			} else if (sexo.equalsIgnoreCase("f")) {
				feminino.add(nome);
			}

			loop = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Deseja adicionar mais gente? \n (1)Sim   (0) Nao", 0));

		} while (loop == 1);

		JOptionPane.showMessageDialog(null, "Nomes Masculinos: " + masculino);
		JOptionPane.showMessageDialog(null, "Nomes Feminino: " + feminino);
	}
}
