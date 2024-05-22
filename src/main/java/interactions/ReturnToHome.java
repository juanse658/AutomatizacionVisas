package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import tasks.SelectTheAppointments;
import userinterfaces.AppointmentsAvailabilityPage;

public class ReturnToHome implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AppointmentsAvailabilityPage.BTN_CERRAR),
                GoToCalendar.go()
        );
    }
    public static ReturnToHome returnhome() {
        return Tasks.instrumented(ReturnToHome.class);
    }
}
