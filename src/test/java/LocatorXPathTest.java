import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorXPathTest {
    @Test
    public void locateByXPath() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
            System.out.println("Located using XPATH");
        } finally {
            driver.quit();
        }
    }
}
