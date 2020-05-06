package simulado;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaComSalario, rendaComPrestacao, rendaGanho, gastosMedic, gastosEduca;
		
		
		/// LEITURA DE VARIAVEIS ///
		
		System.out.println("Renda anual com salário: ");
		rendaComSalario = sc.nextDouble();
		System.out.println("Renda anual com prestação de serviço: ");
		rendaComPrestacao = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		rendaGanho = sc.nextDouble();
		System.out.println("Gastos médicos: ");
		gastosMedic = sc.nextDouble();
		System.out.println("Gastos educacionais: ");
		gastosEduca = sc.nextDouble();
		
		
		
		sc.close();

	}

}
