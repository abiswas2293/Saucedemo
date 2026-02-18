package pageClass;

import utility.CommonFunctionsClass;

public class checkoutOverviewPage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();
    public void clickOrderButton(){
        String completeButton="//button[text()='Finish']";
        cf.click(completeButton);
    }

    public void SuccessfulOrderAssertion(){
        String actualText="//h2[text()='Thank you for your order!']";
        cf.assertion(actualText,"Thank you for your order!");
    }
}
