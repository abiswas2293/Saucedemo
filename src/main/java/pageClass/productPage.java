package pageClass;

import utility.CommonFunctionsClass;

public class productPage extends CommonFunctionsClass {
    CommonFunctionsClass cf=new CommonFunctionsClass();

    public void sortingOption(){
        String selectSort="//select[@class='product_sort_container']";
        cf.dropDown(selectSort,"Price(low to high )");

    }
    public void productName(){
        String product="//div[text()='Sauce Labs Bolt T-Shirt']";
        cf.click(product);
    }
    public void addToCart(){
        String add_To_Cart_Button="//button[@id='add-to-cart']";
        cf.click(add_To_Cart_Button);
    }
    public void click_On_Cart_Symbol(){
        String CartSymbol="//a[@class='shopping_cart_link']";
        cf.click(CartSymbol);
    }
    public void check_Out(){
        String checkout="//button[@id='checkout']";
        cf.click(checkout);
    }

}
