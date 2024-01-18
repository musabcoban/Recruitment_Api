package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;


public class PostJobAppNoteServices {
    Response response;
    Login login=new Login();

    public void postRequestNote(){
        login.loginRequest();

        String jobAppNote="{\n" +
                "    \"input\": \"You can do this!\"\n" +
                "}";

        response= RestAssured.given().
                contentType(ContentType.JSON).
                body(jobAppNote).header("Authorization","Bearer "+Login.token).
                post(ConfigurationReader.get("url2")+"admin/jobApplication/note/152").
                prettyPeek();
    }

    public void verifyStatusCodeForJobApp(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }

}
