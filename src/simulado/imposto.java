package simulado;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double gastoDedu, maxDedu, mensal, rendaComSalario, rendaComPrestacao, rendaGanho, gastosMedic, gastosEduca, impostoSal, impostoServ, impostoGanho;
		
		
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
		
		/// RELATÓRIO DE IMPOSTO DE RENDA ///
		
		
		System.out.println("");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("");
		
		
		/// IMPOSTO SOBRE SALÁRIO ///
		mensal = rendaComSalario / 12.0;
		if(mensal < 3000.00) {
			impostoSal = mensal * 12;
		}else if(mensal <= 5000.00) {
			impostoSal = (mensal * 0.10) * 12;
		}else {
			impostoSal = (mensal * 0.20) * 12;
		}
		
		/// IMPOSTO SOBRE SERVIÇOS ///
		if(rendaComPrestacao > 0) {
			impostoServ = rendaComPrestacao * 0.15;
		}else {
			impostoServ = 0.00;
		}
		
		/// IMPOSTO SOBRE GANHO DE CAPITAL ///
		if(rendaGanho > 0) {
			impostoGanho = rendaGanho * 0.20;
		}else {
			impostoGanho = 0.00;
		}
		
		/// CONSOLIDADO DE RENDA ///
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSal);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServ);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanho);
		
		
		/// DEDUTIVEIS ///
		gastoDedu = gastosMedic + gastosEduca;
		maxDedu = (impostoSal + impostoServ + impostoGanho) * 0.30;
		
		
		/// DEDUÇÕES ///
		System.out.println("");
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maxDedu);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastoDedu);
		
		
		sc.close();

	}

}
