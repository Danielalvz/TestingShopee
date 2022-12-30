package co.com.shopee.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.Wait;

import static co.com.shopee.userinterfaces.ShopeeHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BuscarProducto implements Task {

    private final String tipoCategoria;


    public BuscarProducto(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        validarVentanaEmergente(actor);
        actor.attemptsTo(
                MoveMouse.to(TITLE_CATEGORY),
                Click.on(TYPE_CATEGORY.of(tipoCategoria))
        );
    }

    public static BuscarProducto conDescripcion(String tipoCategoria) {
        return instrumented(BuscarProducto.class, tipoCategoria);
    }

    private void validarVentanaEmergente(Actor actor) {
        Wait.until(the(POP_UP_HOME2), isPresent()).forNoLongerThan(1);
        if (Visibility.of(POP_UP_HOME2).viewedBy(actor).asBoolean()) {
            actor.attemptsTo(Click.on(POP_UP_HOME));
        } else {
            System.out.println("No esta leyendo el popup");
            getDriver().navigate().refresh();
        }
    }
}
