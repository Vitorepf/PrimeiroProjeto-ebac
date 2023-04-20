import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Part2 {

	public void separaSexo() {
		List<String> masculino = new ArrayList<>();
		List<String> feminino = new ArrayList<>();

		JOptionPane.showMessageDialog(null, "Digite seu nome  com   '-'   e a inicial"
				+ " do seu sexo correspondente \n (M) Masculino, (F) feminino");
		String[] nomes = JOptionPane.showInputDialog(null, "Digite um nome ").split(",");

		for (String nome : nomes) {
			String[] linha = nome.split("-");
			String inicial = linha[1];

			if (inicial.equalsIgnoreCase("m")) {
				masculino.add(linha[0]);
			} else if (inicial.equalsIgnoreCase("f")) {
				feminino.add(linha[0]);
			} else {
				JOptionPane.showMessageDialog(null, "Formato de nome invalido: " + nome);
			}
		}
		Collections.sort(masculino);
		Collections.sort(feminino);
		JOptionPane.showMessageDialog(null, "Nomes Masculinos: " + masculino);
		JOptionPane.showMessageDialog(null, "Nomes Feminino: " + feminino);
	}
}