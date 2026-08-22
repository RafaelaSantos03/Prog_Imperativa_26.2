import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salarioBruto, contribuicao, salarioLiquido;

        System.out.print("Olá!! Digite seu salário bruto: ");
        salarioBruto = teclado.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        if (salarioBruto <= 1621.00) {
            contribuicao = salarioBruto * 0.075;
        }

        else if (salarioBruto <= 2902.84) {
            contribuicao = 1621.00 * 0.075;
            contribuicao += (salarioBruto - 1621.00) * 0.09;
        }

        else if (salarioBruto <= 4354.27) {
            contribuicao = 1621.00 * 0.075;
            contribuicao += (2902.84 - 1621.00) * 0.09;
            contribuicao += (salarioBruto - 2902.84) * 0.12;
        }

        else if (salarioBruto <= 8475.55) {
            contribuicao = 1621.00 * 0.075;
            contribuicao += (2902.84 - 1621.00) * 0.09;
            contribuicao += (4354.27 - 2902.84) * 0.12;
            contribuicao += (salarioBruto - 4354.27) * 0.14;
        }

        else {
            contribuicao = 1621.00 * 0.075;
            contribuicao += (2902.84 - 1621.00) * 0.09;
            contribuicao += (4354.27 - 2902.84) * 0.12;
            contribuicao += (8475.55 - 4354.27) * 0.14;
        }

        salarioLiquido = salarioBruto - contribuicao;

        System.out.println("Contribuição: R$ " + df.format(contribuicao));
        System.out.println("Salário líquido: R$ " + df.format(salarioLiquido));

        teclado.close();
    }
}