package co.com.shopee.steps;

import co.com.shopee.tasks.BuscarProducto;
import co.com.shopee.tasks.ConfigProducto;
import co.com.shopee.tasks.ElegirSeccion;
import co.com.shopee.userinterfaces.ShopeeHome;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static co.com.shopee.userinterfaces.IniciarSesion.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;



public class ComprarStepDefinition {

    private ShopeeHome homePage = new ShopeeHome();

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^Deseo buscar un producto en shopee$")
    public void deseoBuscarUnProductoEnShopee() {
        theActorCalled("usuario").wasAbleTo(Open.browserOn(homePage));

    }

    @When("^Selecciona la categoria \"([^\"]*)\", seccion \"([^\"]*)\" el producto \"([^\"]*)\" y sus especificaciones \"([^\"]*)\" \"([^\"]*)\"$")
    public void seleccionaLaCategoriaSeccionElProductoYSusEspecificaciones(String categoria, String seccion, String producto, String color, String cantidad) {
        theActorInTheSpotlight().wasAbleTo(
                BuscarProducto.conDescripcion(categoria),
                ElegirSeccion.tipoSeccion(seccion, producto),
                ConfigProducto.detallarProducto(color, cantidad)
        );

    }

    @Then("^Valida que el producto sea agregado al carrito de compras$")
    public void validaQueElProductoSeaAgregadoAlCarritoDeCompras() {
        theActorInTheSpotlight().should(seeThat(the(TITLE_LOGIN), isPresent()));
        System.out.println(TITLE_LOGIN);
    }



}

