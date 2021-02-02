package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import data.PreferenceData;
import service.PreferenceService;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;


public class PreferenceController {


    private static Gson gson = new GsonBuilder().create();
    private static Map<String, PreferenceData> preferences = new HashMap<>();

    public static Object create(Request request, Response response) throws MPException {

        String json_preference = request.body();

        PreferenceData preferenceData = gson.fromJson(json_preference, PreferenceData.class);

        /*if(preferenceData == null){
            response.status(400);
            return "Preference not create";
        }*/

        PreferenceService preferenceService = new PreferenceService();

        Preference preference = preferenceService.criarPreferencia(preferenceData.getTitle(), preferenceData.getQuantity(), preferenceData.getDescription(), preferenceData.getUnitPrice());
        return gson.toJson(preference);
    }
}
