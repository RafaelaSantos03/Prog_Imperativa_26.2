import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        int num1, num2, soma, subtracao, multiplicacao;
        double divisao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número");
        num1 = teclado.nextInt();
        System.out.println("Insira outro número");
        num2 = teclado.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;

        if (num2 != 0) {
            divisao = (double) num1 / num2;

            System.out.println("Soma: " + soma + "\n" + "Subtração: " + subtracao + "\n" + "Divisão: " + divisao + "\n"
                    + "Multiplicação: " + multiplicacao);
        } else {
            System.out.println("Soma: " + soma + "\n" + "Subtração: " + subtracao);
        }

        teclado.close();
    }

}
