package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_EMAIL = Target.the("Username").locatedBy("//*[@id='user_email']");
    public static final Target TXT_PASSWORD = Target.the("Password").locatedBy("//*[@id='user_password']");
    public static final Target CHK_AGREEMENTS = Target.the("Agreements").locatedBy("//*[@for='policy_confirmed']");
    public static final Target BTN_LOGIN = Target.the("Login").locatedBy("//*[@name='commit']");

}
