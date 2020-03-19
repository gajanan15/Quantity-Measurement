package com.measurement;

import static com.measurement.UnitType.CELSIUS;

public class QuantityMeasurement {

    public double returnUnitType(UnitType type, Double unit) {
        return unit * type.conversionUnit;
    }

    public Double returnTemperature(UnitType type, Double unit) {
        Double fahrenheit = unit;
        if (type.equals(CELSIUS)) {
            fahrenheit = (unit * (9.0 / 5)) + 32;
        }
        return fahrenheit;
    }

    public Double add(Double unit1, Double unit2) {
        return unit1 + unit2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() == obj.getClass())
            return true;
        if (obj == this)
            return true;
        return super.equals(obj);
    }
}
