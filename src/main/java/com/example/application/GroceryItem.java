package com.example.application;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class GroceryItem {

    @NotBlank
    private String name;

    @NotNull
    @Min(value = 1)
    private Integer quantity;

    private String subScription;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSubScription() {
        return subScription;
    }

    public void setSubScription(String subScription) {
        this.subScription = subScription;
    }
}
