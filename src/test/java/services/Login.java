package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class Login {
    Response response;
    static String firstName;
    static String email;
    public static String token;

    public void loginRequest(){
        String loginBody="{\n" +
                "  \"email\": \"Beau@yopmail.com\",\n" +
                "  \"password\": \"Test123!\"\n" +
                "}";

        response= RestAssured.given().contentType(ContentType.JSON).
                body(loginBody).log().all().
                when().post("auth/login").prettyPeek();
        firstName=response.jsonPath().getString("data.firstName");
        email=response.jsonPath().getString("data.email");
        token=response.jsonPath().getString("data.token");
    }

    public void verifyBody(String firstName,String lastName, String email,String id){

        Assert.assertEquals(firstName,response.jsonPath().getString("data.firstName"));
        Assert.assertEquals(email,response.jsonPath().getString("data.email"));
        Assert.assertEquals(lastName,response.jsonPath().getString("data.lastName"));
        Assert.assertEquals(id,response.jsonPath().getString("data.id"));
    }

    public String getToken(String email,String pass){
        String loginBody="{\n" +
                "  \"email\": \""+email+"\",\n" +
                "  \"password\": \""+pass+"\"\n" +
                "}";

        response= RestAssured.given().contentType(ContentType.JSON).
                body(loginBody).log().all().
                when().post("auth/login").prettyPeek();

        return response.jsonPath().getString("data.token");
    }

    public void sendAuthorizedRequest(String endpoint,String token,String id){

        RestAssured.given().contentType(ContentType.JSON).
                header("Authorization","Bearer "+token)
                .param("candidateId",id)
                        .get(endpoint).prettyPeek();

    }
    public void verifyStatusCode(int statusCode){
        Assert.assertEquals(statusCode,response.statusCode());
    }



}
