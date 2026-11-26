import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorNameTest {
    @Test
    public void locateByName() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.name("username")).sendKeys("tomsmith");
            System.out.println("Located using NAME");
        } finally {
            driver.quit();
        }
    }
}
