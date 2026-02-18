package pageClass;

import utility.CommonFunctionsClass;

public class checkOutPage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();
    public void CustomerFirstName() {
        String nameLocator = "//input[@id='first-name']";
        cf.typeText(nameLocator, "AB");
    }

    public void CustomerLastName(){
        String lastNameLocator="//input[@id='last-name']";
        cf.typeText(lastNameLocator,"XY");
    }

    public void zipCode(){
        String zipLocator="//input[@id='postal-code']";
        cf.typeText(zipLocator,"vhfvhg");
    }

    public void clickContinueButton(){
        String continueButtonLocator="//input[@id='continue']";
        cf.click(continueButtonLocator);

    }


}
