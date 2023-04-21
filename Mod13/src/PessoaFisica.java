import java.util.Random;

public class PessoaFisica extends Pessoa{
	Random rd = new Random();
	private int[] cpf= new int[11];
	
	
	
	
	public String generateCPF() {
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			cpf[i] = rd.nextInt(10);
			sum += cpf[i] * (10 - i);
		}

		int digit1 = 11 - (sum % 11);
		if (digit1 >= 10) {
			digit1 = 0;
		}
		cpf[9] = digit1;
		sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += cpf[i] * (11 - i);
		}
		int digit2 = 11 - (sum % 11);
		if (digit2 >= 10) {
			digit2 = 0;
		}
		cpf[10] = digit2;

		String cpfString = "";
		for (int i = 0; i < 11; i++) {
			cpfString += Integer.toString(cpf[i]);
			if (i == 2 || i == 5) {
				cpfString += ".";
			} else if (i == 8) {
				cpfString += "-";
			}
		}
		return cpfString;
	}
	
}
