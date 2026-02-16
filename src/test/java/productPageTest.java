import org.testng.annotations.Test;
import pageClass.productPage;
import utility.BaseClass;

public class productPageTest extends BaseClass {
    productPage pp=new productPage();
    homePageTest hpt=new homePageTest();
@Test
    public void product_Checkout(){
        hpt.successfulLoginToHomePage();
        pp.sortingOption();
        pp.productName();
        pp.addToCart();
        pp.click_On_Cart_Symbol();
        pp.check_Out();
    }
}
