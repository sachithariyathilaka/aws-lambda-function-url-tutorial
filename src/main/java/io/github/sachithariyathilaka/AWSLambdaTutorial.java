package io.github.sachithariyathilaka;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.github.sachithariyathilaka.resource.RequestBody;
import org.json.JSONObject;

/**
 * Main class for the aws lambda functional url test.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/06
 */
public class AWSLambdaTutorial implements RequestHandler<RequestBody, String> {

    @Override
    public String handleRequest(RequestBody requestBody, Context context)
    {
        try
        {
            JSONObject jsonObject  = new JSONObject(requestBody.getBody());
            return "Your name is " + jsonObject.getString("name") +
                    ", you are " + jsonObject.getInt("age") +
                    " years old, and you are a " + jsonObject.getString("gender") + ".";
        } catch (Exception e)
        {
            throw new RuntimeException("Input body does not contains the required variables: " + e.getMessage());
        }
    }
}
