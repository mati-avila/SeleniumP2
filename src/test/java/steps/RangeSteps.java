package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class RangeSteps {
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given ("I am on the home page")
    public void iAmOnTheHomePage() {
        paginaPrincipal.navigateToFreeRangeTesters();
    }
}
