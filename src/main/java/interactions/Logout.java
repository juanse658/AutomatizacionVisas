package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import tasks.Login;
import userinterfaces.AppointmentsAvailabilityPage;

public class Logout implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AppointmentsAvailabilityPage.BTN_ACCIONES),
                Click.on(AppointmentsAvailabilityPage.BTN_FINALIZAR_SESION),
                LoginAgain.login(),
                GoToCalendar.go()
                );
    }

    public static Logout logout() {
        return Tasks.instrumented(Logout.class);
    }
}
