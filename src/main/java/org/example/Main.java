package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(faculty(5));
    }

    public static int faculty(int value) {
        if (value < 0) {
            return 0;
        }

        int facValue = 1;

        //// with for loop////////

    /*for(int i = 1;i<=value;i++){
        System.out.println(i);
       facValue = fakValue * i;

    }*/

        //// with for loop////////

        int index = 1;
        while (index <= value) {
            facValue = facValue * index;
            index++;
        }
        return facValue;
    }

}