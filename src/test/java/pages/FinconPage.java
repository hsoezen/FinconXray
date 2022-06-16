package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class FinconPage {
    public FinconPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "Speichern")
    public WebElement speichern;

    @FindBy(xpath = "//button[@aria-label='Toggle menu']")
    public WebElement menu;

    @FindBy(xpath = "(//li[@class='jsx-603722237'])[3]")
    public WebElement itBeratung;

    @FindBy(xpath = "(//div[@class='jsx-3357672282'])[2]")
    public WebElement seiteGrüẞSatz;

    @FindBy(xpath = "(//li[@class='jsx-603722237'])[10]")
    public WebElement zweiteMenu;

    @FindBy(xpath = "//li[@class='jsx-603722237']")
    public List<WebElement> menuList;

    @FindBy(xpath = "//div[@class='jsx-2769234621 standort-header']")
    public List<WebElement> standoerten;
}
