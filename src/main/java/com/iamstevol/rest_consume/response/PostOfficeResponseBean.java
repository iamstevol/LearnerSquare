package com.iamstevol.rest_consume.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iamstevol.rest_consume.entity.PostOfficeDetailsBean;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PostOfficeResponseBean {
    @JsonProperty("Message")
    private String message;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("PostOffice")
    private List<PostOfficeDetailsBean> postOffice;
}
