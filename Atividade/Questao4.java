import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Olá!! Insira seu salário:");
        salario = teclado.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        if (salario > 4500.00) {
            imposto = (salario - 4500) * 0.28;
            imposto += 1500 * 0.18;
            imposto += 1000 * 0.08;
            System.out.println("Imposto de renda retido na fonte é de: R$ " + (df.format(imposto)));
        }

        else if (salario > 3000.01) {
            imposto = (salario - 3000) * 0.18;
            imposto += 1000 * 0.08;
            System.out.println("Imposto de renda retido na fonte é de: R$ " + (df.format(imposto)));
        }

        else if (salario > 2000.01) {
            imposto = (salario - 2000) * 0.08;
            System.out.println("Imposto de renda retido na fonte é de: R$ " + (df.format(imposto)) );
        }

        else  {
            System.out.println("Seu salário está Isento do imposto de renda");
        }

        teclado.close();
    }
}
