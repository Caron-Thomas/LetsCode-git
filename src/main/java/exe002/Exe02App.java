package exe002;

import java.time.LocalDate;
import java.util.List;

//Aula de lambda!
public class Exe02App {
    public static void main(String[] args) {
        Agenda agendaDoThom = new MinhaAgenda();
        agendaDoThom.inserirContato(new Contato("José","(41)98569-6418", LocalDate.of(1982,11,15)));
        agendaDoThom.inserirContato(new Contato("Eduardo","(41)98456-6418", LocalDate.of(1978,12,22)));
        agendaDoThom.inserirContato(new Contato("Nicole","(41)91239-6418", LocalDate.of(1956,10,19)));
        agendaDoThom.inserirContato(new Contato("José Serra","(41)98569-9878", LocalDate.of(1992,9,1)));
        agendaDoThom.inserirContato(new Contato("Norberto","(41)98499-6418", LocalDate.of(2000,8,03)));
        agendaDoThom.inserirContato(new Contato("Joane","(41)98569-6123", LocalDate.of(2001,7,17)));
        agendaDoThom.inserirContato(new Contato("Marco","(41)98561-1956", LocalDate.of(1994,1,12)));
        agendaDoThom.inserirContato(new Contato("Maria","(41)98332-6418", LocalDate.of(2000,8,03)));
        agendaDoThom.inserirContato(new Contato("Maiko","(41)92345-6418", LocalDate.of(1983,5,23)));
        agendaDoThom.inserirContato(new Contato("Isabel","(41)92345-6789", LocalDate.of(1945,7,26)));

        //agendaDoThom.imprimirTodos();
        //aulaLambda(agendaDoThom);
        aulaLambda(agendaDoThom);
    }

    public static void aulaLambda(Agenda agenda){
        agenda.listar(c -> c.getNome().equals("Isabel"));
        agenda.listar(c -> c.getTelefone().equals("(41)92345-6418"));
        agenda.pesquisar(c -> c.getNome().equals("Norberto"));
    }


}
