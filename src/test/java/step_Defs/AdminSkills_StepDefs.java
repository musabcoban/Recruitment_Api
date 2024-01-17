package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.AdminSkillsController;

public class AdminSkills_StepDefs {

    AdminSkillsController adminSkillsController=new AdminSkillsController();

    @Given("Admin connects to the skills end point with a valid candidate ID and valid skills info")
    public void adminConnectsToTheSkillsEndPointWithAValidCandidateIDAndValidSkillsInfo() {
        adminSkillsController.getSkillsInfo();
    }

    @Then("Verify skills response with status code {int}")
    public void verifySkillsResponseWithStatusCode(int statusCode) {
        adminSkillsController.verifySkillsStatusCode(statusCode);
    }
}
