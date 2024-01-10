package services.admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Login;
import utilities.ConfigurationReader;

public class AdminCandidateController {
    Login login = new Login();

    @Given("Admin connects to the {string} end point with a valid candidate ID")
    public void adminConnectsToTheApiAdminCandidateCandidateIdEndPointWithAValidCandidateID(String str) {
        String token = login.getToken(ConfigurationReader.get("havva_admin"), ConfigurationReader.get("havva_pass"));
        System.out.println("token = " + token);
        login.sendAuthorizedRequest(str, ConfigurationReader.get("id"),token);
    }

    @Then("admin verifies that the Status Code of the response is {int}")
    public void adminVerifiesThatTheStatusCodeOfTheResponseIs(int str) {
        login.verifyStatusCode(str);
    }

    @Then("admin verifies the response body has mandatory fields")
    public void adminVerifiesTheResponseBodyHasMandatoryFields() {
        login.verifyBody("Roderick", "Zulauf", "superadmin1234@yopmail.com", String.valueOf(6850));
    }

    @Given("admin connects to the {string} end point with an invalid candidate ID")
    public void adminConnectsToTheApiAdminCandidateEndPointWithAnInvalidCandidateID(String str) {
        String token = login.getToken(ConfigurationReader.get("havva_admin"), ConfigurationReader.get("havva_pass"));
        System.out.println("token = " + token);
        login.sendAuthorizedRequest(str,ConfigurationReader.get("id"), token);
    }

    @Then("admin sees the message {string}")
    public void adminSeesTheMessage(String arg0) {

    }
}