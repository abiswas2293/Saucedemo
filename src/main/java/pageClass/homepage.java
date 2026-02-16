package pageClass;

import utility.CommonFunctionsClass;

public class homepage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();
    public void userId(){
        String user="//input[@id='user-name']";
        cf.typeText(user,"standard_user");
    }

    public void passwordId(){
        String pass="//input[@id='password']";
        cf.typeText(pass,"secret_sauce");
    }

    public void login(){
        String login="//input[@id='login-button']";
        cf.click(login);
    }
}
