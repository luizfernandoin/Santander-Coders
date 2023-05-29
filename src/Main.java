import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        //Isso é um objeto propriamente dito, uma instancia da classe objeto. Um objeto referencia algo do mundo real.
        Cachorro cachorro2 = new Cachorro();

        cachorro2.nome = "Lulu";
        cachorro2.cor = "Morrom";
        cachorro2.altura = 25;
        cachorro2.peso = 5.5;
        cachorro2.tamanhoDoRabo = 5;

        cachorro2.latir();
    }

}
