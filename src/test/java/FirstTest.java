import kz.elquaty.FirstPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static kz.elquaty.Constants.*;

public class FirstTest {

    FirstPage test = new FirstPage();

    @Test
    public void testStart() throws InterruptedException {
        open(BASE_URL);
        test.inputLogin().setValue(LOGIN);
        test.inputPassword().setValue(PASSWORD);
        test.authButton().click();
        test.CabinetLink().click();
        Thread.sleep(10000);
    }
}
