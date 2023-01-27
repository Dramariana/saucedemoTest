package co.com.saucedemo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.saucedemo.userinterfaces.SaucedemoLogin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CredentialsIntroduction implements Task {

    private String user = "problem_user";
    private String pass = "secret_sauce";


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(USER_NAME));
        actor.attemptsTo(Enter.theValue(pass).into(PASSWORD));
        actor.attemptsTo(Click.on(LOGIN_BUTTON));

    }

    public static CredentialsIntroduction Soucedemo() {
        return instrumented(CredentialsIntroduction.class);

    }


}
