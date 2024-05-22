package tasks;

import interactions.ReturnToHome;
import interactions.SelectDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AppointmentsAvailabilityPage;

public class SelectTheAppointments implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        if (!AppointmentsAvailabilityPage.BTN_CONSULAR_CALENDAR.isVisibleFor(actor)) {
            actor.attemptsTo(
                    ReturnToHome.returnhome()
            );
        } else {
            actor.attemptsTo(
                    SelectDate.select(),
                    Click.on(AppointmentsAvailabilityPage.LST_CONSULAR_APPOINTMENT_HOURS)
            );
        }
    }

    public static SelectTheAppointments select() {
        return Tasks.instrumented(SelectTheAppointments.class);
    }
}
