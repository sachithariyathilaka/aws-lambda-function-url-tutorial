package aws.lambda;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.json.JSONObject;

/**
 * This is the code for the AWS console test.
 **/

/*
public class App implements RequestHandler<Resource, String> {

    @Override
    public String handleRequest(Resource input, Context context) {
        return "Your name is " + input.getName() + ", you are " + input.getAge() + " years old, and you are a " + input.getGender() + ".";
    }
}
*/

/**
 * This is the code for the Postman test.
 **/
public class App implements RequestHandler<Request, String> {

    @Override
    public String handleRequest(Request input, Context context)
    {
        try
        {
            JSONObject jsonObject  = new JSONObject(input.getBody());
            return "Your name is " + jsonObject.getString("name") + ", you are " + jsonObject.getInt("age") + " years old, and you are a " + jsonObject.getString("gender") + ".";
        } catch (Exception e)
        {
            throw new RuntimeException("Input body does not contains the required variables: " + e.getMessage());
        }
    }
}
