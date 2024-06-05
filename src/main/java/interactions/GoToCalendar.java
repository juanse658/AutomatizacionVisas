package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import tasks.SelectTheAppointments;
import tasks.WaitTask;
import userinterfaces.RescheduleAppointmentPage;

public class GoToCalendar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (RescheduleAppointmentPage.BTN_CONTINUE.resolveFor(actor).isClickable()) {

            actor.attemptsTo(
                    Click.on(RescheduleAppointmentPage.BTN_CONTINUE),
                    Click.on(RescheduleAppointmentPage.BTN_RESCHEDULEAPPOINTMENT_1),
                    Click.on(RescheduleAppointmentPage.BTN_RESCHEDULEAPPOINTMENT_2),
                    SelectTheAppointments.select()
            );

        } else {
            actor.attemptsTo(
                    Open.url("https://ais.usvisa-info.com/es-co/niv/users/sign_in"),
                    LoginAgain.login(),
                    GoToCalendar.go()
            );
        }


    }

    public static GoToCalendar go() {
        return Tasks.instrumented(GoToCalendar.class);
    }

}
