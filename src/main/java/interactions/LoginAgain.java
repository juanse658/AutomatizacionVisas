package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import tasks.WaitTask;
import userinterfaces.AppointmentsAvailabilityPage;
import userinterfaces.LoginPage;

import java.time.Duration;


public class LoginAgain implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AppointmentsAvailabilityPage.BTN_INICIAR_SESION),
                Enter.theValue("juan.arbelaez316@gmail.com").into(LoginPage.TXT_EMAIL),
                Enter.theValue("123456789").into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.CHK_AGREEMENTS),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }

    public static LoginAgain login() {
        return Tasks.instrumented(LoginAgain.class);
    }
}
