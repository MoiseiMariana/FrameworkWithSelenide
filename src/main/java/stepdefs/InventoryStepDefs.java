package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.InventoryPages;

public class InventoryStepDefs {
    InventoryPages inventoryPages = new InventoryPages();


    @When("user add phone to the cart")
    public void addToCart(){
        inventoryPages.addPhoneToCart();
    }

    @And("navigate to cart")
    public void navigateToCart() {
        inventoryPages.navigateToCart();
    }
}