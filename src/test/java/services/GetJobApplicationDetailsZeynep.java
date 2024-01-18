package services.Admin.JobAppController;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import services.Login;
import utilities.ConfigurationReader;

public class GetJobApplicationDetailsZeynep {

    static Response response;
    static Login login=new Login();

    public static Response getJobAppDetail(){
        login.loginRequest();
        response= RestAssured.given().contentType(ContentType.JSON).
                header("Authorization","Bearer "+ Login.token).get(ConfigurationReader.get("url2")+)
    }


}
