package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:${host}.properties")
public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://github.com/")
    String getBaseUrl();

    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();


    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();
}