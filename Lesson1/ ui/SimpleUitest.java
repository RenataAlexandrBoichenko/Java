import java.util.concurrent.locks.Condition;

public class SimpleUitest{
    @Test
    public void userCanNotCreateAccountWithNameAndSurnameOnly(
        // Подготовка теста
        Selenide.open("https://parabank.parasoft.com/parabank/register.htm");

     // Шаги теста
        SelenideElement firstName = element(Selectors.byId(""));
        firstName.sendKeys("Ari");

        SelenideElement lastName = element(Selectors.byId(""));
        lastName.sendKeys("Boi");    

        SelenideElement Adress = element(Selectors.byId(""));
        adress.sendKeys("Popova 45");   
        
        SelenideElement City = element(Selectors.byId(""));
        city.sendKeys("Novi Sad");

        SelenideElement registerButton = element(Selectors.byValue("Register"));
        registerButton.click();

        // Проверка ожидаемого результата

        stateError.shouldHave(Condition.exactText(""));
        stateError.shouldHave(Condition.exactText(""));id costumer.address.state
        SelenideElement stateError = element(Selectors.byId(""));
id costumer.phoneNumber
        SelenideElement zipCodeError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));id address.zipCode

        SelenideElement ssnError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));id costumer.ssn

        SelenideElement userNameError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));id costumer.userName

        SelenideElement passwordError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));id costumer.password

        SelenideElement confirmError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));id repeatedPassword
 
        SelenideElement stateError = element(Selectors.byId(""));


    )
}
