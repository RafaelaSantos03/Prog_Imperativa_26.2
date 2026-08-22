import java.util.Scanner;

public class Questao2  {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner (System.in);

      double peso, altura, imczinho; 

      System.out.println(" Olá!! Informe sua altura: ");
      altura = teclado.nextDouble();

      System.out.println(" Agora informe seu peso: ");
      peso = teclado.nextDouble();

      imczinho = peso / (altura * altura);

    if (imczinho < 18.5) {
        System.out.println("Seu IMC é:" + imczinho + "\n" + "Você está abaixo do peso.");
    } else if ( imczinho < 24.9 ){
        System.out.println("Seu IMC é:" + imczinho + "\n" + "Você está no peso normal");
    } else if (imczinho < 29.9)  {
        System.out.println("Seu IMC é:" + imczinho + "\n" + "Você está em sobrepeso");
    } else if (imczinho < 34.9 ) {
        System.out.println("Seu IMC é:" + imczinho + "\n" + "Você está Obeso 1");
    } else if (imczinho < 39.9) {
        System.out.println("Seu IMC é:" + imczinho + "\n" + "Você está Obeso 2");
     } 

    else {
    System.out.println("Seu IMC é:" + imczinho + "\n" + "Você está Obeso 3");

     }
        
     teclado.close();
}

    }