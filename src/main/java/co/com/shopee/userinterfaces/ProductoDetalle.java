package co.com.shopee.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoDetalle {

    public static final Target SELECT_COLOR = Target.the("Selecciona color").locatedBy("//button[contains(text(), '{0}')]");
    public static final Target TXT_CANTIDAD = Target.the("Texto de seleccionar cantidad").locatedBy("//input[@class='sRpgE4 CXBc4V']");
    public static final Target BTN_BUY = Target.the("Boton de comprar ahora").locatedBy("//button[contains(text(), 'compra')]");
}
