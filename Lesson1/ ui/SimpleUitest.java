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

        SelenideElement stateError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));

        SelenideElement zipCodeError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));

        SelenideElement ssnError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));

        SelenideElement userNameError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));

        SelenideElement passwordError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));

        SelenideElement confirmError = element(Selectors.byId(""));
        stateError.shouldHave(Condition.exactText(""));

        SelenideElement stateError = element(Selectors.byId(""));


    )
}
