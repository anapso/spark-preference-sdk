package data;

import java.util.ArrayList;
import java.util.List;

public class PreferenceData {

    private static List<PreferenceData> preferences = new ArrayList<>();

    private String id;
    private String title;
    private Integer quantity;
    private String description;
    private Float unitPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Preference{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", unit_price=" + unitPrice +
                '}';
    }

}
