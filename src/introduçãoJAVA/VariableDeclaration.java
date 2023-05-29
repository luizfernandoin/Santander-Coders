package introduçãoJAVA;
import java.util.Date;
import java.time.LocalDate;

public class VariableDeclaration {
    public static void main(String[] args) {
        // Variáveis numéricas:
        int age = 25;
        double salary = 2500.50;
        long population = 7896541230L;
        float temperature = 27.5f;

        // Variáveis de texto:
        String name = "John Doe";
        char grade = 'A';

        // Variáveis booleanas:
        boolean isStudent = true;
        boolean hasCar = false;

        // Variáveis de data e hora (requer importação de pacotes):
        Date currentDate = new Date();
        LocalDate birthDate = LocalDate.of(1990, 5, 15);

        // Variáveis de array:
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] names = { "Alice", "Bob", "Charlie" };
    }
}
