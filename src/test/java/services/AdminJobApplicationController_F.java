package services;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class AdminJobApplicationController_F {
    Response response;
    Login login = new Login();

    public void getAdminJopApplicationControllerF(){
        String token =login.getToken(ConfigurationReader.get("fatma_admin"),ConfigurationReader.get("havva_pass"));
        response= given().contentType(ContentType.JSON)
                .queryParam("pageNumber",0)
                .queryParam("pageSize",10)
                .queryParam("searchKeyword","nikki")
                .queryParam("sortBy","id")
                .queryParam("sortDirection","asc")
                .header("Authorization","Bearer "+token)
                .get(ConfigurationReader.get("url22")+"admin/jobApplication/appliedJobs")
                .prettyPeek();
    }

}
