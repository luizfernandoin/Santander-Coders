public class App {
    public static void main(String[] args) throws Exception {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosPraia);
        
        if (vamosPraia && fazendoSol) {
            System.out.println("Fim de semana!");
        } else {
            System.out.println("Não eh fim de semana!");
        }

        //switch também é suportado.

    }
}
