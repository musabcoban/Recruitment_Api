package step_Defs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import services.AdminDashboardController;

public class AdminDashboardController_StepDefs {
    AdminDashboardController adminDashboardController = new AdminDashboardController();
    @Then("I make a request to get dashboard data")
    public void i_make_a_request_to_get_dashboard_data() {
        adminDashboardController.getDashboardData();
    }
    @Then("Verify response with status code {int}")
    public void verify_response_with_status_code(Integer int1) {
      adminDashboardController.verifyStatusCode(200);
    }
    @Then("Verify response body contains {string}")
    public void verify_response_body_contains(String datam) {
        adminDashboardController.verifyResponseBodyContainsData(datam);
    }
}
