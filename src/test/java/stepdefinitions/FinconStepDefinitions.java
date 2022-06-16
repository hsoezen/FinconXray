package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.FinconPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FinconStepDefinitions {
    FinconPage finconPage = new FinconPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Der User öffnet die {string}")
    public void derUserÖffnetDie(String start_seite) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(start_seite));
        finconPage.speichern.click();

    }

    @Then("Der User klick auf Menu")
    public void derUserKlickAufMenu() throws InterruptedException {
        finconPage.menu.click();
        Thread.sleep(2000);
    }

    @And("Der User scroll down")
    public void derUserScrollDown() throws InterruptedException {
        finconPage.zweiteMenu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Der User klick auf Standorte")
    public void derUserKlickAufStandorte() throws InterruptedException {
        for (WebElement w: finconPage.menuList
        ) {
            System.out.println(w.getText());
            if (w.getText().contains("Standorte")){
                System.out.println(w.getText());
                Thread.sleep(2000);
                w.click();
            }
        }


        for (WebElement w: finconPage.standoerten
        ) {
            //w.getText();
            System.out.println(w.getText());
        }
    }



}
