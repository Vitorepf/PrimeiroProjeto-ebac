import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Part1 {

	public void nomesVirgula() {
		String[] separado = JOptionPane.showInputDialog(null, "Digite os nomes separados por  ','  ").split(",");

		List<String> nomes = new ArrayList<>();
		

		for (String nome : separado) { 
			nomes.add(nome);
			Collections.sort(nomes);
		}
		
		JOptionPane.showMessageDialog(null, nomes);
	}
}
