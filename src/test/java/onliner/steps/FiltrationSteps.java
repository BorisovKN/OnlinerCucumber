package onliner.steps;

import framework.BaseTest;
import framework.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import onliner.pageObject.pages.AutobaraholkaPage;
import onliner.pageObject.pages.MainPage;

public class FiltrationSteps extends BaseTest {
    @Given("Go to {string}")
    public void goTo(String arg0) {
        driver.get(PropertyReader.getProperty("base.URL"));
    }
    @When("User navigates to the {string} page")
    public void userNavigatesToThePage(String arg0) {
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenu("Автобарахолка");
    }

    @And("User sets {string} - {string}{string} range for {string} filter")
    public void userSetsRangeForFilter(String arg0, String arg1, String arg2, String arg3) {
        AutobaraholkaPage autobaraholkaPage = new AutobaraholkaPage();
        autobaraholkaPage.currencySelection();
        autobaraholkaPage.inPutPrice();
    }

    @And("User sets {string} for {string} checkbox filter")
    public void userSetsForCheckboxFilter(String arg0, String arg1) {
        AutobaraholkaPage autobaraholkaPage = new AutobaraholkaPage();
        autobaraholkaPage.choiceOfBodyType();
        autobaraholkaPage.choiceOfTransmission();
    }

    @Then("Parameters for all car cards are correct")
    public void parametersForAllCarCardsAreCorrect() {
        AutobaraholkaPage autobaraholkaPage = new AutobaraholkaPage();
        autobaraholkaPage.autoFilter();
    }
}
