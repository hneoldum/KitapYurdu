package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.pages.LoginPage;
import com.kitapyurdu.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage= new LoginPage();
        ProductPage productPage= new ProductPage();
        loginPage.login();
        productPage.selectProduct();

    }
    @Test
    public void getAttributeTest(){
        ProductPage productPage= new ProductPage();
        productPage.attributeTest();
    }
    @Test
    public void getTextTest(){
        LoginPage loginPage= new LoginPage();
        ProductPage productPage= new ProductPage();

        loginPage.login();
        productPage.textControl();
    }
    @Test
    public void valueTest(){
        ProductPage productPage= new ProductPage();
        productPage.valueControlTest();

    }
}
