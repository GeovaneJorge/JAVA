//  O código abaixo faz uma verificação na idade da pessoa e se ela for maior de 18 anos e maior de 16 anos emancipada ela podera dirigir
// @ Autor: Geovane

import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você e emancipado? (S/N)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");


        if (age >= 18) {
            System.out.println(name +",você tem " + age + " anos, pode dirigir.");
        } else if (age >= 16 && isEmancipated) {
            System.out.println("Apesar de você ter " + age + " anos você é amncipado e pode dirigir.");
        } else {
            System.out.println(name + " você não pode dirigir pois tem " + age+ " anos e não é emancipado.");

        }
         System.out.println("Fim da Execução");

    }

}