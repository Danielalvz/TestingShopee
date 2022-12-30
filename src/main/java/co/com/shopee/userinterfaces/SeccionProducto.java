package co.com.shopee.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SeccionProducto {

    public static final Target SELECT_SECCION = Target.the("Selector de seccion de producto").locatedBy("(//a[contains(text(), '{0}')])[1]");
    public static final Target LINK_PRODUCT = Target.the("Selecciona producto por titulo").locatedBy("//div[contains(text(), '{0}')]");
}
