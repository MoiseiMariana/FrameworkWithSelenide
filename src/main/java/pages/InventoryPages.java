package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPages {


    private final SelenideElement addToCartButton = $(By.xpath("//a[text()='Add to cart']"));
    private final SelenideElement cartButton = $(By.xpath("//*[@id='cartur']"));

    public void addPhoneToCart() {
        addToCartButton.should(Condition.clickable).click();

    }
    public void navigateToCart() {
        cartButton.should(Condition.appear).click();

    }

}