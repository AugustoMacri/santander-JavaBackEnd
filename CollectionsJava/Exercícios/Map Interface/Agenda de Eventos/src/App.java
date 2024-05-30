import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {
        AgendaEventos agendaEventos = new AgendaEventos();


        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MARCH, 15), "Evento1", "Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento2", "Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 15), "Evento3", "Atração3");

        //agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
