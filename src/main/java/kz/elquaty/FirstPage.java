package kz.elquaty;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FirstPage {

    Utils utils = new Utils();
    //aaa
    private SelenideElement inputLogin = $(By.name("acount"));
    private SelenideElement inputPassword = $(By.name("password"));
    private SelenideElement authButton = $(By.xpath("//button[@type='submit']"));
    private SelenideElement CabinetLink = $(By.xpath("//a[@href='/ru/cabinet']"));
    private SelenideElement userName = $(By.xpath("//div[@class='name-user']"));
    private SelenideElement personalAccount = $(By.xpath("(//div[@class='name-user'])[2]"));
    private SelenideElement userStatus = $(By.xpath("(//div[@class='name-user'])[3]"));
    private SelenideElement acceptBtn = $(By.id("vote-accept"));
    private SelenideElement readBtn = $(By.xpath("//a[text()='ﬂ œ–Œ◊»“¿À —ŒŒ¡Ÿ≈Õ»≈']"));




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

    public void getInformation() throws Exception {
        System.out.println(userName.getText());
        System.out.println(personalAccount.getText());
        System.out.println(userStatus.getText());
        utils.getpost(userName.getText()+"   "+personalAccount.getText()+" œÓ„ÓÎÓÒÓ‚‡Î (-‡)");
    }

    public void assertVote(){
        System.out.println(readBtn.shouldBe(Condition.visible).isDisplayed());
        readBtn.shouldBe(Condition.visible).click();
        sleep(10000);
        acceptBtn.shouldBe(Condition.visible).click();
    }

}
