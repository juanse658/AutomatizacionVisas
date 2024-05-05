package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate implements Task {

    private String url;

    public Navigate(String url){
        this.url = url;
    }



    public static Navigate to (String url){
        return Tasks.instrumented(Navigate.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn().thePageNamed(url)
        );
    }
}
