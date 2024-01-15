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
    int applicationId;
    String token =login.getToken(ConfigurationReader.get("fatma_admin"),ConfigurationReader.get("havva_pass"));

    public void getAdminJopApplicationControllerF(){
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
        jsonPath=response.jsonPath();
        applicationId=jsonPath.getInt("data.data.applicationId[0]");
        System.out.println("applicationId = " + applicationId);

    }
    public void verifyStatusCode_F(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }
    public void verifyAdminJobResponseBodyContainsData(String dataControl){
        Assert.assertTrue(jsonPath.getString("data").contains(dataControl));
    }
    public void changeInterviewStatus(){
        response=given().contentType(ContentType.JSON)
                .queryParam("interviewStatusId",263)
                .header("Authorization","Bearer "+token)
                .put(ConfigurationReader.get("url22")+"admin/jobApplication/changeStatus/"+applicationId)
                .prettyPeek();
    }

}
