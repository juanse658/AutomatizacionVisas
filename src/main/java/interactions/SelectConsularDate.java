package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AppointmentsAvailabilityPage;

public class SelectConsularDate implements Interaction {
    public static boolean isDate;
    int cont = 1;


    @Override
    public <T extends Actor> void performAs(T actor) {
        do {
            actor.attemptsTo(
                    Click.on(AppointmentsAvailabilityPage.BTN_NEXT_MONTHS)
            );

           /* if (AppointmentsAvailabilityPage.BTN_CONSULAR_APPOINTMENT_DATE.isVisibleFor(actor)) {
                actor.attemptsTo(
                        Click.on(AppointmentsAvailabilityPage.BTN_CONSULAR_APPOINTMENT_DATE)
                );
                this.isDate = true;
                break;
            } else {
                this.isDate = false;
            }*/
            cont = cont + 1;
        }
        while (cont <= 20);


    }

    public static SelectConsularDate select() {
        return Tasks.instrumented(SelectConsularDate.class);
    }
}
