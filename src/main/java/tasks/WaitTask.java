package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;

public class WaitTask implements Task {

    private final int seconds;

    public WaitTask(int seconds) {
        this.seconds = seconds;
    }

    public static WaitTask forSeconds(int seconds) {
        return new WaitTask(seconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
