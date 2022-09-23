package com.jwst.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {
    @JsonProperty("mission")
    public String mission;
    @JsonProperty("instruments")
    public List<Instruments> instruments;
    public String suffix;
    public String description;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public List<Instruments> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instruments> instruments) {
        this.instruments = instruments;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Details{" +
                "mission='" + mission + '\'' +
                ", instruments=" + instruments +
                ", suffix='" + suffix + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
