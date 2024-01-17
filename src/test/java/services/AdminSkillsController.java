package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.*;

import static io.restassured.RestAssured.given;

public class AdminSkillsController {
    Response response ;

    Login login=new Login();

    String token= login.getToken(ConfigurationReader.get("gokce_admin"),ConfigurationReader.get("gokce_pass"));

    public void getSkillsInfo(){

        Map<String, Object> skillsInfo= new HashMap<>();
        skillsInfo.put("experienceYearsId", 35);
        skillsInfo.put("toolId", 409);

        List<Map<String,Object>> skillsBody= new ArrayList<>();
        skillsBody.add(skillsInfo);

        Map<String, Object> skillsBody2=new HashMap<>();
        skillsBody2.put("skills", skillsBody);

        response=given().log().all()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token).body(skillsBody2)
                .put(ConfigurationReader.get("url2") + "admin/candidate/skills/2088").prettyPeek();
    }
    public void verifySkillsStatusCode(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }


}
