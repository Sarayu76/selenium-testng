import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorIdTest {
    @Test
    public void locateById() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            System.out.println("Located using ID");
        } finally {
            driver.quit();
        }
    }
}
