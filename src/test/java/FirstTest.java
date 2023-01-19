import com.codeborne.selenide.Configuration;
import kz.elquaty.FirstPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static kz.elquaty.Constants.*;

public class FirstTest {

    FirstPage test = new FirstPage();
//aaa
    @Test
    public void testStart() throws InterruptedException {
        Configuration.headless = true;
        open(BASE_URL);
        test.insertLogin(LOGIN);
        test.insertPassword(PASSWORD);
        test.clickAuthBtn();
        test.clickCabinetLink();
        Thread.sleep(10000);
        test.getInformation();
    }
}
