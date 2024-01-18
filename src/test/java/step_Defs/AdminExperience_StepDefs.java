package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.AdminExperiencesController;

public class AdminExperience_StepDefs {

    AdminExperiencesController adminExperiencesController=new AdminExperiencesController();
    @Given("Admin connects to the experiences end point with a valid candidate ID and valid Experience info")
    public void adminConnectsToTheExperiencesEndPointWithAValidCandidateIDAndValidExperienceInfo() {
        adminExperiencesController.getExperienceController();
    }

    @Then("Verify experience response with status code {int}")
    public void verifyExperienceResponseWithStatusCode(int statusCode) {
        adminExperiencesController.verifyExperiencesStatusCode(statusCode);
    }
}
