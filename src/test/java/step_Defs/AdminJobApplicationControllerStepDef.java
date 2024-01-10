package step_Defs;

import io.cucumber.java.en.*;
import services.AdminJobApplicationController_F;

public class AdminJobApplicationControllerStepDef {
    AdminJobApplicationController_F adminJobApplicationController_f = new AdminJobApplicationController_F();

    @Given("I make a request with valid credentials for job all job application")
    public void i_make_a_request_with_valid_credentials_for_job_all_job_application() {
        adminJobApplicationController_f.getAdminJopApplicationControllerF();
    }

    @Then("Verify response with status code {int}")
    public void verify_response_with_status_code(int statusCode) {

    }

    @Then("Verify response body")
    public void verify_response_body() {

    }

}
