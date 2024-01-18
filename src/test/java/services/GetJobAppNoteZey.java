package services;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;
import static org.junit.Assert.assertEquals;

public class GetJobAppNoteZey {
    Login login=new Login();
    Response response;



    public void getJobAppNote(){
        login.loginRequest();
        response= RestAssured.given().contentType(ContentType.JSON).log().all().
                header("Authorization","Bearer "+ Login.token).
                get(ConfigurationReader.get("url2")+"admin/jobApplication/note/159").
                prettyPeek();
    }

    public void verifyingDetailsOfJobAppNote(int statusCode){
        assertEquals(statusCode,response.statusCode());
        String json = "{\"data\":[{\"notes\":\"You can do this!\"}],\"errors\":[],\"timestamp\":\"2024-01-18T10:32:035Z\"}";
        String notesValue = JsonPath.read(json, "$.data[0].notes");
        String expectedNotesValue = "You can do this!";
        assertEquals(expectedNotesValue, notesValue);


    }


}
