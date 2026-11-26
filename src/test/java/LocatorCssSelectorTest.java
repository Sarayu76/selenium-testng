import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorCssSelectorTest {
    @Test
    public void locateByCssSelector() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
            System.out.println("Located using CSS_SELECTOR");
        } finally {
            driver.quit();
        }
    }
}
