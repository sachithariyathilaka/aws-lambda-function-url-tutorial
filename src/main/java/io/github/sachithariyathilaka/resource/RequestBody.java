package io.github.sachithariyathilaka.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
