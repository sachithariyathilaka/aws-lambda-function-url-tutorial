package io.github.sachithariyathilaka.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Request body model for the aws lambda functional url test.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/06
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestBody {
    private Object headers;
    private boolean isBase64Encoded;
    private String rawPath;
    private String routeKey;
    private Object requestContext;
    private String body;
    private String version;
    private String rawQueryString;
}
