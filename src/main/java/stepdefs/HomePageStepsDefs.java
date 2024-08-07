package stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepsDefs {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    @When("scroll to the product")
    public void scrollToTheProduct() {
        homePage.scrollToTheProduct();
    }
    @When("user click on desired product")
    public void userclickonSamsung(){
        homePage.userclickonSamsung();
    }

    @When("customer click on Sign up button")
    public void customerClickOnSignUpButton() {

        homePage.customerClickOnSignUpButton();
    }

    @And("Sing up modal should open")
    public void singUpModalShouldOpen() {

        homePage.singUpModalShouldOpen();
    }
    @When("customer enters a unique username")
    public void customerEntersAUniqueUsername() {

       String uniqueUsername = faker.name().username();
        homePage.customerEnterStringUsername(uniqueUsername);
    }

    @And("enter {string} password")
    public void enterStringPassword(String password) {
        homePage.enterStringPassword(password);
    }

    @And("click on Sign up")
    public void clickOnSignUp() {
        homePage.clickOnSignUp();
    }

    @When("an alert window should appear with confirmation")
    public void anAlertWindowShouldAppearWithConfirmation() {

        homePage.anAlertWindowShouldAppearWithConfirmation();
    }

    @And("customer click on OK button")
    public void customerClickOnOKButton() {

        homePage.confirmAlert();
    }

    @Then("the sign up process is successfully done and customer is landing to Home Page")
    public void theSignUpProcessIsSuccessfullyDoneAndCustomerIsLandingToHomePage() {
        homePage.theSignUpProcessIsSuccessfullyDoneAndCustomerIsLandingToHomePage();
    }

    @When("customer click on Log in button")
    public void clickOnLogInButton() {
        homePage.clickOnLogInButton();
    }

    @And("Log in modal window should open")
    public void openlogInModalWindow() {
        homePage.openlogInModalWindow();
    }

    @When("customer enters {string} Username")
    public void enterUsername(String usernameForLogin) {
        homePage.enterUsername(usernameForLogin);
    }

    @And("enter {string} Password")
    public void enterPassword(String passwordForLogin) {
        homePage.enterPassword(passwordForLogin);
    }

    @And("click on Log in button")
    public void clickOnLogIn() {
        homePage.clickOnLogIn();
    }

    @Then("the log in process is successfully done and Log out button appears on header")
    public void appearsLogOutButton() {
        homePage.appearsLogOutButton();

    }

    @When("customer click on Log out button")
    public void clickOnLogOutButton() {
        homePage.clickOnLogOutButton();
    }

    @Then("the log out process is successfully done and Log in button appears again")
    public void appearsLogInButtonAgain() {
        homePage.appearsLogInButtonAgain();
    }

    @When("click on Phones category")
    public void clickOnPhonesCategory() {
        homePage.clickOnPhonesCategory();
    }

    @Then("the product is displayed in the right category")
    public void theProductIsDisplayedInTheRightCategory() {
        homePage.theProductIsDisplayedInTheRightCategory();
    }

    @When("click on Contact button")
    public void clickOnContactButton() {
        homePage.clickOnContactButton();
    }

    @And("Contact form should open")
    public void contactFormShouldOpen() {
        homePage.contactFormShouldOpen();
    }

    @When("enter Contact Email")
    public void enterContactEmail() {
        String uniqueEmail = faker.internet().emailAddress();
        homePage.enterContactEmail(uniqueEmail);

    }

    @And("enter Contact Name")
    public void enterContactName() {
        String Name = faker.name().username();
        homePage.enterContactName(Name);
    }

    @And("enter Contact Message")
    public void enterContactMessage() {
        String randomMessage = faker.lorem().sentence();
        homePage.enterContactMessage(randomMessage);

    }

    @And("click on Send Message button")
    public void clickOnSendMessageButton() {
        homePage.clickOnSendMessageButton();
    }

    @Then("appears an alert pop up that confirm that the message was sent")
    public void appearsAnAlertPopUp() {
        homePage.appearsAnAlertPopUp();
    }
}