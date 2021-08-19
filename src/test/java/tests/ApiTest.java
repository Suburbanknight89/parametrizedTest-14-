package tests;

        import config.WebDriverConfig;
        import org.aeonbits.owner.ConfigFactory;
        import org.junit.jupiter.api.Test;

        import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    public void testApi() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.token()).isEqualTo("qwe132");
    }
}