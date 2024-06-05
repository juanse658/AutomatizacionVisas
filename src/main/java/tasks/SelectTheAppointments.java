package tasks;

import interactions.GeneralFlow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectTheAppointments implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GeneralFlow.go()
        );
    }

    public static SelectTheAppointments select() {
        return Tasks.instrumented(SelectTheAppointments.class);
    }
}
