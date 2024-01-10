package services;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class AdminInvite {
    static Response response;
    static Login login=new Login();
    static String rData;
    JsonPath jsonPath;
    public void getInviteData(){
        String token = login.getToken(ConfigurationReader.get("msb_admin"),ConfigurationReader.get("msb_pass"));
        response=given().contentType(ContentType.JSON).header("Authorization","Bearer "+token)
                .get(ConfigurationReader.get("url2")+"admin/invite").prettyPeek();
        rData=response.jsonPath().getString("data");
    }
    public void verifyStatusCode(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }
    public void verifyResponseBodyContainsData(String string){
        Assert.assertTrue(rData.contains(string));
    }
}
