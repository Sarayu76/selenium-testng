import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorLinkTextTest {
    @Test
    public void locateByLinkText() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("A/B Testing")).click();
            System.out.println("Located using LINK_TEXT");
        } finally {
            driver.quit();
        }
    }
}
