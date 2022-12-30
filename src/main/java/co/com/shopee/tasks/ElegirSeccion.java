package co.com.shopee.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.shopee.userinterfaces.SeccionProducto.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ElegirSeccion implements Task {

    private final String seccion;
    private final String producto;

    public ElegirSeccion(String seccion, String producto) {
        this.seccion = seccion;
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(SELECT_SECCION.of(seccion)),
                Click.on(LINK_PRODUCT.of(producto))
        );
    }

    public static ElegirSeccion tipoSeccion(String seccion, String producto) {
        return instrumented(ElegirSeccion.class, seccion, producto);
    }
}
