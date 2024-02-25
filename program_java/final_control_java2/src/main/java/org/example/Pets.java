package org.example;

import org.json.simple.JSONObject;

public class Pets implements ViewInterface{
    private JSONObject dataPets = new JSONObject();
    public JSONObject getDataPets() {
        return dataPets;
    }
    public void copyData (){
        dataPets = (JSONObject) fileJson.getData().clone();
    }
}

