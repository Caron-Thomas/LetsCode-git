package exe001;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ex1CalculaIdade();
        fusoHorario();

    }

    private static void ex1CalculaIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de nascimento do peão: (dd/mm/aaaa): ");
        LocalDate nascimento = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period period = Period.between(nascimento, LocalDate.now());
        System.out.printf("Idade: %d anos %d meses e %d dias", period.getYears(), period.getMonths(),
                period.getDays());
    }

    private static void fusoHorario(){
        var dataHoraAtual = LocalDateTime.now();
        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime horaSaoPaulo = ZonedDateTime.of(dataHoraAtual, fusoSaoPaulo);
        System.out.println("Hora São Paulo: " + horaSaoPaulo);

        ZoneId fusoParis = ZoneId.of("Europe/Paris");
        LocalDateTime hora2 = LocalDateTime.now(fusoParis);
        System.out.println("Hora de Paris: "+ hora2);

        ZonedDateTime horaParis = ZonedDateTime.of(dataHoraAtual, fusoParis);
        System.out.println("Hora de Paris, pelo método 2: " + horaParis);

        Duration diferecaHoras = Duration.between(LocalDateTime.now(), hora2);
        System.out.println(diferecaHoras);
        System.out.println(ZoneId.systemDefault());
    }

}
