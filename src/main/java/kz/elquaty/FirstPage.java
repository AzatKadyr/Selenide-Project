package kz.elquaty;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FirstPage {

    //a
    private SelenideElement inputLogin = $(By.name("acount"));
    private SelenideElement inputPassword = $(By.name("password"));
    private SelenideElement authButton = $(By.xpath("//button[@type='submit']"));
    private SelenideElement CabinetLink = $(By.xpath("//a[@href='/ru/cabinet']"));
    private SelenideElement userName = $(By.xpath("//div[@class='name-user']"));
    private SelenideElement personalAccount = $(By.xpath("(//div[@class='name-user'])[2]"));
    private SelenideElement userStatus = $(By.xpath("(//div[@class='name-user'])[3]"));

    public void insertLogin(String login) {
        inputLogin.shouldBe(Condition.visible).setValue(login);
    }

    public void insertPassword(String password) {
        inputPassword.shouldBe(Condition.visible).setValue(password);
    }

    public void clickAuthBtn() {
        authButton.shouldBe(Condition.visible).click();
    }

    public void clickCabinetLink() {
        CabinetLink.shouldBe(Condition.visible).click();
    }

    public void getInformation(){
        System.out.println(userName.getText());
        System.out.println(personalAccount.getText());
        System.out.println(userStatus.getText());
    }

}
