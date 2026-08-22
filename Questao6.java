import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, contador;

        System.out.print("Olá!! Digite um número inteiro positivo: ");
        num = teclado.nextInt();

        long fatorial = 1;
        contador = num;

        while (contador > 0) {
            fatorial *= contador;
            contador--;
        }

        System.out.println("O fatorial de " + num + " é " + fatorial);

        teclado.close();
    }
}