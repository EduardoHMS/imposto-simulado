package simulado;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double gastoDedu, maxDedu, mensal, rendaComSalario, rendaComPrestacao, rendaGanho, gastosMedic, gastosEduca, impostoSal, impostoServ, impostoGanho;
		
		
		/// LEITURA DE VARIAVEIS ///
		
		System.out.println("Renda anual com sal�rio: ");
		rendaComSalario = sc.nextDouble();
		System.out.println("Renda anual com presta��o de servi�o: ");
		rendaComPrestacao = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		rendaGanho = sc.nextDouble();
		System.out.println("Gastos m�dicos: ");
		gastosMedic = sc.nextDouble();
		System.out.println("Gastos educacionais: ");
		gastosEduca = sc.nextDouble();
		
		/// RELAT�RIO DE IMPOSTO DE RENDA ///
		
		
		System.out.println("");
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println("");
		
		
		/// IMPOSTO SOBRE SAL�RIO ///
		mensal = rendaComSalario / 12.0;
		if(mensal < 3000.00) {
			impostoSal = mensal * 12;
		}else if(mensal <= 5000.00) {
			impostoSal = (mensal * 0.10) * 12;
		}else {
			impostoSal = (mensal * 0.20) * 12;
		}
		
		/// IMPOSTO SOBRE SERVI�OS ///
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
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impostoSal);
		System.out.printf("Imposto sobre servi�os: %.2f%n", impostoServ);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanho);
		
		
		/// DEDUTIVEIS ///
		gastoDedu = gastosMedic + gastosEduca;
		maxDedu = (impostoSal + impostoServ + impostoGanho) * 0.30;
		
		
		/// DEDU��ES ///
		System.out.println("");
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maxDedu);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastoDedu);
		
		
		sc.close();

	}

}
