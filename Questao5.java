import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, inicio, fim, atual;

        System.out.print("Olá!! Digite o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextInt();

        inicio = Math.min(num1, num2);
        fim = Math.max(num1, num2);

        System.out.println("Números pares:");
        atual = inicio;
        while (atual <= fim) {
            if (atual % 2 == 0) {
                System.out.println(atual);
            }
            atual++;
        }

        System.out.println("Números ímpares:");
        atual = inicio;
        while (atual <= fim) {
            if (atual % 2 != 0) {
                System.out.println(atual);
            }
            atual++;
        }

        teclado.close();
    }
}