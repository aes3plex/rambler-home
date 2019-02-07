package tests.sections;

import elements.Block;
import org.junit.Test;
import org.openqa.selenium.By;
import tests.HomeSuite;

/**
 * Footer section test
 */
public class FooterTest {

    private Block footer = new Block(HomeSuite.driver);
    private static final String FOOTER = "footer";

    @Test
    public void isFooterTest() {
        assert footer.isHere(By.cssSelector(FOOTER));
    }

}
