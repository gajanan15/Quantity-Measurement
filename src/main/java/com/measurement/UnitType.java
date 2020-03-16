package com.measurement;

public enum UnitType {
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36.0), CENTIMETER(1 / 2.5),
    GALLON(1 * 3785), LITRE(1 * 1000), MILLILITRE(1.0);

    public final double conversionUnit;

    UnitType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}