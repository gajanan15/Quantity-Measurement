package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    private static QuantityMeasurement quantityMeasurement;
    private double inch1, inch2;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    //    ************************************************FEET*******************************************************

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.FEET, 0.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0FeetAnd1Feet_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenNullValueForFeet_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnLengthType(UnitType.FEET, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenReferenceForFeet_IfEqual_ShouldReturnTrue() {
        assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenType_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheck_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 2.2);
        inch2 = quantityMeasurement.returnLengthType(UnitType.FEET, 2.2);
        assertEquals(inch1, inch2, 0.0);
    }

    //    ************************************************INCH*******************************************************

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 0.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenNullValueForInch_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnLengthType(UnitType.INCH, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenReferenceForInch_IfEqual_ShouldReturnTrue() {
        assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTypeForInch_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheckForInch_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 2.2);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 2.2);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0FeetAnd0Inch_IfEquals_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 0.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1FeetAnd12Inch_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        assertEquals(12, inch1, 0.0);
    }

    @Test
    public void given12InchAnd1Feet_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 12.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        assertEquals(inch1, inch2, 0.0);
    }

    //    ************************************************YARD*******************************************************

    @Test
    public void given0FeetAnd0Yard_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.YARD, 0.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1FeetAnd0Yard_WhenNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.YARD, 0.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenNullValueForYard_WhenEqual_ShouldReturnTrue() {
        try {
            quantityMeasurement.returnLengthType(UnitType.YARD, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given3FeetAnd1Yard_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 3.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.YARD, 1.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1FeetAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.YARD, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1InchAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.YARD, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1YardAnd36Inch_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.YARD, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 36.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given36InchAnd1Yard_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 36.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.YARD, 1.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1YardAnd3Feet_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.YARD, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.FEET, 3.0);
        assertEquals(inch1, inch2, 0.0);
    }

    //    ************************************************CENTIMETER*******************************************************

    @Test
    public void given0CentimeterAnd0Centimeter_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.CENTIMETER, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.CENTIMETER, 0.0);
        assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0CentimeterAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.CENTIMETER, 0.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 1.0);
        assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenNullValueForCentimeter_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnLengthType(UnitType.CENTIMETER, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given2InchAnd5Centimeter_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 2.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.CENTIMETER, 5.0);
        assertEquals(inch1, inch2, 0.0);
    }

    //    ************************************************ADD TWO LENGTHS*******************************************************

    @Test
    public void given2InchAnd2Inch_WhenEqualTo4Inch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 2.0);
        assertEquals(4.0, (inch1 + inch1), 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenEqualTo14Inch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.INCH, 2.0);
        assertEquals(14.0, (inch1 + inch2), 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenEqualTo24Inch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.FEET, 1.0);
        assertEquals(24.0, (inch1 + inch1), 0.0);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_WhenEqualTo3Inch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnLengthType(UnitType.INCH, 2.0);
        inch2 = quantityMeasurement.returnLengthType(UnitType.CENTIMETER, 2.5);
        assertEquals(3.0, (inch1 + inch2), 0.0);
    }

    //    ++++++++++++++++++++++++++++++++++++++++++++++++Volume+++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //    ************************************************Gallon*******************************************************

    @Test
    public void given0GallonAnd0Gallon_WhenEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.GALLON, 0.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.GALLON, 0.0);
        assertEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void given0GallonAnd0Litre_WhenEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.GALLON, 0.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.LITRE, 0.0);
        assertEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void given0GallonAnd1Litre_WhenNotEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.GALLON, 0.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.LITRE, 1.0);
        assertNotEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void givenNullValueForGallon_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnLengthType(UnitType.GALLON, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    //    ************************************************Litre*******************************************************

    @Test
    public void given0LitreAnd0Litre_WhenEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.LITRE, 0.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.LITRE, 0.0);
        assertEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void given0LitreAnd0Millilitre_WhenEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.LITRE, 0.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.MILLILITRE, 0.0);
        assertEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void given0LitreAnd1Millilitre_WhenNotEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.LITRE, 0.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.MILLILITRE, 1.0);
        assertNotEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void givenNullValueForLitre_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnLengthType(UnitType.LITRE, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    //    ************************************************Millilitre*******************************************************

    @Test
    public void given0MillilitreAnd0Millilitre_WhenEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.MILLILITRE, 0.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.MILLILITRE, 0.0);
        assertEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void givenNullValueForMillilitre_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnLengthType(UnitType.MILLILITRE, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.GALLON, 1.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.LITRE, 3.785);
        assertEquals(millilitre1, millilitre2, 0.0);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenEqual_ShouldReturnTrue() {
        double millilitre1 = quantityMeasurement.returnLengthType(UnitType.LITRE, 1.0);
        double millilitre2 = quantityMeasurement.returnLengthType(UnitType.MILLILITRE, 1000.0);
        assertEquals(millilitre1, millilitre2, 0.0);
    }
}
