package elements;

import elements.abstracts.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Typical block class
 */

public class Block extends Pattern {

    public Block(WebDriver driver) {
        super(driver);
    }

    /**
     * @param elementBy - element locator
     * @return web element object
     */
    private WebElement getElem(By elementBy) {
        WebElement element = null;
        try {
            element = (new WebDriverWait(driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(elementBy));
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
        return element;
    }

    /**
     * @param elementBy - element locator
     * @return check is element on the page
     */
    public boolean isHere(By elementBy) {
        return getElem(elementBy) != null;
    }
}
