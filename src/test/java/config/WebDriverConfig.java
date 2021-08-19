package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:api.properties",
        "file:/tmp/api.properties"

})
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("token")
    String token();
}