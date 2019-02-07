package elements.abstracts;

import org.openqa.selenium.WebDriver;

/**
 * Web elements abstract class
 * Can collect elements joint methods in the future
 */
public abstract class Pattern {

    protected WebDriver driver;

    public Pattern(WebDriver driver) {
        this.driver = driver;
    }
}
