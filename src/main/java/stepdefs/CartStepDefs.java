package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartStepDefs {
    CartPage cartPage = new CartPage();

    @Then("phone should be in the cart")
    public void checkCart(){
        cartPage.checkTheCart();
    }

    @When("click on Place order button")
    public void clickOnPlaceOrderButton() {
        cartPage.clickOnPlaceOrderButton();
    }

    @And("a modal window is open")
    public void aModalWindowIsOpen() {
        cartPage.aModalWindowIsOpen();
    }

    @And("user enter {string} Name")
    public void userEnterStringName(String name) {
        cartPage.userEnterStringName(name);
    }

    @And("user enter {string} Country")
    public void userEnterStringCountry(String country) {
        cartPage.userEnterStringCountry(country);
    }

    @And("user enter {string} City")
    public void userEnterStringCity(String city) {
        cartPage.userEnterStringCity(city);
    }

    @And("user enter {string} Credit card")
    public void userEnterStringCreditCard(String card) {
        cartPage.userEnterStringCreditCard(card);
    }

    @And("user enter {string} Month")
    public void userEnterStringMonth(String month) {
        cartPage.userEnterStringMonth(month);

    }

    @And("user enter {string} Year")
    public void userEnterStringYear(String year) {
        cartPage.userEnterStringYear(year);
    }

    @And("click on Purchase button")
    public void clickOnPurchaseButton() {
        cartPage.clickOnPurchaseButton();
    }

    @Then("order is placed and a confirmation message is displayed on the screen")
    public void orderIsPlacedAndAConfirmationMessageIsDisplayedOnTheScreen() {
        cartPage.orderIsPlacedAndAConfirmationMessageIsDisplayedOnTheScreen();
    }
    //delete a product from bascket
    @And("click on delete Button")
    public void clickOnDeleteButton() {
        cartPage.clickOnDeleteButton();
    }

    @Then("the product disappeared from cart")
    public void isProductDeletedFromCart() {
        cartPage.isProductDeletedFromCart();
    }
}