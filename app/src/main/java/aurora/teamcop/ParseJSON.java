package aurora.teamcop;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *Created by beniw on 13/01/16
 * Processing the JSON response from the server
 */
public class ParseJSON {
    public static final String Key_message = "RESPONSE_MESSAGE";
    public static final String Key_success = "RESPONSE_SUCCESS";
    public static String response_message;
    public static int response_success;
    private String json;

    public ParseJSON(String json) {
        this.json = json;
    }

    protected void parseJSON() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
            response_message = jsonObject.getString(Key_message);
            response_success = jsonObject.getInt(Key_success);
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
