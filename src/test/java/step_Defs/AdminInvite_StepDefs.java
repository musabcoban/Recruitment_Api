package step_Defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.AdminInvite;

public class AdminInvite_StepDefs {
    AdminInvite adminInvite = new AdminInvite();
    @When("I make a request to get invite data")
    public void i_make_a_request_to_get_invite_data() {
        adminInvite.getInviteData();
    }


}
