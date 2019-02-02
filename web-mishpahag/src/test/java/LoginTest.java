import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @FindBy (xpath = "//*[contains(text(),'Login')]")
    WebElement loginButton;


    @Test
    public void testLogin(){
        click(By.xpath("//*[contains(text(),'Login')]"));

        fillLoginForm("leosmail@bk.ru", "5284103");
    }



}
