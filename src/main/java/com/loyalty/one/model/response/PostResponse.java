package com.loyalty.one.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Suresh Chaudhari
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostResponse {

    private Integer postId;
    private String username;
    private String content;
    private String city;
    private Float latitude;
    private Float longitude;
    private Float temperature;
    private String createdDate;

}
