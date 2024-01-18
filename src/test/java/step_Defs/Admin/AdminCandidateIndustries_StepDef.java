package step_Defs.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.admin.AdminCandidateIndustries;

public class AdminCandidateIndustries_StepDef {
    AdminCandidateIndustries adminCandidateIndustries=new AdminCandidateIndustries();
    @Given("Admin connects to the industries end point with a valid candidate ID and valid info")
    public void adminConnectsToTheIndustriesEndPointWithAValidCandidateIDAndValidInfo() {
        adminCandidateIndustries.getIndustriesInfo();
    }

    @Then("Verify industries response with status code {int}")
    public void verifyIndustriesResponseWithStatusCode(int statusCode ){
        adminCandidateIndustries.verifyIndustriesStatusCode(statusCode);

    }
}
