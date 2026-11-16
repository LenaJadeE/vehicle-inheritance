package com.pluralsight;

public class Moped {

    private boolean basketIncluded;
    private String helmetColor;
    private boolean kickstandIncluded;

    public boolean isBasketIncluded() {
        return basketIncluded;
    }

    public void setBasketIncluded(boolean basketIncluded) {
        this.basketIncluded = basketIncluded;
    }

    public String getHelmetColor() {
        return helmetColor;
    }

    public void setHelmetColor(String helmetColor) {
        this.helmetColor = helmetColor;
    }

    public boolean isKickstandIncluded() {
        return kickstandIncluded;
    }

    public void setKickstandIncluded(boolean kickstandIncluded) {
        this.kickstandIncluded = kickstandIncluded;
    }
}
