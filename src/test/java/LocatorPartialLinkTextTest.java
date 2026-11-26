import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorPartialLinkTextTest {
    @Test
    public void locateByPartialLinkText() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.partialLinkText("A/B")).click();
            System.out.println("Located using PARTIAL_LINK_TEXT");
        } finally {
            driver.quit();
        }
    }
}
