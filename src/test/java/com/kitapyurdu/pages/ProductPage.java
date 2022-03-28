package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }


    public void selectProduct(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));

        methods.waitBySeconds(3);


        methods.scrollWithAction(By.xpath("(//a[@class='pr-img-link'])[7]"));
        methods.waitBySeconds(3);
    //577323
        methods.click(By.xpath("//*[@id=\"product-577328\"]//a[@class=\"add-to-favorites\"]"));
        methods.click(By.xpath("//*[@id=\"product-577323\"]//a[@class=\"add-to-favorites\"]"));
        //methods.click(By.id("product-532576"));

        //m
        methods.click(By.xpath("//*[@id=\"product-577332\"]//a[@class=\"add-to-favorites\"]"));
        methods.click(By.xpath("//*[@id=\"product-580553\"]//a[@class=\"add-to-favorites\"]"));

        methods.waitBySeconds(3);

        methods.click(By.xpath("//*[@id=\"header-bottom\"]//a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@class=\"lvl1catalog\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//div[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBySeconds(3);



        methods.click(By.xpath("//span[contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[contains(text(),'Hobi')]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"product-544545\"]"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("button-cart"));
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//*[@id=\"header-top\"]"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.click(By.xpath("//div[@class='product-cr'][3]//a[@data-title='Favorilerimden Sil']"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//*[@id=\"header-top\"]"));
        methods.waitBySeconds(3);
        methods.click(By.id("cart-items"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(2);


        methods.findElement(By.cssSelector("[name='quantity']")).clear();
        methods.sendKeys(By.cssSelector("[name='quantity']"),"2");
        methods.waitBySeconds(1);
       methods.click(By.xpath("//*[@class=\"fa fa-refresh green-icon\"]"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//div[@class=\"right\"]//a[@class=\"button red\"]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[@href=\"#tab-shipping-new-adress\"]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-firstname-companyname"),"hande");
        methods.sendKeys(By.id("address-lastname-title"),"neoldum");
        methods.selectByText(By.id("address-zone-id"),"İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-county-id"),"ADALAR");
        methods.waitBySeconds(2);

        methods.sendKeys(By.id("district"),"BURGAZADA MAH");
        methods.click(By.id("districtautocomplete-list"));
        methods.waitBySeconds(2);
        //address-address-text
        methods.sendKeys(By.id("address-address-text"),"BURGAZADA ");
        //address-telephone
        methods.sendKeys(By.id("address-telephone"),"1234567890");
        //address-mobile-telephone
        methods.sendKeys(By.id("address-mobile-telephone"),"5050456566");
        //address-postcode
        methods.sendKeys(By.id("address-postcode"),"34000");
        //address-tax-id
        methods.sendKeys(By.id("address-tax-id"),"23935109372");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        //button-checkout-continue
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-owner"),"hande neoldum");
        methods.sendKeys(By.id("credit_card_number_1"),"1234");
        methods.sendKeys(By.id("credit_card_number_2"),"1234");
        methods.sendKeys(By.id("credit_card_number_3"),"1234");
        methods.sendKeys(By.id("credit_card_number_4"),"1234");
        //credit-card-expire-date-month
        methods.selectByText(By.id("credit-card-expire-date-month"),"01");
        //credit-card-expire-date-year
        methods.selectByText(By.id("credit-card-expire-date-year"),"2022");
        //credit-card-security-code
        methods.sendKeys(By.id("credit-card-security-code"),"123");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        //checkout-logo
        methods.click(By.xpath("//*[@id=\"logo\"]/a"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//a[@class=\"common-sprite\"]//b"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href=\"https://www.kitapyurdu.com/index.php?route=account/logout\"]"));
        methods.waitBySeconds(3);
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("alınan text "+attribute);
        logger.info("alınan text "+attribute);
        methods.waitBySeconds(6);
    }

    public void textControl(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: "+text);
        logger.info("alınan text : "+ text );
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value= methods.getValue(By.id("search-input"));
        System.out.println("Alınan text "+ value);
        logger.info("Alınan text "+ value);
        Assert.assertEquals("testinium",value);
        methods.waitBySeconds(5);
    }
}