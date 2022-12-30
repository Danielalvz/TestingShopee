package co.com.shopee.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.shopee.userinterfaces.ProductoDetalle.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfigProducto implements Task {

    private final String color;
    private final String cantidad;

    public ConfigProducto(String color, String cantidad) {
        this.color = color;
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
            MoveMouse.to(SELECT_COLOR.of(color)),
                Click.on(SELECT_COLOR.of(color)),
                Enter.theValue(cantidad).into(TXT_CANTIDAD),
                Click.on(BTN_BUY)

        );
    }

    public static ConfigProducto detallarProducto(String color, String cantidad) {
        return instrumented(ConfigProducto.class, color, cantidad);
    }
}
