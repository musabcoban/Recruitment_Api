package services;

import POJOs.ExperiencePojo;
import POJOs.ExperienceRootPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class AdminExperiencesController {
    Response response ;

    Login login=new Login();

    String token= login.getToken(ConfigurationReader.get("gokce_admin"),ConfigurationReader.get("gokce_pass"));

    ExperiencePojo experiencePojo;
    ExperienceRootPojo experienceRootPojo;

    public void getExperienceController(){

        ArrayList<Integer> toolsID= new ArrayList<>();
        toolsID.add(409);
        toolsID.add(144);

        experiencePojo=new ExperiencePojo("Talrise Academy", 15, null, "API Manual Tests", 22, "2023-11-07", true, "Backend Tester",toolsID,19);
        ArrayList<ExperiencePojo> experiencePojoList =new ArrayList<>();
        experiencePojoList.add(experiencePojo);
        experienceRootPojo =new ExperienceRootPojo(experiencePojoList, "false", "false");

        response=given().log().all()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token).body(experienceRootPojo)
                .put(ConfigurationReader.get("url2") + "admin/candidate/experiences/2088").prettyPeek();
    }
    public void verifyExperiencesStatusCode(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }

}
