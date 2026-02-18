import org.testng.annotations.Test;
import pageClass.checkoutOverviewPage;
import utility.BaseClass;

public class checkoutOverviewPageTest extends BaseClass {
    checkoutPageTest cpt=new checkoutPageTest();
    checkoutOverviewPage cop=new checkoutOverviewPage();
@Test
    public void successfulOrder(){
        cpt.successful_adding_personal_details();
        cop.clickOrderButton();
        cop.SuccessfulOrderAssertion();
    }
}
