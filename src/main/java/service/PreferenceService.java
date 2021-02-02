package service;

import com.mercadopago.MercadoPago;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.Item;
import com.mercadopago.resources.datastructures.preference.Payer;

public class PreferenceService {

    public Preference criarPreferencia (String title, Integer quantity, String description, Float unitPrice) throws MPException {

        // Agrega credenciales
        MercadoPago.SDK.setAccessToken("APP_USR-3154206633105477-012713-b7f50bc11b9e22e12e8301d4f5e9fd60-707289365");

        // Crea un objeto de preferencia
        Preference preference = new Preference();

        // Crea un ítem en la preferencia
        Item item = new Item();
        System.out.println(item.getDescription());
        item.setTitle(title)
                .setQuantity(quantity)
                .setDescription(description)
                .setUnitPrice((float) unitPrice);

        preference.appendItem(item);

        //preference.setPayer(new Payer());
        Payer payer = new Payer();
        payer.setEmail("emailTest@test.com");
        preference.setPayer(payer);

        preference.save();

        return preference;
    }
}
