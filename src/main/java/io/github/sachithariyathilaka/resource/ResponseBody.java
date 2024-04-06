package io.github.sachithariyathilaka.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Response body model for the aws lambda functional url test.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/06
 */@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBody {
    private String name;
    private int age;
    private String gender;
}
