/*Aulas de Variaveis */
public class Variaves {
    public static void main(String[] args) {
        System.out.println("Tabela de Tipos Primitivos e seus valores:\r\n" + //
                "\r\n" + //
                "Tipo\tMemória\tValor Mínimo\tValor Máximo\r\n" + //
                "byte\t1 byte\t-128\t127\r\n" + //
                "short\t2 byte\t-32.768\t32.767\r\n" + //
                "int\t4 bytes\t-2.147.483.648\t2.147.483.647\r\n" + //
                "long\t8 bytes\t-9.223.372.036.854.775.808\t9.223.372.036.854.775.807\r\n" + //
                "Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:\r\n" + //
                "\r\n" + //
                "Tipo\tMemória\tMínimo\tMáximo\tPrecisão\r\n" + //
                "float\t4 bytes\t-3,4028E + 38\t3,4028E + 38\t6 – 7 dígitos\r\n" + //
                "double\t8 bytes\t-1,7976E + 308\t1,7976E + 308\t15 dígitos");

        
                double salario = 2.500;

        System.out.print("Informe seu salario: " + salario);

    }

}
