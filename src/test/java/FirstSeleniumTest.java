import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void browserCommands() {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Get page title
        System.out.println("Title: " + driver.getTitle());

        // Get current URL
        System.out.println("URL: " + driver.getCurrentUrl());

        // Navigate to another website
        driver.navigate().to("https://www.wikipedia.org");

        // Go back
        driver.navigate().back();

        // Go forward
        driver.navigate().forward();

        // Refresh page
        driver.navigate().refresh();

        // Close browser
        driver.quit();
    }
}
