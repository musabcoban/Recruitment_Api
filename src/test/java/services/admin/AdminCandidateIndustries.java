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

public class AdminCandidateIndustries {
    Response response;
    Login login = new Login();
    JsonPath jsonPath;
    int industriesId;
    String token =login.getToken(ConfigurationReader.get("gokce_admin"),ConfigurationReader.get("gokce_pass"));



    public void getIndustriesInfo(){
        Map<String,Object> industriesInfo= new HashMap<>();
        industriesInfo.put("experienceYearsId",36);
        industriesInfo.put("industryId",44);

        List<Map<String,Object>> industriesBody = new ArrayList<>();
        industriesBody.add(industriesInfo);



        Map<String, Object> industriesBody2=new HashMap<>();
        industriesBody2.put("industries", industriesBody);


        response= given().log().all()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+token).body(industriesBody2)
                .put(ConfigurationReader.get("url2")+"admin/candidate/industries/2088")
                .prettyPeek();

       


    }
    public void verifyIndustriesStatusCode(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }
}
