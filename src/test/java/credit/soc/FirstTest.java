package credit.soc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriberSettings{

    @Test
    public void firstTest(){

        chromeDriver.get("http://soc.credit/#/home");
        String titile = chromeDriver.getTitle();
        Assert.assertTrue(titile.equals("Витрина займов"));
        //chromeDriver.findElement(By.id(""));
      //  chromeDriver.findElement(By.className("f-form__group ff-group"));//.sendKeys("10000");


    }
/*    @Test
    public void secondTest(){

        chromeDriver.get("http://soc.credit/#/home");
        String titile = chromeDriver.getTitle();
        Assert.assertTrue(titile.equals("Витрина займов"));

    }*/

}
