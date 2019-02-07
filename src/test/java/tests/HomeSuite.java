package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.sections.FooterTest;
import tests.sections.HeaderTest.HeaderSuite;
import tests.sections.NewsSectionTest;

/**
 * Collect homepage sections
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        HeaderSuite.class,
        FooterTest.class,
        NewsSectionTest.class
})
public class HomeSuite extends Config {
    // just as holder
}
