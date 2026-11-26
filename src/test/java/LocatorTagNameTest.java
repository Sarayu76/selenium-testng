import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class LocatorTagNameTest {
    @Test
    public void locateByTagName() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");
            List<WebElement> inputs = driver.findElements(By.tagName("input"));
            System.out.println("Input elements: " + inputs.size());
        } finally {
            driver.quit();
        }
    }
}
