import java.util.Scanner;

public class AccessControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        int age = scanner.nextInt(); // Lê a idade como inteiro
        
        if(hasPermission == true && age >= 18){
            System.out.println("Acesso permitido");

        } else if (hasPermission == false && age >=25 ) {
            System.out.println("Acesso negado");
            
        } else if (hasPermission == true && age >= 16) {
            System.out.println("Idade insuficiente");
        }

        scanner.close();
    }
}
