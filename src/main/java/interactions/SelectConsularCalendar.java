package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AppointmentsAvailabilityPage;

public class SelectConsularCalendar implements Interaction {

    public static boolean isCalendar;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (AppointmentsAvailabilityPage.BTN_CONSULAR_CALENDAR.resolveFor(actor).isClickable()) {
            actor.attemptsTo(
                    Click.on(AppointmentsAvailabilityPage.BTN_CONSULAR_CALENDAR)
            );

            this.isCalendar = true;
        } else {
            this.isCalendar = false;
        }

    }


    public static SelectConsularCalendar select() {
        return Tasks.instrumented(SelectConsularCalendar.class);
    }
}
