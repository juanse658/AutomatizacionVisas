package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RescheduleAppointmentPage {
    public static final Target BTN_CONTINUE = Target.the("Continue").locatedBy("//*[@class='button primary small']");
    public static final Target BTN_RESCHEDULEAPPOINTMENT_1 = Target.the("Continue1").locatedBy("//*[@class='fas fa-calendar-minus fa-lg fa-fw']/../..");
    public static final Target BTN_RESCHEDULEAPPOINTMENT_2 = Target.the("Continue2").locatedBy("//a[contains(text(),'Reprogramar cita')]");
}
