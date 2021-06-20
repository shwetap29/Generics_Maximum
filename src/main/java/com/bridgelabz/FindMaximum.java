package com.bridgelabz;

//Generic class to Take In 3 variables
public class FindMaximum<E extends Comparable> {
    E[] values;

    @SafeVarargs
    public FindMaximum(E ...values){
        this.values = values;
    }
    public E testMax(){
        E maximumNumber = (E) compareMaximum(values);
        printMaximum(maximumNumber);
        return (E) compareMaximum(values);
    }
    public void printMaximum(E maximumNumber){
        System.out.println("Maximum is :" + maximumNumber + "\n");
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



