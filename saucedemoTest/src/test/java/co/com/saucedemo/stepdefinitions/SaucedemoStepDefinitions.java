package co.com.saucedemo.stepsdefinitions;

import co.com.saucedemo.userinterfaces.SaucedemoHomePage;
import co.com.saucedemo.userinterfaces.SaucedemoLogin;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SaucedemoStepDefinitions {

    public static final int CURRENT_PRODUCT = 0;
    SaucedemoHomePage saucedemoHomePage;
    SaucedemoLogin saucedemoLogin;

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("Mariana");
    //Highlight highlight;

    @Before
    public void actorCanBrowseTheWeb() {
        user.can(BrowseTheWeb.with(hisBrowser));
        //highlight = new Highlight(hisBrowser);
    }

    @Given("User enters saucedemo site")
    public void userEntersSaucedemoSite() {
        user.wasAbleTo(Open.browserOn().the(saucedemoLogin));
    }

    @And("^User login$")
    public void userLogin() {

    }

    @When("user add the product to the shopping cart")
    public void userAddTheProductToTheShoppingCart() {
    }

    @Then("user verifies that the product of the shopping cart is the same one that was selected")
    public void userVerifiesThatTheProductOfTheShoppingCartIsTheSameOneThatWasSelected() {
    }
}
