package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.AppointmentsAvailabilityPage;

public class SelectDate implements Interaction {
    int cont = 1;

    @Override
    public <T extends Actor> void performAs(T actor) {
        do {
            actor.attemptsTo(
                    Click.on(AppointmentsAvailabilityPage.BTN_NEXT_MONTHS)
            );

            if (AppointmentsAvailabilityPage.BTN_CONSULAR_APPOINTMENT_DATE.isVisibleFor(actor)){

                break;
            }
            cont = cont + 1;
        }
        while (cont <= 5);


    }

    public static SelectDate select() {
        return Tasks.instrumented(SelectDate.class);
    }
}
