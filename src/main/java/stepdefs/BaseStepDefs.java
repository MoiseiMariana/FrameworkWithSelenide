package stepdefs;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import static com.codeborne.selenide.Selenide.open;

public class BaseStepDefs {

    @When("open application")
    public void openApp(){
        open("/");
    }

    @And("Sleep {int}")
    public void sleep(int milliseconds) {
        Selenide.sleep(milliseconds);
    }

}