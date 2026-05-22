package SistemaPolicia.AdaptadorTempo;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Data {

    public static String formatar(LocalDateTime dt, String padrao){
        return dt.format(DateTimeFormatter.ofPattern(padrao));
    }

    public static String formatarDataHoraPadrao(LocalDateTime dt){
        return formatar(dt, "dd/MM/yyy HH:mm");
    }

    public static long calcularMinutosEntreDatas(LocalDateTime inicio, LocalDateTime fim){
        return ChronoUnit.MINUTES.between(inicio, fim);
    }

    public static LocalDateTime adicionarTempoEmMinutos(LocalDateTime dt, int minutos){
        return dt.plusMinutes(minutos);
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();

        return Period.between(dataNascimento, hoje).getYears();
    }

}
