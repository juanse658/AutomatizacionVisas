package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AppointmentsAvailabilityPage {


    //Elementos primer Calendario
    public static final Target BTN_CONSULAR_CALENDAR = Target.the("Calendario Cita Consular").locatedBy("//*[@id='appointments_consulate_appointment_date']");
    public static final Target BTN_NEXT_MONTHS = Target.the("Calendario Cita Consular").locatedBy("//*[@class='ui-icon ui-icon-circle-triangle-e']");
    public static final Target BTN_CONSULAR_APPOINTMENT_DATE = Target.the("Fecha Cita Consular").locatedBy("(//*[@data-handler='selectDay'])[1]");
    public static final Target LST_CONSULAR_APPOINTMENT_HOURS = Target.the("Hora Cita Consular").locatedBy("//*[@id='appointments_consulate_appointment_time']");
    public static final Target OPT_CONSULAR_APPOINTMENT_HOURS = Target.the("Hora Cita Consular").locatedBy("//*[@id='appointments_consulate_appointment_time']//option[2]");
    //Elementos Segundo Calendario


    // Otros botones
    public static final Target BTN_CERRAR = Target.the("Boton Cerrar").locatedBy("//*[@class='button secondary']");
    public static final Target BTN_REPROGRAMAR = Target.the("Boton Reprogramar").locatedBy("//*[@class='action input_action ']");

    // Logout

    public static final Target BTN_ACCIONES = Target.the("Boton Acciones").locatedBy("(//*[@class='is-dropdown-submenu-parent opens-left'])[2]");
    public static final Target BTN_FINALIZAR_SESION = Target.the("Boton Finalizar Sesion").locatedBy("(//a[@href='/es-co/niv/users/sign_out'])[2]");
    public static final Target BTN_INICIAR_SESION = Target.the("Boton Iniciar Sesion").locatedBy("//*[@id='header']/nav/div/div/div[2]/div[1]/ul/li[3]/a");

}
