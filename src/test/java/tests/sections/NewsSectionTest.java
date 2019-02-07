package tests.sections;

import elements.Block;
import org.junit.Test;
import org.openqa.selenium.By;
import tests.HomeSuite;

/**
 * News section test
 */
public class NewsSectionTest {

    private Block newSection = new Block(HomeSuite.driver);
    private static final String SELECTION = "section";

    @Test
    public void isSectionTest() {
        assert newSection.isHere(By.cssSelector(SELECTION));
    }
}
