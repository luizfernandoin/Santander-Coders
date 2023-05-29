package introduçãoJAVA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringManipulator {
    public static void main(String[] args) {
        //Olá, {nome}. Hoje é {dia da semana}, BOM DIA.

        String nome = "Luiz";

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 18){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 &&agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 &&agora.getHour() < 24){
            saudacao = "Boa tarde";
        }
        else {
            saudacao = "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s. %s! %n", nome, diaSemana, saudacao, saudacao.toUpperCase());
    }
}
