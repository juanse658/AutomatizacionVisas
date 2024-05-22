package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

import java.util.Map;

public class Login implements Task {
    private Map<String, String> info;

    public Login(DataTable info) {
        this.info = info.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(info.get("username")).into(LoginPage.TXT_EMAIL),
                Enter.theValue(info.get("password")).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.CHK_AGREEMENTS),
                Click.on(LoginPage.BTN_LOGIN)
        );

    }

    public static Login withInfo(DataTable info) {
        return Tasks.instrumented(Login.class, info);
    }
}
