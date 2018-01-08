package credit.soc;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriberSettings {
    public ChromeDriver chromeDriver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/olya_/IdeaProjects/SocCredit/src/test/java/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        System.out.println("test start");
    }

    @After
    public void close(){
        chromeDriver.quit();
        System.out.println("test close");
    }
}
