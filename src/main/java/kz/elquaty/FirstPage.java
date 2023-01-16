package kz.elquaty;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class FirstPage {

    public SelenideElement inputLogin(){
        return $(By.name("acount"));
    }

    public SelenideElement inputPassword(){
        return $(By.name("password"));
    }

    public SelenideElement authButton(){
        return $(By.xpath("//button[@type='submit']"));
    }

    public SelenideElement CabinetLink(){
        return $(By.xpath("//a[@href='/ru/cabinet']"));
    }


}
