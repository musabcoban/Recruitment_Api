package step_Defs.admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.AdminInvite;
import services.admin.AdminCandidateLanguages;

public class AdminCandidateLanguages_StepDef {
    AdminCandidateLanguages adminCandidateLanguages= new AdminCandidateLanguages();



    @Given("Admin connects to the languages end point with a valid candidate ID and valid info")
    public void adminConnectsToTheLanguagesEndPointWithAValidCandidateIDAndValidInfo() {
        adminCandidateLanguages.getLanguagesInfo();
    }

    @Then("Verify languages response with status code {int}")
    public void verifyLanguagesResponseWithStatusCode(int statusCode) {
        adminCandidateLanguages.verifyLanguagesStatusCode(statusCode);
    }
}
