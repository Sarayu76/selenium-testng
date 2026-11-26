import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorClassNameTest {
    @Test
    public void locateByClassName() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.className("radius")).click();
            System.out.println("Located using CLASS_NAME");
        } finally {
            driver.quit();
        }
    }
}
