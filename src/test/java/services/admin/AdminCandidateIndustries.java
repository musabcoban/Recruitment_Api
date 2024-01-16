package services.admin;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import services.Login;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class AdminCandidateIndustries {
    Response response;
    Login login = new Login();
    JsonPath jsonPath;
    int industriesId;
    String token =login.getToken(ConfigurationReader.get("serpil_admin"),ConfigurationReader.get("srpl_pswrd"));



    public void AdminCandidateIndustriesPut(){
        response= given().log().all()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+token)
                .get(ConfigurationReader.get("url22")+"admin/candidate/industries")
                .prettyPeek();
        jsonPath=response.jsonPath();
       


    }
}
