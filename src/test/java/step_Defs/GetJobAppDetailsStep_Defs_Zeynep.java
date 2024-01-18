package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.GetJobApplicationDetailsZeynep;

public class GetJobAppDetailsStep_Defs_Zeynep {
    GetJobApplicationDetailsZeynep getJobApplicationDetailsZeynep=new GetJobApplicationDetailsZeynep();
    @Given("Admin makes a get request by using job application ID")
    public void admin_makes_a_get_request_by_using_job_application_id() {
        getJobApplicationDetailsZeynep.getJobAppDetail();

    }
    @Then("Admin verifies that response status code is {int} and response body")
    public void admin_verifies_that_response_status_code_is_and_response_body(Integer Code) {
        getJobApplicationDetailsZeynep.verifyDetailsOfJob(Code);

    }
}
