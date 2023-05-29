import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {

        //Declaração de arrays através do seu tamanho.
        int[] numeros = new int[5];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;

        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;
        
        for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros.length);

        //Declaração de arrays staticos.
        String[] vogais = {"A", "E", "I", "O", "U"};
        for (int i=0; i < vogais.length; i++) {
            System.out.println(vogais[i]);
        }

        System.out.println(Arrays.toString(vogais));
    }
}
