package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    private static QuantityMeasurement quantityMeasurement;
    private double length1, length2;
    private double volume1, volume2;
    private double weight1, weight2;
    private double temperature1, temperature2;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    //    ************************************************FEET*******************************************************

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.FEET, 0.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given0FeetAnd1Feet_IfNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void givenNullValueForFeet_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.FEET, null);
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
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 2.2);
        length2 = quantityMeasurement.returnUnitType(UnitType.FEET, 2.2);
        assertEquals(length1, length2, 0.0);
    }

    //    ************************************************INCH*******************************************************

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 0.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 1.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void givenNullValueForInch_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.INCH, null);
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
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 2.2);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 2.2);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given0FeetAnd0Inch_IfEquals_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 0.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 1.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_IfNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void given1FeetAnd12Inch_IfEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        assertEquals(12, length1, 0.0);
    }

    @Test
    public void given12InchAnd1Feet_IfEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 12.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        assertEquals(length1, length2, 0.0);
    }

    //    ************************************************YARD*******************************************************

    @Test
    public void given0FeetAnd0Yard_WhenEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.YARD, 0.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given1FeetAnd0Yard_WhenNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.YARD, 0.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void givenNullValueForYard_WhenEqual_ShouldReturnTrue() {
        try {
            quantityMeasurement.returnUnitType(UnitType.YARD, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given3FeetAnd1Yard_WhenEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 3.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.YARD, 1.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given1FeetAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.YARD, 1.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void given1InchAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.YARD, 1.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void given1YardAnd36Inch_WhenEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.YARD, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 36.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given36InchAnd1Yard_WhenEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 36.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.YARD, 1.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given1YardAnd3Feet_WhenEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.YARD, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.FEET, 3.0);
        assertEquals(length1, length2, 0.0);
    }

    //    ************************************************CENTIMETER*******************************************************

    @Test
    public void given0CentimeterAnd0Centimeter_IfEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.CENTIMETER, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.CENTIMETER, 0.0);
        assertEquals(length1, length2, 0.0);
    }

    @Test
    public void given0CentimeterAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.CENTIMETER, 0.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 1.0);
        assertNotEquals(length1, length2, 0.0);
    }

    @Test
    public void givenNullValueForCentimeter_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.CENTIMETER, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given2InchAnd5Centimeter_IfEqual_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 2.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.CENTIMETER, 5.0);
        assertEquals(length1, length2, 0.0);
    }

    //    ************************************************ADD TWO LENGTHS*******************************************************

    @Test
    public void given2InchAnd2Inch_WhenEqualTo4Inch_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 2.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 2.0);
        Double finalResult = quantityMeasurement.addConversion(length1, length2);
        assertEquals(4.0, finalResult, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenEqualTo14Inch_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.INCH, 2.0);
        Double finalResult = quantityMeasurement.addConversion(length1, length2);
        assertEquals(14.0, finalResult, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenEqualTo24Inch_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.FEET, 1.0);
        Double finalResult = quantityMeasurement.addConversion(length1, length2);
        assertEquals(24.0, finalResult, 0.0);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_WhenEqualTo3Inch_ShouldReturnTrue() {
        length1 = quantityMeasurement.returnUnitType(UnitType.INCH, 2.0);
        length2 = quantityMeasurement.returnUnitType(UnitType.CENTIMETER, 2.5);
        Double finalResult = quantityMeasurement.addConversion(length1, length2);
        assertEquals(3.0, finalResult, 0.0);
    }


    //    ++++++++++++++++++++++++++++++++++++++++++++++++Volume+++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //    ************************************************Gallon*******************************************************

    @Test
    public void given0GallonAnd0Gallon_WhenEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.GALLON, 0.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.GALLON, 0.0);
        assertEquals(volume1, volume2, 0.0);
    }

    @Test
    public void given0GallonAnd0Litre_WhenEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.GALLON, 0.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.LITRE, 0.0);
        assertEquals(volume1, volume2, 0.0);
    }

    @Test
    public void given0GallonAnd1Litre_WhenNotEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.GALLON, 0.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.LITRE, 1.0);
        assertNotEquals(volume1, volume2, 0.0);
    }

    @Test
    public void givenNullValueForGallon_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.GALLON, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    //    ************************************************Litre*******************************************************

    @Test
    public void given0LitreAnd0Litre_WhenEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.LITRE, 0.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.LITRE, 0.0);
        assertEquals(volume1, volume2, 0.0);
    }

    @Test
    public void given0LitreAnd0Millilitre_WhenEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.LITRE, 0.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.MILLILITRE, 0.0);
        assertEquals(volume1, volume2, 0.0);
    }

    @Test
    public void given0LitreAnd1Millilitre_WhenNotEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.LITRE, 0.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.MILLILITRE, 1.0);
        assertNotEquals(volume1, volume2, 0.0);
    }

    @Test
    public void givenNullValueForLitre_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.LITRE, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    //    ************************************************Millilitre*******************************************************

    @Test
    public void given0MillilitreAnd0Millilitre_WhenEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.MILLILITRE, 0.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.MILLILITRE, 0.0);
        assertEquals(volume1, volume2, 0.0);
    }

    @Test
    public void givenNullValueForMillilitre_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.MILLILITRE, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.GALLON, 1.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.LITRE, 3.785);
        assertEquals(volume1, volume2, 0.0);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenEqual_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.LITRE, 1.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.MILLILITRE, 1000.0);
        assertEquals(volume1, volume2, 0.0);
    }

    //    ************************************************Add Volumes In Litres*******************************************************

    @Test
    public void given1GallonAnd3Point78Litre_WhenEqualTo7Point57Litre_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.GALLON, 1.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.LITRE, 3.785);
        Double finalResult = quantityMeasurement.addConversion(volume1, volume2);
        assertEquals(7.57, finalResult, 0.0);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenEqualTo2Litre_ShouldReturnTrue() {
        volume1 = quantityMeasurement.returnUnitType(UnitType.LITRE, 1.0);
        volume2 = quantityMeasurement.returnUnitType(UnitType.MILLILITRE, 1000.0);
        Double finalResult = quantityMeasurement.addConversion(volume1, volume2);
        assertEquals(2.0, finalResult, 0.0);
    }

    //    ++++++++++++++++++++++++++++++++++++++++++++++++Weight+++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //    ************************************************Kilograms*******************************************************

    @Test
    public void given0KilogramAnd0Kilogram_WhenEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.KILOGRAM, 0.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.KILOGRAM, 0.0);
        assertEquals(weight1, weight2, 0.0);
    }

    @Test
    public void given0KilogramAnd0Gram_WhenEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.KILOGRAM, 0.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.GRAM, 0.0);
        assertEquals(weight1, weight2, 0.0);
    }

    @Test
    public void given0KilogramAnd1Gram_WhenNotEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.KILOGRAM, 0.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.GRAM, 1.0);
        assertNotEquals(weight1, weight2, 0.0);
    }

    @Test
    public void givenNullValueForKilogram_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.KILOGRAM, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    //    ************************************************Tonne*******************************************************

    @Test
    public void given0TonneAnd0Tonne_WhenEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.TONNE, 0.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.TONNE, 0.0);
        assertEquals(weight1, weight2, 0.0);
    }

    @Test
    public void given0TonneAnd0Gram_WhenEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.TONNE, 0.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.GRAM, 0.0);
        assertEquals(weight1, weight2, 0.0);
    }

    @Test
    public void given0TonneAnd1Gram_WhenNotEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.TONNE, 0.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.GRAM, 1.0);
        assertNotEquals(weight1, weight2, 0.0);
    }

    @Test
    public void givenNullValueForTonne_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.TONNE, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    //    ************************************************Gram*******************************************************

    @Test
    public void given0GramAnd0Gram_WhenEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.GRAM, 0.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.GRAM, 0.0);
        assertEquals(weight1, weight2, 0.0);
    }

    @Test
    public void givenNullValueForGram_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.GRAM, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.KILOGRAM, 1.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.GRAM, 1000.0);
        assertEquals(weight1, weight2, 0.0);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenEqual_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.TONNE, 1.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.KILOGRAM, 1000.0);
        assertEquals(weight1, weight2, 0.0);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenEqualTo1001Kilogram_ShouldReturnTrue() {
        weight1 = quantityMeasurement.returnUnitType(UnitType.TONNE, 1.0);
        weight2 = quantityMeasurement.returnUnitType(UnitType.GRAM, 1000.0);
        Double finalResult = quantityMeasurement.addConversion(weight1, weight2);
        assertEquals(1001.0, finalResult, 0.0);
    }

    //    ++++++++++++++++++++++++++++++++++++++++++++++++Temperature+++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //    ************************************************Fahrenheit*******************************************************

    @Test
    public void given0FahrenheitAnd0Fahrenheit_WhenEqual_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.returnUnitType(UnitType.FAHRENHEIT, 0.0);
        temperature2 = quantityMeasurement.returnUnitType(UnitType.FAHRENHEIT, 0.0);
        assertEquals(temperature1, temperature2, 0.0);
    }

    @Test
    public void given0FahrenheitAnd0Celsius_WhenEqual_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.returnUnitType(UnitType.FAHRENHEIT, 32.0);
        temperature2 = quantityMeasurement.returnUnitType(UnitType.CELSIUS, 0.0);
        assertEquals(temperature1, temperature2, 0.0);
    }

    @Test
    public void given0FahrenheitAnd1Celsius_WhenNotEqual_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.returnUnitType(UnitType.FAHRENHEIT, 0.0);
        temperature2 = quantityMeasurement.returnUnitType(UnitType.CELSIUS, 15.0);
        assertNotEquals(temperature1, temperature2, 0.0);
    }

    @Test
    public void givenNullValueForFahrenheit_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.FAHRENHEIT, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    //    ************************************************Celsius*******************************************************

    @Test
    public void given0CelsiusAnd0Celsius_WhenEqual_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.returnUnitType(UnitType.CELSIUS, 0.0);
        temperature2 = quantityMeasurement.returnUnitType(UnitType.CELSIUS, 0.0);
        assertEquals(temperature1, temperature2, 0.0);
    }

    @Test
    public void givenNullValueForCelsius_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnitType(UnitType.CELSIUS, null);
        } catch (NullPointerException e) {
            assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenEqual_ShouldReturnTrue() {
        temperature1 = quantityMeasurement.returnUnitType(UnitType.FAHRENHEIT, 212.0);
        temperature2 = quantityMeasurement.returnUnitType(UnitType.CELSIUS, 100.0);
        assertEquals(temperature1, temperature2, 0.0);
    }
}