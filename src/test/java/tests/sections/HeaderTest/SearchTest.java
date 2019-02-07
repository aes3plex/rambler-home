package tests.sections.HeaderTest;

import elements.Block;
import org.junit.Test;
import org.openqa.selenium.By;
import tests.HomeSuite;

/**
 * Header search test
 */
public class SearchTest {
    private Block search = new Block(HomeSuite.driver);
    private static final String SEARCH = "input.rui-ComplexSearch-input";

    @Test
    public void isSearchTest() {
        assert search.isHere(By.cssSelector(SEARCH));
    }
}
