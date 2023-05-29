package introduçãoJAVA;

public class FunctionDeclaration {
    public static void main(String[] args) {
        saudacao("Luiz");
        int resultado = soma(2, 5);
        System.out.println("O resultado foi " + resultado);
    }

    public static void saudacao (String nome) {
        System.out.println("Hello, " + nome.toUpperCase());
    }

    public static int soma(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }
}
