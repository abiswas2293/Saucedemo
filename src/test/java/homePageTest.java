import org.testng.annotations.Test;
import pageClass.homepage;
import utility.BaseClass;

public class homePageTest extends BaseClass {
    homepage hp=new homepage();
@Test
    public void successfulLoginToHomePage(){

        hp.userId();
        hp.passwordId();
        hp.login();
    }




}
