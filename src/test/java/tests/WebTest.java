package tests;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class WebTest {

    @Test
    public void testWebLocal() {
        System.setProperty("remote", "local");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("chrome");
        assertThat(config.browserVersion()).isEqualTo("92.0");
        assertThat(config.webDriverUrl()).isEqualTo("http://localhost:4444/wd/hub");
    }

    @Test
    public void testRemote() {
        System.setProperty("remote", "remote");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("firefox");
        assertThat(config.browserVersion()).isEqualTo("88.0");
        assertThat(config.webDriverUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }



}