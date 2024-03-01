package org.example;

import org.json.simple.JSONObject;

public class PackAnimals implements ViewInterface {
    private JSONObject dataPack = new JSONObject();

    public JSONObject getDataPack() {
        return dataPack;
    }

    public void copyData() {
        dataPack = (JSONObject) fileJson.getData().clone();
    }
}
