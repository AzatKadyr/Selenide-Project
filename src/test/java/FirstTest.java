import com.codeborne.selenide.Configuration;
import kz.elquaty.FirstPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static kz.elquaty.Constants.*;

public class FirstTest {

    FirstPage test = new FirstPage();

    @Test
    public void voteUser() throws Exception {
        Configuration.headless = false;
        Configuration.pageLoadTimeout = 100000;
        open(BASE_URL);
        test.insertLogin(LOGIN);
        test.insertPassword(PASSWORD);
        test.clickAuthBtn();
        test.clickCabinetLink();
        test.getInformation();
        test.assertVote();
    }

}
