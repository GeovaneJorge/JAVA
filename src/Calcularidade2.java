//  O código abaixo faz uma verificação na idade da pessoa e se ela for maior de 18 anos e maior de 16 anos emancipada ela podera dirigir
// @ Autor: Geovane

import java.util.Scanner;

public class Calcularidade2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você e emancipado? (S/N)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");


      var canDrive = (age>= 18 ) || (age >= 16 && isEmancipated);
      var message = canDrive?
              name + ", você pode dirigir" :
              name + ", você não pode dirigir \n";
       System.out.println(message);
       System.out.println("Fin da Execução");
    }

}