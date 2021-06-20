package com.bridgelabz;
// used Integer object and compareTo To test MaximumNumber
public class FindMaximum {
    public static Integer compareIntegerMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
     Integer maximumNumber = firstNumber;
     if (secondNumber.compareTo(maximumNumber)>0)
         maximumNumber = secondNumber;
     if (thirdNumber.compareTo(maximumNumber)>0)
         maximumNumber = thirdNumber;
     return maximumNumber;
    }

    public static Float compareFloatMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumNumber = firstNumber;
        if (secondNumber.compareTo(maximumNumber)>0)
            maximumNumber = secondNumber;
        if (thirdNumber.compareTo(maximumNumber)>0)
            maximumNumber = thirdNumber;
        return maximumNumber;
    }
}
