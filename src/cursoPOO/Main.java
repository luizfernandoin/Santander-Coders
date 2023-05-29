package cursoPOO;
import cursoPOO.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        //Isso é um objeto propriamente dito, uma instancia da classe objeto. Um objeto referencia algo do mundo real.
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Lulu";
        cachorro1.cor = "Morrom";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;
    }

}
