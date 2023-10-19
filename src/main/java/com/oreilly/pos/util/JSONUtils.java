package com.oreilly.pos.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JSONUtils {
    private static final Gson gson = new Gson();

    public static String extractTenderType(String invoiceData) {
        return gson.fromJson(invoiceData, JsonObject.class)
                .get("tenderDetails")
                .getAsJsonObject()
                .get("type")
                .getAsString();
    }

}
