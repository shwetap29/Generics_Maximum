package com.bridgelabz;

//Generic class to Take In 3 variables
public class FindMaximum<E extends Comparable> {
    E[] values;

    @SafeVarargs
    public FindMaximum(E ...values){
        this.values = values;
    }
    public E testMax(){
        return (E) compareMaximum(values);
    }

    @SafeVarargs
    public static < E extends Comparable<E>> E compareMaximum(E ...values) {
        E maximumNumber = values[0];
        for (int i = 1; i < values.length; i++) {
            if (maximumNumber.compareTo(values[i]) < 0) {
                maximumNumber = values[i];
            }
        }
        return maximumNumber;
    }
}



