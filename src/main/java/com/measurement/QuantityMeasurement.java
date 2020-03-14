package com.measurement;

public class QuantityMeasurement {


    public double returnLengthType(LengthType type, double unit) {
        return unit * type.conversionUnit;
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
