public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Teste de Classe em Java!");

        String primeiroNome = "Geovane";
        String segundoNome = "Sistemas";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
