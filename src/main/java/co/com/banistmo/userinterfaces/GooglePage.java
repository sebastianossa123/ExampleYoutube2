package co.com.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GooglePage extends PageObject {

    public static final Target SEARCH_BAR = Target.the("Search bar google").located(By.name("q"));

    public static final Target SEARCH_GOOGLE = Target.the("Button search google").located(By.name("btnK"));

    public static final Target BUTTON_YOUTUBE = Target.the("Click in button youtube").locatedBy("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3");

    public static final Target YOUTUBE_ICON = Target.the("Icon the youtube").locatedBy("//*[@id=\"logo-icon-container\"]");
}
