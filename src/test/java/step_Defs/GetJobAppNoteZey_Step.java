package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.GetJobAppNoteZey;

public class GetJobAppNoteZey_Step {
    GetJobAppNoteZey getJobAppNoteZey=new GetJobAppNoteZey();
    @Given("Admin makes a get request by using correct job application ID")
    public void admin_makes_a_get_request_by_using_correct_job_application_id() {
        getJobAppNoteZey.getJobAppNote();

    }
    @Then("Admin should be able to verify that statu code for the request is {int} and the message is visible")
    public void admin_should_be_able_to_verify_that_statu_code_for_the_request_is_and_the_message_is_visible(Integer code) {
        getJobAppNoteZey.verifyingDetailsOfJobAppNote(code);

    }
}
