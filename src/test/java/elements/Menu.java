package elements;

import elements.abstracts.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Main menu class
 */
public class Menu extends Pattern {

    public Menu(WebDriver driver) {
        super(driver);
    }

    /**
     * @param elementBy - element locator
     * @return buttons like web elements array
     */
    private List<WebElement> getElem(By elementBy) {
        List<WebElement> buttons = new ArrayList<>();
        try {
            buttons =  (new WebDriverWait(driver, 15))
                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementBy));
        } catch (NoSuchElementException e) {
            e.getMessage();
        }

        return buttons;
    }

    /**
     * @param elementBy - element locator
     * @return buttons names array
     */
    public List<String> getElemNames(By elementBy) {
        List<String> buttonsNames = new ArrayList<>();
        List<WebElement> buttons = getElem(elementBy);
        for (WebElement button : buttons) {
            if(!button.getText().trim().isEmpty())
                buttonsNames.add(button.getText());
        }

        return buttonsNames;
    }

}
