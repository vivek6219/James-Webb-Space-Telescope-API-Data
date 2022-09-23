package com.jwst.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    public String id;
    @JsonProperty("observation_id")
    public String observationId;
    @JsonProperty("program")
    public String program;
    @JsonProperty("details")
    public Details details;
    @JsonProperty("file_type")
    public String fileType;
    @JsonProperty("thumbnail")
    public String thumbnail;
    @JsonProperty("location")
    public String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObservationId() {
        return observationId;
    }

    public void setObservationId(String observationId) {
        this.observationId = observationId;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Body{" +
                "id='" + id + '\'' +
                ", observation_id='" + observationId + '\'' +
                ", program='" + program + '\'' +
                ", details=" + details +
                ", file_type='" + fileType + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

