package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {

    public static String generateToken() {

        Map<String, Object> gmi = new HashMap<>();
        gmi.put("password", "Team05+");
        gmi.put("rememberMe", true);
        gmi.put("username", "AdminTeam05");

        Response response = given().contentType(ContentType.JSON).body(gmi).when().post("https://medunna.com/api/authenticate");
        response.prettyPrint();

        return response.jsonPath().getString("id_token");
    }
}
