package tests.sections.HeaderTest;

import elements.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import tests.HomeSuite;

import java.util.ArrayList;
import java.util.List;


/**
 * Header main menu parametrized test
 */
@RunWith(Parameterized.class)
public class MenuTest {
    private Menu menu = new Menu(HomeSuite.driver);
    private String buttonName;
    private static final String MENU = "h2._29_f";


    public MenuTest(String buttonName){
        this.buttonName = buttonName;
    }

    @Parameterized.Parameters(name = "Пункт меню - {0}")
    public static List<String> data(){
        ArrayList<String> data = new ArrayList<>();
        data.add("В Москве");
        data.add("Политика");
        data.add("Спорт");
        data.add("Происшествия");

        return data;
    }

    @Test
    public void menuTest() {
        assert menu.getElemNames(By.cssSelector(MENU)).contains(buttonName);

    }
}
