public class ForLoopExample {
    public static void main(String[] args) {
        //Vamos fazer uma pequena calculadora de multiplicação para fixar.
        for (int i=1; i < 10; i++) {
            for (int j=0; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }
}
