package services.admin;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import services.Login;
import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AdminCandidateLanguages {
    Response response;
    Login login = new Login();
    JsonPath jsonPath;
    int industriesId;
    String token =login.getToken(ConfigurationReader.get("gokce_admin"),ConfigurationReader.get("gokce_pass"));



    public void getLanguagesInfo(){
        Map<String,Object> languagesInfo = new HashMap<>();
        languagesInfo.put("languageId",251);
        languagesInfo.put("languageLevelId",7);

        List<Map<String,Object>> languagesBody = new ArrayList<>();
        languagesBody.add(languagesInfo);



        Map<String, Object> languagesBody2 =new HashMap<>();
        languagesBody2.put("languages", languagesBody);


        response= given().log().all()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+token).body(languagesBody2)
                .put(ConfigurationReader.get("url2")+"admin/candidate/industries/2088")
                .prettyPeek();




    }
    public void verifyLanguagesStatusCode(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }
}




