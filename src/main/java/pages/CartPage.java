package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CartPage {

    private final SelenideElement bagItem = $(By.xpath("//td[text()='Samsung galaxy s7']"));
    private final SelenideElement placeOrderButton = $(By.xpath("//button[text()='Place Order']"));
    private final SelenideElement placeOrderModalWindow = $(By.xpath("//*[@id='orderModal']/div/div/div[1]"));
    private final SelenideElement nameFld = $(By.id("name"));
    private final SelenideElement countryFld = $(By.id("country"));
    private final SelenideElement cityFld = $(By.id("city"));
    private final SelenideElement cardFld = $(By.id("card"));
    private final SelenideElement monthFld = $(By.id("month"));
    private final SelenideElement yearFld = $(By.id("year"));
    private final SelenideElement purchaseButton = $(By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]"));
    private final SelenideElement confirmationOrderModalWindow = $(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2"));
    private final SelenideElement deleteSamsungGalaxyS6FromCart = $(By.xpath("//a[text()='Delete']"));
    public void checkTheCart() {
        bagItem.should(Condition.appear);
    }
    public void clickOnPlaceOrderButton(){
        placeOrderButton.should(Condition.clickable).click();
    }

    public void aModalWindowIsOpen(){
        placeOrderModalWindow.should(Condition.appear);

    }
    public void userEnterStringName(String name){
        nameFld.should(Condition.appear).sendKeys(name);
    }
    public void userEnterStringCountry(String country){
        countryFld.should(Condition.appear).sendKeys(country);

    }
    public void userEnterStringCity(String city){
        cityFld.should(Condition.appear).sendKeys(city);

    }
    public void userEnterStringCreditCard(String card){
        cardFld.should(Condition.appear).sendKeys(card);

    }
    public void userEnterStringMonth(String month){
        monthFld.should(Condition.appear).sendKeys(month);

    }
    public void userEnterStringYear(String year){
        yearFld.should(Condition.appear).sendKeys(year);

    }
    public void clickOnPurchaseButton(){
        purchaseButton.should(Condition.clickable).click();

    }
    public void orderIsPlacedAndAConfirmationMessageIsDisplayedOnTheScreen() {
        sleep(3000);
        confirmationOrderModalWindow.should(Condition.appear);
    }
    public void clickOnDeleteButton() {
        deleteSamsungGalaxyS6FromCart.should(Condition.clickable).click();
    }
    public boolean isProductDeletedFromCart() {
        // Check if the product is still present in the cart
        return !bagItem.is(Condition.exist);
    }


}