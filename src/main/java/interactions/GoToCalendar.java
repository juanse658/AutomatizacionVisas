package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import tasks.SelectTheAppointments;
import userinterfaces.RescheduleAppointmentPage;

public class GoToCalendar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RescheduleAppointmentPage.BTN_CONTINUE),
                Click.on(RescheduleAppointmentPage.BTN_RESCHEDULEAPPOINTMENT_1),
                Click.on(RescheduleAppointmentPage.BTN_RESCHEDULEAPPOINTMENT_2),
                SelectTheAppointments.select()
        );

    }

    public static GoToCalendar go() {
        return Tasks.instrumented(GoToCalendar.class);
    }

}
