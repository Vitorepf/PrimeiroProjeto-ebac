import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int a;
		
		//convers�o
		num = (Integer) sc.nextInt();
		System.out.println(num);
		
		//convers�o
		a= Integer.valueOf(sc.next());
		System.out.println(a);
		
		//convers�o
		Object valor = 10;
		System.out.println(valor);
		
		//convers�o
		String ConvInteiro = String.valueOf(num);
		System.out.println(ConvInteiro);
	
		//convers�o
		int numerico = Integer.valueOf(num);
	}

}
