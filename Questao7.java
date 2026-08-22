import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, contador;

        System.out.print("Olá!! Digite um número inteiro: ");
        num = teclado.nextInt();

        contador = 1;
        while (contador <= 10) {
            System.out.println(num + " x " + contador + " = " + (num * contador));
            contador++;
        }

        teclado.close();
    }
}