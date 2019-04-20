package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestResponse {

    @SerializedName("success")
    private Boolean success;

    @SerializedName("data")
    private List<Player> data;

    public List<Player> getResult() {
        return data;
    }

    public Boolean getMessages() {
        return success;
    }
}