package com.bridgelabz;

//Generic class to Take In 3 variables
public class FindMaximum<E extends Comparable> {
    E first, second, third;

    public FindMaximum(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public  E compareMaximum() {
        E maximumNumber = first;
        if (second.compareTo(maximumNumber)>0)
            maximumNumber = second;
        if (third.compareTo(maximumNumber)>0)
            maximumNumber = third;
        return maximumNumber;
    }
}



