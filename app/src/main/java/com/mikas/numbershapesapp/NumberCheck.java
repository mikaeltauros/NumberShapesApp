package com.mikas.numbershapesapp;

/*
 * Created by Mikas on 24/09/2017.
 */

public class NumberCheck {

    int number;

    public NumberCheck(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isSquare(){
        double squareRoot = Math.sqrt(number);

        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isTriangular(){
        int TriangularNumber = 1;

        for (int x = 1; TriangularNumber < number; x++) {
            TriangularNumber = TriangularNumber + x;
        }

        if (TriangularNumber == number) {
            return true;
        }else {
            return false;
        }
    }
}
