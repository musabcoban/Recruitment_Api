package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

public class GetJobApplicationDetailsZeynep {

    Response response;
    static Login login=new Login();
    static String status;
    static String expiringStatus;
    static String jobTitle;


    public void getJobAppDetail(){
        login.loginRequest();
        response= RestAssured.given().contentType(ContentType.JSON).log().all().
                header("Authorization","Bearer "+ Login.token).
                get(ConfigurationReader.get("url2")+"admin/jobApplication/jobDetail/138").
                prettyPeek();

        status=response.jsonPath().getString("data.status");
        expiringStatus=response.jsonPath().getString("data.expiringStatus");
        jobTitle=response.jsonPath().getString("data.jobTitle");
    }

    public void verifyDetailsOfJob(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
        Assert.assertEquals("CLOSED",status);
        Assert.assertEquals("ACTIVE",expiringStatus);
        Assert.assertEquals("UX Designer",jobTitle);

    }


}
