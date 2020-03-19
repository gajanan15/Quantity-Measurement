package com.measurement;

import static com.measurement.UnitType.CELSIUS;

public class QuantityMeasurement {

    public double unit;

    public double returnUnitType(UnitType type, Double unit) {
        if (type.equals(CELSIUS)) {
            return ((unit * type.conversionUnit) + 32);
        }
        return unit * type.conversionUnit;
    }

    public Double addConversion(Double unit1, Double unit2) {
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
        QuantityMeasurement quantity = (QuantityMeasurement) obj;
        return this.compare(quantity.unit, unit);
    }

    private boolean compare(double unit1, double unit2) {
        return Double.compare(unit1, unit2) == 0;
    }
}
