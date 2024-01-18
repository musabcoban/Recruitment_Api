package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PostJobAppNoteStepDefs {
    PostJobAppNoteServices postJobAppNoteServices=new PostJobAppNoteServices();
    @Given("Admin makes a post request by using job applicaion ID")
    public void admin_makes_a_post_request_by_using_job_applicaion_id() {
        postJobAppNoteServices.postRequestNote();

    }
    @Then("Admin verifies that the status code for the post request is {int}")
    public void admin_verifies_that_the_status_code_for_the_post_request_is(Integer stCode) {
        postJobAppNoteServices.verifyStatusCodeForJobApp(stCode);

    }

}
