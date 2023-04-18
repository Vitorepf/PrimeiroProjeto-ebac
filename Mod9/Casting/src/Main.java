import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int a;
		
		//conversão
		num = (Integer) sc.nextInt();
		System.out.println(num);
		
		//conversão
		a= Integer.valueOf(sc.next());
		System.out.println(a);
		
		//conversão
		Object valor = 10;
		System.out.println(valor);
		
		//conversão
		String ConvInteiro = String.valueOf(num);
		System.out.println(ConvInteiro);
	
		//conversão
		int numerico = Integer.valueOf(num);
	}

}
