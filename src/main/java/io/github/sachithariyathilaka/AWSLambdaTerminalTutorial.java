package io.github.sachithariyathilaka;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.github.sachithariyathilaka.resource.ResponseBody;

/**
 * Main class for the aws lambda functional url terminal test.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/06
 */

public class AWSLambdaTerminalTutorial implements RequestHandler<ResponseBody, String> {

    @Override
    public String handleRequest(ResponseBody responseBody, Context context) {
        return "Your name is " + responseBody.getName() +
                ", you are " + responseBody.getAge() +
                " years old, and you are a " + responseBody.getGender() + ".";
    }
}
