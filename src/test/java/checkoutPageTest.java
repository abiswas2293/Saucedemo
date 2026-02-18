import org.testng.annotations.Test;
import pageClass.checkOutPage;
import utility.BaseClass;

public class checkoutPageTest extends BaseClass {
    productPageTest ppt=new productPageTest();
    checkOutPage cp=new checkOutPage();
@Test
    public void successful_adding_personal_details(){

        ppt.product_Checkout();
        cp.CustomerFirstName();
        cp.CustomerLastName();
        cp.zipCode();
        cp.clickContinueButton();
    }

}
