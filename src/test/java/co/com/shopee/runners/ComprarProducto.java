package co.com.shopee.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.shopee.steps",
        features = "src/test/resources/co.com.shopee/features/comprarProducto.feature",
        snippets = SnippetType.CAMELCASE

)

public class ComprarProducto {
}
