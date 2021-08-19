package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final static String BASE_URL = "https://github.com";
    private final static String TITLE="GitHub: Where the world builds software · GitHub";


    @Test
    public void testOpenGitHubPage() {
        WebDriver driver = new FirefoxDriver();
        driver.get(BASE_URL);
        assertEquals(TITLE, driver.getTitle());
        driver.quit();
    }

}