package step_Defs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import services.AdminJobApplicationController_F;

public class AdminJobApplicationControllerStepDef {
    AdminJobApplicationController_F adminJobApplicationController_f = new AdminJobApplicationController_F();

    @Given("I make a request with valid credentials for job all job application")
    public void i_make_a_request_with_valid_credentials_for_job_all_job_application() {
        adminJobApplicationController_f.getAdminJopApplicationControllerF();
    }

    @Then("Verify response with statuss code {int}")
    public void verify_response_with_status_code(int statusCode) {
        adminJobApplicationController_f.verifyStatusCode_F(statusCode);
    }

    @Then("Verify response body")
    public void verify_response_body() {
        adminJobApplicationController_f.verifyAdminJobResponseBodyContainsData("pageNumber");
        adminJobApplicationController_f.verifyAdminJobResponseBodyContainsData("totalPages");
        adminJobApplicationController_f.verifyAdminJobResponseBodyContainsData("totalCount");
    }

    @Given("I make a request with valid credentials for change status job application")
    public void i_make_a_request_with_valid_credentials_for_change_status_job_application() {
        adminJobApplicationController_f.getAdminJopApplicationControllerF();
        adminJobApplicationController_f.changeInterviewStatus(267);
    }

    @Given("I make a request with unvalid credentials for change status job application")
    public void i_make_a_request_with_unvalid_credentials_for_change_status_job_application() {
        adminJobApplicationController_f.getAdminJopApplicationControllerF();
        adminJobApplicationController_f.changeInterviewStatus(270);
    }


}
