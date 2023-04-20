import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Part1 primeira = new Part1();
		Part2 segunda = new Part2();

		String[] opcao = { "Parte1", "Parte2" };

		JOptionPane.showMessageDialog(null,
				"Bem vindo Gustavo, (Acredito que seja o Gustavo corrigindo)\npor favor escolha qual parte das atividade deseja corrigir.");

		int choice = JOptionPane.showOptionDialog(null, "Selecione uma opcao", "Selecione uma opcao", 0, 1, null, opcao,
				opcao[0]);

		if (choice == 0) {
			primeira.nomesVirgula();
		}

		if (choice == 1) {
			segunda.separaSexo();
		}

	}

}
