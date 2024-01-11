package services;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class AdminJobApplicationController_F {
    Response response;
    Login login = new Login();
    JsonPath jsonPath;

    public void getAdminJopApplicationControllerF(){
        String token =login.getToken(ConfigurationReader.get("fatma_admin"),ConfigurationReader.get("havva_pass"));
        response= given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("pageNumber",0)
                .queryParam("pageSize",10)
                .queryParam("searchKeyword","nikki")
                .queryParam("sortBy","id")
                .queryParam("sortDirection","asc")
                .header("Authorization","Bearer "+token)
                .get(ConfigurationReader.get("url22")+"admin/jobApplication/appliedJobs")
                .prettyPeek();
        response.prettyPrint();

    }
    public void verifyStatusCode_F(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }

}
