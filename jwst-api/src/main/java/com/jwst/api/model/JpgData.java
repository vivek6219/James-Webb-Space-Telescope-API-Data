package com.jwst.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JpgData {

    @JsonProperty("statusCode")
    public String statusCode;
    @JsonProperty("body")
    public List<Body> body;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public List<Body> getBody() {
        return body;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "JpgData{" +
                "statusCode='" + statusCode + '\'' +
                ", body=" + body +
                '}';
    }
}
