package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AppointmentsAvailabilityPage;

public class GeneralFlow implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {

        //Click en el primer calendario en caso que no se pueda dar click hacer Logout
        actor.attemptsTo(SelectConsularCalendar.select());
        if (!SelectConsularCalendar.isCalendar) {
            actor.attemptsTo(
                    Logout.logout()
            );
        }

        //buscar en los primeros meses una cita disponible en caso que no haya hacer logout
        actor.attemptsTo(SelectConsularDate.select());
        if (!SelectConsularDate.isDate) {
            actor.attemptsTo(
                    Logout.logout()
            );
        }

    }


    public static GeneralFlow go() {
        return Tasks.instrumented(GeneralFlow.class);
    }
}
