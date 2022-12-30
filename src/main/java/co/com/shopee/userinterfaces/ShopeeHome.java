package co.com.shopee.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://shopee.com.co")
public class ShopeeHome extends PageObject {

    public static final Target POP_UP_HOME = Target.the("Pop up emergente")
            .located(By.className("shopee-top shopee-top--sticky"));
    public static final Target POP_UP_HOME2 = Target.the("Pop up emergente")
            .located(By.className("shopee-popup__close-btn"));
    public static final Target TITLE_CATEGORY = Target.the("Seccion de categorias de prodcutos")
            .locatedBy("(//*[@class='shopee-header-section__content'])[2]");
    public static final Target TYPE_CATEGORY = Target.the("Selecciona el tipo de categoria por titulo")
            .locatedBy("(//*[@class='shopee-header-section__content'])[2]//div[contains(text(),'{0}')]");


}
