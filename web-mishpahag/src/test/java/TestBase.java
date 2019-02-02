import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://mish.sheygam.com/");
    }

    protected void fillLoginForm(String email, String pwd) {
        type(By.cssSelector("[placeholder='Email']"),email);

        type(By.cssSelector("[placeholder='Password']"), pwd);



    }

    private void type(By locator, String text) {
        if(text!=null) {
            wd.findElement(locator).click();
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }

    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }
}
