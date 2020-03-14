package com.measurement;

public class QuantityMeasurement {

    public double returnFeet(double feet) {
        return feet;
    }

    public double returnInch(double inch) {
        return inch;
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
