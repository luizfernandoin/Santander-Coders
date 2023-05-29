package introduçãoJAVA;

public class ConditionalOperators {
    public static void main(String[] args) {
        int mediaFinal = 85;
        String situacao = "";

        if (mediaFinal < 40) {
            situacao = "Reprovado";
        } else if (mediaFinal >= 40 && mediaFinal < 70) {
            situacao = "Prova Final";
        } else {
            situacao = "Aprovado";
        }
        System.out.println(situacao);

        //Operadores ternarios
        String qi = situacao == "Aprovado" ? "Muito Inteligente" : "Precisa melhorar";
        System.out.println(qi);

        //A >= 70; B > 40 e <= 70; C < 40 
        String graduacao = "B";

        switch (graduacao) {
            case "A":
                System.out.println("Aprovado!");
                break;
            case "B":
                System.out.println("Prova Final!");
                break;
            case "C":
                System.out.println("Reprovado.");
                break;
        }

        
    }
}
